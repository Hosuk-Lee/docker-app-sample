package hs.sample.k.savings.domain.savingsAccount.service;

import hs.sample.k.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import hs.sample.k.savings.domain.savingsAccount.repository.CRSavingsAccountFacilityReposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewSavingsAccount {

    private final CRSavingsAccountFacilityReposiroty reposiroty;

    public void execute(CRSavingsAccountFacility crPartyReferenceDataDirectory) {

    }


}
