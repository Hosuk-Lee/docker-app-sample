package com.kb.orchestration.domain.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.common.global.utils.spring.ApplicationContextUtil;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.entity.TransactionTrack;
import com.kb.orchestration.domain.core.entity.TransactionTrack.TransactionLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class TransactionCompensateSvc {

    private final ObjectMapper om;
    private final TransactionManagement tranMgt;

    public void onCompensate(String trxId) throws JsonProcessingException {
        log.info("TransactionCompensateSvc.onCompensate - {}", trxId);
        TransactionTrack transactionTrack = null;
        CmpenTranMgtEntity entity = null;
        try {
            entity = tranMgt.findByTrxId("trxId");
        } catch (BusinessException e) {
            if (GErrorCode.DB_DATA_NOT_FOUND.getCode().equals(e.getErrorCode().getCode())) {
                log.error("{}:: Transaction 정보를 찾지 못하여 강제 정상 응답 처리.", trxId);
                return;
            }
        }

        tranMgt.startCompensate(entity);
        transactionTrack = om.readValue(entity.getTranTrackLogCtnt(), TransactionTrack.class);

        List<TransactionLog> collect = transactionTrack.getTransactionLogs().stream()
            .filter(e -> e.isCompensateTargetYn())
            .sorted(
                Comparator.comparing(TransactionLog::getSequence).reversed()
            ).toList();
        for (TransactionLog log : collect) {
            _compensate(log);
            tranMgt.saveCompensateResult(entity, transactionTrack);
        }
    }

    private void _compensate(TransactionLog tranLog) {
        boolean _result = false;
        Object participant = ApplicationContextUtil.getBean(tranLog.getCompensateBeanName());
        Class<?> clazz = participant.getClass();
        try {
            Method method = clazz.getDeclaredMethod(tranLog.getCompensateBeanName(), Map.class);
            Object invoke = method.invoke(participant, tranLog.getCompensateParamValue());
            _result = true;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            log.error("##ERROR## 보상 거래 실패 오류");
            throw new BusinessException(GErrorCode.SYSTEM_ERROR, GTreatCode.SYSTEM_ERROR,
                "Transaction Compensate Error");
        }
        tranLog.updateCompensateResult(_result);
    }
}
