package com.kb.sample.savings.api.transaction.v1.controller;


import com.kb.sample.savings.api.transaction.v1.api.TranMgtApi;
import com.kb.sample.savings.domain.transactionManager.service.TransactionSvc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TranMgtController implements TranMgtApi {

    private final TransactionSvc transactionSvc;

    @Override
    public ResponseEntity<Void> tranMgtCompensate(String tranId) {
        transactionSvc.onCompensate(tranId);
        return ResponseEntity.ok().build();
    }
}
