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

package com.kb.sample.savings.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Output: UpBQ Update details of an existing account lien
 */
@Schema(description = "Output: UpBQ Update details of an existing account lien")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class UpdateAccountLienResponse {
  @JsonProperty("AccountLien")
  private UpdateAccountLienRequestAccountLien accountLien = null;

  public UpdateAccountLienResponse accountLien(UpdateAccountLienRequestAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

   /**
   * Get accountLien
   * @return accountLien
  **/
  @Schema(description = "")
  public UpdateAccountLienRequestAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(UpdateAccountLienRequestAccountLien accountLien) {
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
    UpdateAccountLienResponse updateAccountLienResponse = (UpdateAccountLienResponse) o;
    return Objects.equals(this.accountLien, updateAccountLienResponse.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLien);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountLienResponse {\n");
    
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
