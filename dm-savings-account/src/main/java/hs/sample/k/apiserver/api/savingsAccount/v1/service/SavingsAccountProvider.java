package hs.sample.k.apiserver.api.savingsAccount.v1.service;

import hs.sample.k.apiserver.domain.savingsAccount.entity.CRSavingsAccountFacility;
import hs.sample.k.apiserver.domain.savingsAccount.facory.CRSavingsAccountFacilityFactory;
import hs.sample.k.apiserver.domain.savingsAccount.repository.CRSavingsAccountFacilityReposiroty;
import hs.sample.k.apiserver.domain.savingsAccount.service.CreateNewSavingsAccount;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SavingsAccountProvider {

    // private final SampleApiService sub1ApiService;

    private final CreateNewSavingsAccount createNewSavingsAccount;
    private final CRSavingsAccountFacilityReposiroty repo;

    public CRSavingsAccountFacility createNewSavingsAccount(InitiateSavingsAccountFacilityRequest input){
        CRSavingsAccountFacilityFactory factory = CRSavingsAccountFacilityFactory.createFactory(
            input);
        // TODO Factory Class 안에서 검증로직 추가.
        CRSavingsAccountFacility entity = factory.newCRSavingsAccountFacilityEntity();
        entity = repo.save(entity);
        return entity;
    }


    public CRSavingsAccountFacility retrieveSavingsAccountFacility(String savingsaccountid) {
        return repo.findById(Long.valueOf(savingsaccountid)).orElseThrow();
    }
}
