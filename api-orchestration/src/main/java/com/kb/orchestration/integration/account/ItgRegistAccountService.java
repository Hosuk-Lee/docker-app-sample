package com.kb.orchestration.integration.account;

import com.kb.orchestration.integration.RestHelper;
import com.kb.orchestration.model.Currencycode;
import com.kb.orchestration.model.InitiateSavingsAccountFacilityRequest;
import com.kb.orchestration.model.InitiateSavingsAccountFacilityRequestSavingsAccountFacility;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class ItgRegistAccountService {

    private final RestHelper restHelper;

    public void excute(Map<String, Object> b){

        InitiateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility = new InitiateSavingsAccountFacilityRequestSavingsAccountFacility();
        savingsAccountFacility.setCustomerReference("KB00012345");
        savingsAccountFacility.setBankBranchLocationReference("SE0123");
        savingsAccountFacility.setAccountType("SavingsAccount");
        savingsAccountFacility.setAccountCurrency(new Currencycode().currencycode("KRW"));
        savingsAccountFacility.setLinkType(String.valueOf(b.get("name")));

        // 요청을 보낼 URL
        InitiateSavingsAccountFacilityRequest request = new InitiateSavingsAccountFacilityRequest();
        request.setSavingsAccountFacility(savingsAccountFacility);

        Map account = restHelper.postCall("account", "/SavingsAccount/Initiate", null, null,
                request, Map.class);
        log.info("account {}", account);

    }
}
