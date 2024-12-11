package unit.api.accountMgt;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import unit.api.ApiUnitTest;


@DisplayName("계좌관리 Controller 테스트")
public class 계좌관리Controller테스트 extends ApiUnitTest {

    private static String BASE_URL = "api/vq";

    @Test
    void 계좌신규() throws Exception {

        // given
        Mockito.when(BigDecimal.ONE.abs()).thenReturn(BigDecimal.ONE);

        // when
        mockMvc.perform(MockMvcRequestBuilders.get("/members/1")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id", Matchers.is(1)));
        // Add more assertions or actions as needed

        // then


    }


}
