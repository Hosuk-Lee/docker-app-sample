package com.kb.sample.savings.api.transaction.v1.api;


import com.kb.sample.savings.model.HTTPError;
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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Tag(name = "PartyReferenceDataDirectory", description = "PartyReferenceData API")
public interface TranMgtApi {


    /**
     * PUT /tran-manager/compensate
     *
     * @return 생성 응답 (status code 200)
     */
    @Operation(summary = "Transaction Compensate"
        , description = "Transaction Rollback"
        , tags = {"Compensate", "Transaction Manage"})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Void", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Void.class))),

        @ApiResponse(responseCode = "400", description = "BadRequest", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "404", description = "NotFound", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "429", description = "TooManyRequests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),

        @ApiResponse(responseCode = "500", description = "InternalServerError", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class)))
    })
    @RequestMapping(value = "/api/v1/compensate",
        produces = {"application/json"},
        consumes = {"application/json"},
        method = RequestMethod.PUT)
    public ResponseEntity<Void> tranMgtCompensate(
        @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema())
        @Valid
        @RequestHeader String tranId);
}
