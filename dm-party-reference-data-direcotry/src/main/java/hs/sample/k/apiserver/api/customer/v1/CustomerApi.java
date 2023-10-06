package hs.sample.k.apiserver.api.customer.v1;

import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationScheme;
import hs.sample.k.apiserver.model.RegisterPartyReferenceDataDirectoryEntryRequest;
import hs.sample.k.apiserver.model.RetrievePartyReferenceDataDirectoryEntryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "PartyReferenceDataDirectory", description = "PartyReferenceData API")
public interface CustomerApi {

//    public OneProvider getDelegate();

    /**
     * POST /PartyReferenceDataDirectory/Register
     *
     * @return 조회 생성 응답 (status code 201)
     */
    @Operation(summary = "PartyReferenceDataDirectory API", operationId = "partyReferenceDataDirectoryEntryRegister", description = "Sample Service description", tags={ "API", "Sample" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = ""),  })
    @PostMapping(
            value = "/PartyReferenceDataDirectory/Register",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<RegisterPartyReferenceDataDirectoryEntryRequest> registerPartyReferenceDataDirectoryEntry(
            @Parameter(description = "")
            @Valid
            @RequestBody(required = false)
                RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest
    );

    /**
     * POST /PartyReferenceDataDirectory/{partyreferencedatadirectoryid}/Retrieve
     *
     * @return 조회 생성 응답 (status code 201)
     */
    @Operation(summary = "PartyReferenceDataDirectory API", operationId = "PartyReferenceDataDirectoryRetrieve", description = "Sample Service description", tags={ "API", "Sample" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = ""),  })
    @GetMapping(
            value = "/PartyReferenceDataDirectory/{partyreferencedatadirectoryid}/Retrieve"
//            ,
//            produces = { "application/json" },
//            consumes = { "application/json" }
    )
    public ResponseEntity<RetrievePartyReferenceDataDirectoryEntryResponse> retrievePartyReferenceDataDirectoryEntry(
            @Parameter(description = "")
            @Valid
            @PathVariable("partyreferencedatadirectoryid")
            String partyreferencedatadirectoryid
    );

}
