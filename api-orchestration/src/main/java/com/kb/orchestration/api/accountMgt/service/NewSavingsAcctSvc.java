package com.kb.orchestration.api.accountMgt.service;

import static com.kb.common.global.utils.JsonUtils.toJson;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import com.kb.common.global.context.CommonContext;
import com.kb.orchestration.api.tranMtg.controller.saga.Saga;
import com.kb.orchestration.domain.core.TransactionLogReqInfo;
import com.kb.orchestration.domain.core.TransactionManagement;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.entity.TransactionTrack.RequestType;
import com.kb.orchestration.domain.core.entity.TransactionTrack.TransactionLog;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class NewSavingsAcctSvc {

    private final CommonContext ctx;
    private final TransactionManagement tranMgt;

    @Saga(compensateBeanName = "transactionCompensateSvc")
    public Object excute(Object request) {
        log.info("NewSavingsAcctSvc.excute()");
        CmpenTranMgtEntity entity = tranMgt.findByGuid(ctx.getStndGuid());
        tranMgt.start(entity, null); // TODO 개선

        log.info("1. Party Reference Data : 고객정보조회");
        log.info("2. Savings Account Validation : 적립식 공통 검증");
        // 직원, 부점, 상품 유효성 등 검증
        log.info("3. Savings Account Customer Product & Service Eligibility : 고객 상품가입 자격 검증");
        log.info("4. Savings Account : 적립식 원장 신규등록");
        log.info("5. Party Authentication : 신규계좌 비밀번호 등록");
        log.info("6. Sales Product Agreement : 상품계약 원장갱신");
        // 계약 원장 관리
        log.info("7. Customer Product and Service Directory : 고객 상품목록 현행화");

        // Pivot
        log.info("8. Passbook : 통장기장");
        log.info("9. Correspondence : 고객 SMS 통지");

        log.info("999. Output 출력데이터 생성");
        // 고객정보 상세, 인스턴스 데이터 등 조회

        return null;
    }

    private void saveTransactionLog(CmpenTranMgtEntity entity,
        TransactionLogReqInfo tran, Object reqData, Map<String, Object> cmpenData) {
        TransactionLog tranLog = TransactionLog.builder()
            .requestTargetName(tran.getCallName())
            .requestType(RequestType.RESTApi.name())
            .requestData(toJson(reqData))
            .compensateBeanName(tran.getBeanName())
            .compensateMethodName(tran.getMethodName())
            .compensateTargetYn(tran.isCmpenYn())
            .compensateParamValue(cmpenData)
            .build();
        tranMgt.addTransactionLog(entity, tranLog);
    }

    @Getter
    @AllArgsConstructor
    private enum CreateionSavingsTranEnum implements TransactionLogReqInfo {
        VALIDATION("NFAASB0001", EMPTY, EMPTY, false),
        ELIGIBILITY("NFAASB0002", EMPTY, EMPTY, false),
        SAVINGS_ACCOUNT("NFAFUB0001", EMPTY, EMPTY, true),
        PRODUCT_AGREEMENT("NFAAGB0001", EMPTY, EMPTY, false);

        private final String callName;
        private final String beanName;
        private final String methodName;
        private final boolean cmpenYn;

    }
}
