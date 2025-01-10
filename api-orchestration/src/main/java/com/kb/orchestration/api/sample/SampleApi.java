package com.kb.orchestration.api.sample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Sample", description = "Sample API")
public interface SampleApi {

    /**
     * GET /sample-inquiry
     *
     * @return 조회 생성 응답 (status code 200)
     */
    @Operation(summary = "Sample API", operationId = "sampleInquiry", description = "Sample Service description"
        , tags = {"API", "Sample"})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "등록 응답"),})
    @GetMapping(
        value = "/sample-inquiry",
//        consumes = {"application/json"},
        produces = {"application/json"}
    )
    default ResponseEntity<Map> sampleInquiry(
//        @RequestBody Map body
    ) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
    }
}
