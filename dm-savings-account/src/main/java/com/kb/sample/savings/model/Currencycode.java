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
 * Currencycode
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class Currencycode {
  @JsonProperty("Currencycode")
  private String currencycode = null;

  public Currencycode currencycode(String currencycode) {
    this.currencycode = currencycode;
    return this;
  }

   /**
   * A code identifying a currency according to ISO-4217. A currency is a system of money in general use in a particular country.  Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;. Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters. (ISO20022)  
   * @return currencycode
  **/
  @Schema(description = "A code identifying a currency according to ISO-4217. A currency is a system of money in general use in a particular country.  Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters. (ISO20022)  ")
  public String getCurrencycode() {
    return currencycode;
  }

  public void setCurrencycode(String currencycode) {
    this.currencycode = currencycode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currencycode currencycode = (Currencycode) o;
    return Objects.equals(this.currencycode, currencycode.currencycode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencycode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currencycode {\n");
    
    sb.append("    currencycode: ").append(toIndentedString(currencycode)).append("\n");
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
