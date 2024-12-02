package com.kb.orchestration.api.tranMtg.controller.saga;

import com.kb.orchestration.domain.core.TransactionManagement;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service(value = "sagaEndProcessImpl")
public class SagaEndProcessImpl implements SagaEndProcess {

    private final TransactionManagement transactionManagement;

    @Override
    public String onClose(String guid) {
        return transactionManagement.findByGuid(guid).getCmpenTranIdnfr();
    }

    @Override
    public String onCancel(String guid) {
        return transactionManagement.findByGuid(guid).getCmpenTranIdnfr();
    }

}
