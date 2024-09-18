package com.kb.orchestration.api.tranMtg.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.orchestration.domain.core.TransactionManagement;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("tranMgt_tranMgtController")
@RequestMapping("/transaction-management")
public class TranMgtController {

    private final ObjectMapper om;
    private final TransactionManagement transactionManagement;

    @GetMapping(value = "/{guid}", produces = {
        "application/json"
    })
    public ResponseEntity<Object> inquiryTransactionManagement(
        @PathVariable("guid") String guid) {

        transactionManagement.findByGuid(guid);


        return null;
    }


}
