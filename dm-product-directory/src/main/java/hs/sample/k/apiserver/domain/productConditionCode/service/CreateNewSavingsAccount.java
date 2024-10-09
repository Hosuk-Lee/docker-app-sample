package hs.sample.k.apiserver.domain.productConditionCode.service;

import hs.sample.k.apiserver.domain.productDirectory.entity.CRProductDirectory;
import hs.sample.k.apiserver.domain.productDirectory.repository.CRSavingsAccountFacilityReposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewSavingsAccount {

    private final CRSavingsAccountFacilityReposiroty reposiroty;

    public void execute(CRProductDirectory crPartyReferenceDataDirectory) {
        CRProductDirectory save = reposiroty.save(crPartyReferenceDataDirectory);
    }

}
