package com.kb.sample.savings.domain.savingsAccount.service;

import com.kb.sample.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import com.kb.sample.savings.domain.savingsAccount.repository.CRSavingsAccountFacilityReposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewSavingsAccount {

    private final CRSavingsAccountFacilityReposiroty reposiroty;

    public void execute(CRSavingsAccountFacility crPartyReferenceDataDirectory) {

    }


}
