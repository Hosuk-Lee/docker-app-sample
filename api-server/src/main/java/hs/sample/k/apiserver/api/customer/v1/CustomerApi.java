package hs.sample.k.apiserver.api.customer.v1;

import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationScheme;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Customer", description = "Customer API")
public interface CustomerApi {

//    public OneProvider getDelegate();

    /**
     * GET /customer-information
     *
     * @return 조회 생성 응답 (status code 200)
     */
    @Operation(summary = "Customer API", operationId = "customerInformation", description = "Sample Service description", tags={ "API", "Sample" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "조회 응답"),  })
    @GetMapping(
            value = "/customer-information"
//            produces = { "application/json" },
//            consumes = { "application/json" }
    )
    public ResponseEntity<CustomerInformationScheme> customerInformation();
}
