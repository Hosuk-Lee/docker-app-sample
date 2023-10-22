/*
 * Savings Account
 * This service domain orchestrates a consumer savings account. The typical range of services and fees covers payments from and scheduled and ad-hoc deposits to the account, standing orders, sweeps, and liens.
 *
 * OpenAPI spec version: 11.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.Arrays;
//
//
//
//
//
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Input: InCR Initiate A new savings account
 */
@Schema(description = "Input: InCR Initiate A new savings account")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateSavingsAccountFacilityRequest {
//  @JsonProperty("SavingsAccountFacility")

  @JsonProperty("SavingsAccountFacility")
  private InitiateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility = null;

  public InitiateSavingsAccountFacilityRequest savingsAccountFacility(InitiateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

   /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  **/
  @Schema(description = "")
  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSavingsAccountFacilityRequest initiateSavingsAccountFacilityRequest = (InitiateSavingsAccountFacilityRequest) o;
    return Objects.equals(this.savingsAccountFacility, initiateSavingsAccountFacilityRequest.savingsAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSavingsAccountFacilityRequest {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
