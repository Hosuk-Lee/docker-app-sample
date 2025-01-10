package com.kb.sample.savings.domain.transactionManager.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class TransactionSvc {

    private final CompensateSvc compensateSvc;

    public void onCompensate(String tranId) {
        log.info("TransactionSvc.onCompensate - {}", tranId);
        compensateSvc.execute(tranId);
    }
}
