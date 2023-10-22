package hs.sample.k.apiserver.api.savingsAccount.v1.service;

import hs.sample.k.apiserver.api.savingsAccount.v1.scheme.CustomerInformationScheme;
import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import hs.sample.k.apiserver.domain.prdd.facory.CRPartyReferenceDataDirectoryFactory;
import hs.sample.k.apiserver.domain.prdd.repository.CRPartyReferenceDataDirectoryReposiroty;
import hs.sample.k.apiserver.domain.prdd.service.CreateNewInstacePrdd;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerProvider {

    // private final SampleApiService sub1ApiService;

    private final CreateNewInstacePrdd createNewInstacePrdd;
    private final CRPartyReferenceDataDirectoryReposiroty repo;


}
