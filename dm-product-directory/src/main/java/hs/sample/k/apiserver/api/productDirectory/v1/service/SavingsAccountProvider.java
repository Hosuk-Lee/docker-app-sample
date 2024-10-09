package hs.sample.k.apiserver.api.productDirectory.v1.service;

import hs.sample.k.apiserver.domain.productDirectory.entity.CRProductDirectory;
import hs.sample.k.apiserver.domain.productDirectory.facory.CRSavingsAccountFacilityFactory;
import hs.sample.k.apiserver.domain.productDirectory.repository.CRProductDirectoryReposiroty;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SavingsAccountProvider {

    // private final SampleApiService sub1ApiService;

//    private final CreateNewSavingsAccount createNewSavingsAccount;
    private final CRProductDirectoryReposiroty repo;

    public CRProductDirectory createNewSavingsAccount(InitiateSavingsAccountFacilityRequest input) {
        CRSavingsAccountFacilityFactory factory = CRSavingsAccountFacilityFactory.createFactory(
            input);
        // TODO Factory Class 안에서 검증로직 추가.
        CRProductDirectory entity = factory.newCRSavingsAccountFacilityEntity();
//        entity = repo.save(entity);
        return entity;
    }


    public CRProductDirectory retrieveSavingsAccountFacility(String savingsaccountid) {
//        return repo.findById(Long.valueOf(savingsaccountid)).orElseThrow();
        return null;
    }
}
