package com.kb.orchestration.api.accountMgt.controller;

import com.kb.common.global.context.CommonContext;
import com.kb.orchestration.api.accountMgt.service.NewSavingsAcctSvc;
import com.kb.orchestration.domain.core.TransactionManagement;
import com.kb.orchestration.integration.account.ItgRegistAccountService;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController("accountMgt_accountMgtController")
@RequestMapping("/account-management")
public class AccountMgtController {

    private final CommonContext commonContext;

    private final TransactionManagement transactionManagement;
    private final NewSavingsAcctSvc newSavingsAcctSvc;
    private final ItgRegistAccountService itgRegistAccountService;

    @PostMapping("/savings/new")
    public ResponseEntity<Object> savingsNew(@RequestBody Map<String, Object> body) {
        log.info("body {}", body);
//        if(1==2/2) {
//            throw new BusinessExcpeion(GErrorCode.SYSTEM_LOCK, GTreatCode.BLANK, "HI");
//        }
        log.info("CommonContext Test {},{} ", commonContext, commonContext.getGuid());
        transactionManagement.regist(body);
        newSavingsAcctSvc.excute(body);
        itgRegistAccountService.excute(body);
        return null;
    }

}
