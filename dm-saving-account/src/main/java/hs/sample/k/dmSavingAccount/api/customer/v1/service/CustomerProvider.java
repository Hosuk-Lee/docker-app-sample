package hs.sample.k.dmSavingAccount.api.customer.v1.service;

import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationScheme;
import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import hs.sample.k.apiserver.domain.prdd.facory.CRPartyReferenceDataDirectoryFactory;
import hs.sample.k.apiserver.domain.prdd.repository.CRPartyReferenceDataDirectoryReposiroty;
import hs.sample.k.apiserver.domain.prdd.service.CreateNewInstacePrdd;
import hs.sample.k.apiserver.model.RegisterPartyReferenceDataDirectoryEntryRequest;
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

    public void register(RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest) {
        CRPartyReferenceDataDirectoryFactory factory = CRPartyReferenceDataDirectoryFactory.createFactory(
                registerPartyReferenceDataDirectoryEntryRequest
        );
        CRPartyReferenceDataDirectory crPartyReferenceDataDirectory = factory.newCRPartyReferenceDataDirectoryEntity();
        createNewInstacePrdd.execute(crPartyReferenceDataDirectory);
    }

    public CRPartyReferenceDataDirectory retrive(String partyreferencedatadirectoryid) {
        CRPartyReferenceDataDirectory crPartyReferenceDataDirectory = repo.findById(
                Long.valueOf(partyreferencedatadirectoryid)).orElseThrow();
        return crPartyReferenceDataDirectory;
    }

    public ResponseEntity<CustomerInformationScheme> inquirySub(String id) {
        CustomerInformationScheme customerInfo = new CustomerInformationScheme();
        customerInfo.setName("John Doe");
        customerInfo.setPhone("123-456-7890");
        customerInfo.setEmail("john@example.com");
        customerInfo.setHomeAddress("123 Main St, City");
        customerInfo.setWorkplace("ABC Inc.");
        customerInfo.setDepartment("Sales");
        customerInfo.setWorkPhone("987-654-3210");
        customerInfo.setWorkAddress("456 Business Ave, Town");
        customerInfo.setReceiveMail(true);
        customerInfo.setReceivePhoneCalls(false);
        customerInfo.setReceiveSMS(true);
        customerInfo.setReceiveEmail(false);
        return ResponseEntity.status(HttpStatus.OK).body(customerInfo);
    }

}
