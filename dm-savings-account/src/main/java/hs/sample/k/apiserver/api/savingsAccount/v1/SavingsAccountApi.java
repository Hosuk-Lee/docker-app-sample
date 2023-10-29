package hs.sample.k.apiserver.api.savingsAccount.v1;

import hs.sample.k.apiserver.model.HTTPError;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityRequest;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityResponse;
import hs.sample.k.apiserver.model.RetrieveSavingsAccountFacilityResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Tag(name = "PartyReferenceDataDirectory", description = "PartyReferenceData API")
public interface SavingsAccountApi {

//    public OneProvider getDelegate();

    /**
     * POST /SavingsAccount/Initiate
     *
     * @return 생성 응답 (status code 201)
     */
//    @Operation(summary = "SavingsAccount API", operationId = "partyReferenceDataDirectoryEntryRegister", description = "Sample Service description", tags={ "API", "Sample" })
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", description = ""),  })
//    @PostMapping(
//            value = "/SavingsAccount/Initiate",
//            produces = { "application/json" },
//            consumes = { "application/json" }
//    )

    @Operation(summary = "InCR Initiate A new savings account", description = "InCR Initiate A new savings account", tags={ "CR - SavingsAccountFacility" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "InitiateSavingsAccountFacilityResponse", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InitiateSavingsAccountFacilityResponse.class))),

        @ApiResponse(responseCode = "400", description = "BadRequest", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "404", description = "NotFound", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "429", description = "TooManyRequests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "500", description = "InternalServerError", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class)))
    })
    @RequestMapping(value = "/SavingsAccount/Initiate",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InitiateSavingsAccountFacilityResponse> initiate(
        @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema())
        @Valid
        @RequestBody InitiateSavingsAccountFacilityRequest body);
//    public ResponseEntity<RegisterPartyReferenceDataDirectoryEntryRequest> registerPartyReferenceDataDirectoryEntry(
//            @Parameter(description = "")
//            @Valid
//            @RequestBody(required = false)
//                RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest
//    );

    @Operation(summary = "ReCR Retrieve information about a savings account - either standard canned reports or selected instance attribute values", description = "ReCR Retrieve information about a savings account - either standard canned reports or selected instance attribute values", tags={ "CR - SavingsAccountFacility" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "RetrieveSavingsAccountFacilityResponse", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RetrieveSavingsAccountFacilityResponse.class))),

        @ApiResponse(responseCode = "400", description = "BadRequest", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "404", description = "NotFound", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "429", description = "TooManyRequests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "500", description = "InternalServerError", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/SavingsAccount/{savingsaccountid}/Retrieve",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<RetrieveSavingsAccountFacilityResponse> retrieve(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("savingsaccountid") String savingsaccountid);

}
