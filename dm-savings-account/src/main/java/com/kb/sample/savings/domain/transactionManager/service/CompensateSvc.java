package com.kb.sample.savings.domain.transactionManager.service;

import static com.kb.common.global.utils.CustomUtils.contains;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.common.global.transaction.SagaOriginRecord;
import com.kb.common.global.transaction.SagaOriginRecord.CUDFlag;
import com.kb.sample.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import com.kb.sample.savings.domain.savingsAccount.repository.CRSavingsAccountFacilityReposiroty;
import com.kb.sample.savings.domain.transactionManager.command.CmpenTranMgtCommand;
import com.kb.sample.savings.domain.transactionManager.entity.CmpenTranMgt;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@AllArgsConstructor
@Service
public class CompensateSvc {

    private final CmpenTranMgtCommand command;
    private final ObjectMapper om;

    private final CRSavingsAccountFacilityReposiroty repo101;

    @Transactional
    public void execute(String tranId) {
        log.info("Compensate.execute()");
        // Not Found > 정상리턴
        command.findLockOpt(CmpenTranMgt.builder().cmpenTranIdnfr(tranId).build())
            .ifPresent(
                e -> {
                    MDC.put("guid", e.getGuid());
                    _valid(e);
                    _compensate(e);
                }
            );
        ;
    }

    private void _valid(CmpenTranMgt e) {
        if (contains(e.getCtrlRECORDStusCd(), "1", "2")) {
            throw new BusinessException(
                GErrorCode.SYSTEM_ERROR, GTreatCode.SYSTEM_ERROR,
                "보상거래 상태코드 오류 (진행중) : " + e.getCmpenTranIdnfr());
        }
    }

    private void _compensate(CmpenTranMgt e) {
        log.info("Compensate Debug {}", e);
        if (contains(e.getCtrlRECORDStusCd(), "3")) {
            return; // 종료
        }

        command.updateRecord(e, CmpenTranMgt.builder().ctrlRECORDStusCd("2").build());

        /* 원거래 정보 탐색 후 보상거래 실행 갱신 */
        if (Optional.ofNullable(e.getOrcpyNFAFUB101()).isPresent()) {
            log.info("Table 101 보상처리");
            _compensateNFAFUB101(SagaOriginRecord.toObject(e.getOrcpyNFAFUB101()));
        }

    }

    private void _compensateNFAFUB101(List<SagaOriginRecord> orgRecList) {
        for (SagaOriginRecord orgRec : orgRecList) {
            CRSavingsAccountFacility savingsAccount = om.convertValue(orgRec.getDetailObject(),
                CRSavingsAccountFacility.class);
            if (orgRec.getCudfLag().equals(CUDFlag.CREATE)) {
                repo101.findById(savingsAccount.getId())
                    .ifPresent(repo101::delete);
            } else if (orgRec.getCudfLag().equals(CUDFlag.CREATE)) {
                repo101.findById(savingsAccount.getId())
                    .ifPresent(e -> {
                        e.setAccountCurrency(savingsAccount.getAccountCurrency());
                        e.setAssociations(savingsAccount.getAssociations());
                        e.setDate(savingsAccount.getDate());
                        // ...
                    });

            }
        }
    }
}
