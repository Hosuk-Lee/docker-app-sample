package hs.sample.k.apiserver.api.customer.v1.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hs.sample.k.apiserver.api.customer.v1.CustomerApi;
import hs.sample.k.apiserver.api.customer.v1.service.CustomerProvider;
import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationScheme;
import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import hs.sample.k.apiserver.model.Directoryentrydatetypevalues;
import hs.sample.k.apiserver.model.ExecutePartyReferenceDataDirectoryEntryRequest;
import hs.sample.k.apiserver.model.RegisterPartyReferenceDataDirectoryEntryRequest;
import hs.sample.k.apiserver.model.RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry;
import hs.sample.k.apiserver.model.RetrievePartyReferenceDataDirectoryEntryResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//@RestController(value = "/api/v1")
@RestController
@Slf4j
@RequiredArgsConstructor
public class CustomerController implements CustomerApi
{

    private final CustomerProvider delegate;

    @Override
    public ResponseEntity<RegisterPartyReferenceDataDirectoryEntryRequest> registerPartyReferenceDataDirectoryEntry(
            RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest) {

        log.info("request ==> {}", registerPartyReferenceDataDirectoryEntryRequest);
        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry request = registerPartyReferenceDataDirectoryEntryRequest.getPartyReferenceDataDirectoryEntry();

        delegate.register(registerPartyReferenceDataDirectoryEntryRequest);

        RegisterPartyReferenceDataDirectoryEntryRequest response = new RegisterPartyReferenceDataDirectoryEntryRequest();
        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry
                = new RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry();



        log.info("request.getDirectoryEntryDateType() {}",request.getDirectoryEntryDateType());
        partyReferenceDataDirectoryEntry.setDirectoryEntryDateType(
                request.getDirectoryEntryDateType()
        );

        response.setPartyReferenceDataDirectoryEntry(partyReferenceDataDirectoryEntry);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<RetrievePartyReferenceDataDirectoryEntryResponse> retrievePartyReferenceDataDirectoryEntry(
            String partyreferencedatadirectoryid) {
        CRPartyReferenceDataDirectory entity = delegate.retrive(partyreferencedatadirectoryid);

        RetrievePartyReferenceDataDirectoryEntryResponse response = new RetrievePartyReferenceDataDirectoryEntryResponse();
        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry
                = new RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry();
        registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry.setDirectoryEntryDateType(
                Directoryentrydatetypevalues.fromValue(
                        entity.getDirectoryEntryType()
                )
        );

        response.setPartyReferenceDataDirectoryEntry(registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ExecutePartyReferenceDataDirectoryEntryRequest> executePartyReferenceDataDirectoryEntry(
        ExecutePartyReferenceDataDirectoryEntryRequest executePartyReferenceDataDirectoryEntryRequest) {
        ObjectMapper om = new ObjectMapper();
        try {
            log.info("DEBUG :: {}", om.writerWithDefaultPrettyPrinter().writeValueAsString(executePartyReferenceDataDirectoryEntryRequest));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.ok(executePartyReferenceDataDirectoryEntryRequest);
    }

}
