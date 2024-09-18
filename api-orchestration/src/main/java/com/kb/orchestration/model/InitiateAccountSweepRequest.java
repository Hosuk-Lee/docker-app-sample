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

package com.kb.orchestration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kb.orchestration.model.InitiateAccountSweepRequestAccountSweep;
import com.kb.orchestration.model.InitiateAccountSweepRequestSavingsAccountFacility;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/**
 * Input: InBQ Set up an account sweep
 */
@Schema(description = "Input: InBQ Set up an account sweep")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateAccountSweepRequest {
  @JsonProperty("SavingsAccountFacility")
  private InitiateAccountSweepRequestSavingsAccountFacility savingsAccountFacility = null;

  @JsonProperty("AccountSweep")
  private InitiateAccountSweepRequestAccountSweep accountSweep = null;

  public InitiateAccountSweepRequest savingsAccountFacility(InitiateAccountSweepRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

   /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  **/
  @Schema(description = "")
  public InitiateAccountSweepRequestSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateAccountSweepRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateAccountSweepRequest accountSweep(InitiateAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
    return this;
  }

   /**
   * Get accountSweep
   * @return accountSweep
  **/
  @Schema(description = "")
  public InitiateAccountSweepRequestAccountSweep getAccountSweep() {
    return accountSweep;
  }

  public void setAccountSweep(InitiateAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountSweepRequest initiateAccountSweepRequest = (InitiateAccountSweepRequest) o;
    return Objects.equals(this.savingsAccountFacility, initiateAccountSweepRequest.savingsAccountFacility) &&
        Objects.equals(this.accountSweep, initiateAccountSweepRequest.accountSweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, accountSweep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepRequest {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    accountSweep: ").append(toIndentedString(accountSweep)).append("\n");
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
