package com.kb.orchestration.api.accountMgt.controller;

import com.kb.orchestration.domain.core.TransactionManagement;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("/account-management")
public class AccountMgtController {

    private final TransactionManagement transactionManagement;

    @PostMapping("/savings/new")
    public ResponseEntity<Object> savingsNew(Map<String, Object> body){

        transactionManagement.regist(body);
        return null;
    }

}
