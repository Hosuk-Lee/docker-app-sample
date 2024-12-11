package acceptance.accountMgt;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import acceptance.ApiAcceptanceTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

@DisplayName("계좌관리테스트")
public class 계좌관리테스트 extends ApiAcceptanceTest {

    private static String BASE_URL = "api/vq";

    @Test
    void 계좌신규(){
        assertThat(
            금리신규(1L)
        ).isEqualTo(1L);
    }

    private long 금리신규(long l) {
        RestAssured.given().log().all()
            .basePath(BASE_URL)
            .body(new Object())
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .when()
            .post()
            .then()
            .log().all().extract();
        return 1L;
    }
}
