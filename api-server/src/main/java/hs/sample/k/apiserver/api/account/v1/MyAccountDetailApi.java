package hs.sample.k.apiserver.api.account.v1;

import hs.sample.k.apiserver.api.account.v1.scheme.MyAccountDetailScheme;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Customer", description = "Customer API")
public interface MyAccountDetailApi {

//    public OneProvider getDelegate();

    /**
     * GET /customer-account-detail
     *
     * @return 조회 생성 응답 (status code 200)
     */
    @Operation(summary = "Account API", operationId = "myAccountDetail", description = "Account Detail API description", tags={ "API", "Sample" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "조회 응답"),  })
    @GetMapping(
            value = "/my-account-detail"
//            produces = { "application/json" },
//            consumes = { "application/json" }
    )
    public ResponseEntity<MyAccountDetailScheme> myAccountDetail();
}
