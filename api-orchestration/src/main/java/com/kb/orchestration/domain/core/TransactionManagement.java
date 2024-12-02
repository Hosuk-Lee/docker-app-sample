package com.kb.orchestration.domain.core;


import static com.kb.common.global.utils.DateUtils.getSysYms20;
import static com.kb.common.global.utils.JsonUtils.toJson;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.context.CommonContext;
import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.orchestration.domain.core.command.CmpenTranMgtCommand;
import com.kb.orchestration.domain.core.command.dto.RegistTranInfoInDto;
import com.kb.orchestration.domain.core.dto.TrxInfoUpdateDto;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.entity.TransactionTrack;
import com.kb.orchestration.domain.core.entity.TransactionTrack.TransactionLog;
import com.kb.orchestration.domain.core.enums.CTRL_REC_STUS_CD;
import java.util.Map;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class TransactionManagement {

    private final ObjectMapper om;
    private final CmpenTranMgtCommand command;
    private final CommonContext commonContext;

    public CmpenTranMgtEntity regist(Map<String, Object> body) {
        log.info("CommonContext Test {},{} ", commonContext, commonContext.getGuid());
        TransactionTrack transactionTrack = TransactionTrack.builder()
            .inputData(toJson(body))
            .build();

        RegistTranInfoInDto input = RegistTranInfoInDto.builder()
            .guid(String.valueOf(body.getOrDefault("guid", "Dummy")))
            .tranTrackLogCtnt(toJson(transactionTrack))
            .build();
        return command.createTransactionInformation(input);
    }

    public void start(CmpenTranMgtEntity tranMgt, String tranId) {
        // tranId 채번 Or 상속
        if (tranId == null) {
            tranId = "TRX_" + UUID.randomUUID().toString();
        }
        command.updateTransactionInformation(tranMgt,
            CmpenTranMgtEntity.builder()
                .cmpenTranIdnfr(tranId)
                .ctrlRECORDStusCd(CTRL_REC_STUS_CD.START.getCode())
                .build());
    }


    public void updateTrxInfo(CmpenTranMgtEntity entity, TrxInfoUpdateDto dto) {
        CmpenTranMgtEntity.CmpenTranMgtEntityBuilder builder = CmpenTranMgtEntity.builder();
        if (dto.getCtrlRECORDModfiYMS() != null) {
            builder.ctrlRECORDDmndYMS(dto.getCtrlRECORDDmndYMS());
        }
        if (dto.getCtrlRECORDStusCd() != null) {
            builder.ctrlRECORDStusCd(dto.getCtrlRECORDStusCd());
        }
        if (dto.getCtrlRECORDModfiYMS() != null) {
            builder.ctrlRECORDModfiYMS(dto.getCtrlRECORDModfiYMS());
        }
        command.updateTransactionInformation(entity, builder.build());
    }

    public CmpenTranMgtEntity findByGuid(String guid) {
        return command.find(CmpenTranMgtEntity.builder()
            .guid(guid)
            .build());
    }

    public CmpenTranMgtEntity findByTrxId(String trxId) {
        return command.find(CmpenTranMgtEntity.builder()
            .cmpenTranIdnfr(trxId)
            .build());
    }

    public void startCompensate(CmpenTranMgtEntity e) {
        command.updateTransactionInformation(e,
            CmpenTranMgtEntity.builder()
                .ctrlRECORDModfiYMS(getSysYms20())
                .ctrlRECORDFnshYMS(EMPTY)
                .ctrlRECORDStusCd(CTRL_REC_STUS_CD.COMPENSATING.getCode())
                .build());
    }

    public void doneCompensate(CmpenTranMgtEntity e) {
        String sysYms20 = getSysYms20();
        command.updateTransactionInformation(e,
            CmpenTranMgtEntity.builder()
                .ctrlRECORDModfiYMS(sysYms20)
                .ctrlRECORDFnshYMS(sysYms20)
                .ctrlRECORDStusCd(CTRL_REC_STUS_CD.COMPENSATED.getCode())
                .build());
    }

    private static enum RequestType {
        RESTApi,
        Kafka,
        ETC;

        private RequestType() {
        }
    }

    public void addTransactionLog(CmpenTranMgtEntity entity, TransactionLog tranLog) {
        TransactionTrack transactionTrack;
        try {
            transactionTrack = om.readValue(entity.getTranTrackLogCtnt(), TransactionTrack.class);
        } catch (JsonProcessingException e) {
            throw new BusinessException(
                GErrorCode.SYSTEM_ERROR, GTreatCode.SYSTEM_ERROR, "Json Parse Error");
        }
        transactionTrack.addTransactionLog(tranLog);
        command.updateTransactionInformation(entity,
            CmpenTranMgtEntity.builder()
                .tranTrackLogCtnt(toJson(transactionTrack))
                .build());
    }

    public void saveCompensateResult(CmpenTranMgtEntity e, TransactionTrack transactionTrack) {

        command.updateTransactionInformation(e,
            CmpenTranMgtEntity.builder()
                .tranTrackLogCtnt(toJson(transactionTrack))
                .build());
    }


}
