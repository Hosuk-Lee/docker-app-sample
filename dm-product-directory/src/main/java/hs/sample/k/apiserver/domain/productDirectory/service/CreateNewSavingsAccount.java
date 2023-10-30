package hs.sample.k.apiserver.domain.productDirectory.service;

import hs.sample.k.apiserver.domain.productDirectory.entity.CRSavingsAccountFacility;
import hs.sample.k.apiserver.domain.productDirectory.repository.CRSavingsAccountFacilityReposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewSavingsAccount {

    private final CRSavingsAccountFacilityReposiroty reposiroty;
    public void execute(CRSavingsAccountFacility crPartyReferenceDataDirectory) {
        CRSavingsAccountFacility save = reposiroty.save(crPartyReferenceDataDirectory);
    }

}
