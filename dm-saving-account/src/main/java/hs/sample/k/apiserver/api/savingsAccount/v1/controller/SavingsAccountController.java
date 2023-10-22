package hs.sample.k.apiserver.api.savingsAccount.v1.controller;


import hs.sample.k.apiserver.api.savingsAccount.v1.SavingsAccountApi;
import hs.sample.k.apiserver.api.savingsAccount.v1.service.CustomerProvider;
import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityRequest;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//@RestController(value = "/api/v1")
@RestController
@Slf4j
@RequiredArgsConstructor
public class SavingsAccountController implements SavingsAccountApi
{

    private final CustomerProvider delegate;

//    @Override
//    public ResponseEntity<RegisterPartyReferenceDataDirectoryEntryRequest> registerPartyReferenceDataDirectoryEntry(
//            RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest) {
//
//        log.info("request ==> {}", registerPartyReferenceDataDirectoryEntryRequest);
//        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry request = registerPartyReferenceDataDirectoryEntryRequest.getPartyReferenceDataDirectoryEntry();
//
//        delegate.register(registerPartyReferenceDataDirectoryEntryRequest);
//
//        RegisterPartyReferenceDataDirectoryEntryRequest response = new RegisterPartyReferenceDataDirectoryEntryRequest();
//        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry
//                = new RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry();
//
//
//
//        log.info("request.getDirectoryEntryDateType() {}",request.getDirectoryEntryDateType());
//        partyReferenceDataDirectoryEntry.setDirectoryEntryDateType(
//                request.getDirectoryEntryDateType()
//        );
//
//        response.setPartyReferenceDataDirectoryEntry(partyReferenceDataDirectoryEntry);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }


    @Override
    public ResponseEntity<InitiateSavingsAccountFacilityResponse> initiate(
        InitiateSavingsAccountFacilityRequest body) {
        return null;
    }
}
