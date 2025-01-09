package com.kb.orchestration.api.tranMtg.controller;

import static org.apache.commons.lang3.StringUtils.isEmpty;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.context.CommonContext;
import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.common.global.utils.spring.ApplicationContextUtil;
import com.kb.common.global.utils.spring.PropsUtil;
import com.kb.orchestration.api.tranMtg.controller.saga.SagaEndProcess;
import com.kb.orchestration.domain.core.TransactionManagement;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("tranMgt_tranMgtController")
@RequestMapping("/transaction-management")
public class TranMgtController {

    private final ObjectMapper om;
    private final CommonContext ctx;
    private final TransactionManagement transactionManagement;

    @GetMapping(value = "/{guid}", produces = {
        "application/json"
    })
    public ResponseEntity<Object> inquiryTransactionManagement(
        @PathVariable("guid") String guid) {
        CmpenTranMgtEntity e = transactionManagement.findByGuid(guid);
        return ResponseEntity.ok(e);
    }

    /**
     * 보상명령 (compensate)
     */
    @PostMapping
    // @RequestParam(name = "bean-name") String paramBeanName
    public ResponseEntity<String> compensate() {
//        String beanName;
//        Object participant = ApplicationContextUtil.getBean(beanName);
        return ResponseEntity.ok("compensated");
    }

    /**
     * 오류보고 (to coordinator)
     */
    @PostMapping("/api/saga/cancel")
    public ResponseEntity<String> cancel() {
        String baseGuid = ctx.getGuid();
        String beanName = PropsUtil.getPropValue("saga.end.process.beanName", "sagaEndProcessImpl");

        SagaEndProcess sagaEndProcess = (SagaEndProcess) ApplicationContextUtil.getBean(beanName);
        String tranId = sagaEndProcess.onCancel(baseGuid);

        if (isEmpty(tranId)) {
            throw new BusinessException(
                GErrorCode.ILLEGAL_ARGUMENT, GTreatCode.SYSTEM_ERROR, "transaction id 는 필수 항목입니다.");
        }

        return ResponseEntity.ok("canceled");
    }


}
