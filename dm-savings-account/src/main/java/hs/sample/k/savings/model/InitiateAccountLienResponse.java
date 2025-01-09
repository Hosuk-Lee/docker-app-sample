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

package hs.sample.k.savings.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Output: InBQ Set up an account lien
 */
@Schema(description = "Output: InBQ Set up an account lien")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateAccountLienResponse {
  @JsonProperty("SavingsAccountFacility")
  private InitiateAccountLienResponseSavingsAccountFacility savingsAccountFacility = null;

  @JsonProperty("AccountLien")
  private InitiateAccountLienResponseAccountLien accountLien = null;

  public InitiateAccountLienResponse savingsAccountFacility(InitiateAccountLienResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

   /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  **/
  @Schema(description = "")
  public InitiateAccountLienResponseSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateAccountLienResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateAccountLienResponse accountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

   /**
   * Get accountLien
   * @return accountLien
  **/
  @Schema(description = "")
  public InitiateAccountLienResponseAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountLienResponse initiateAccountLienResponse = (InitiateAccountLienResponse) o;
    return Objects.equals(this.savingsAccountFacility, initiateAccountLienResponse.savingsAccountFacility) &&
        Objects.equals(this.accountLien, initiateAccountLienResponse.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, accountLien);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienResponse {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    accountLien: ").append(toIndentedString(accountLien)).append("\n");
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