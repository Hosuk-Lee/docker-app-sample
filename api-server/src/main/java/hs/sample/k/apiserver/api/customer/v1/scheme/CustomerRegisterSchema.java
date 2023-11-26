package hs.sample.k.apiserver.api.customer.v1.scheme;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

@Setter
public class CustomerRegisterSchema {

    @Schema(description = "Customer's name")
    @JsonProperty("name")
    private String name;

    @Schema(description = "Customer's phone number")
    @JsonProperty("phone")
    private String phone;

    @Schema(description = "Customer's email address")
    @JsonProperty("email")
    private String email;

    @Schema(description = "Customer's home address")
    @JsonProperty("homeAddress")
    private String homeAddress;

    @Schema(description = "Customer's workplace")
    @JsonProperty("workplace")
    private String workplace;

    @Schema(description = "Customer's department")
    @JsonProperty("department")
    private String department;

    @Schema(description = "Customer's work phone number")
    @JsonProperty("workPhone")
    private String workPhone;

    @Schema(description = "Customer's work address")
    @JsonProperty("workAddress")
    private String workAddress;

    @Schema(description = "Receive mail flag")
    @JsonProperty("receiveMail")
    private boolean receiveMail;

    @Schema(description = "Receive phone calls flag")
    @JsonProperty("receivePhoneCalls")
    private boolean receivePhoneCalls;

    @Schema(description = "Receive SMS flag")
    @JsonProperty("receiveSMS")
    private boolean receiveSMS;

    @Schema(description = "Receive email flag")
    @JsonProperty("receiveEmail")
    private boolean receiveEmail;

    // 생성자, getter 및 setter 메서드는 생략하겠습니다.
    // 필요에 따라 생성자와 getter/setter를 자동 생성할 수 있는 IDE 도구를 사용하세요.
}
