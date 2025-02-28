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
 * InitiateServiceFeesResponseServiceFees
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateServiceFeesResponseServiceFees {
  @JsonProperty("FeeDefinition")
  private String feeDefinition = null;

  public InitiateServiceFeesResponseServiceFees feeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
    return this;
  }

   /**
   *  
   * @return feeDefinition
  **/
  @Schema(description = " ")
  public String getFeeDefinition() {
    return feeDefinition;
  }

  public void setFeeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateServiceFeesResponseServiceFees initiateServiceFeesResponseServiceFees = (InitiateServiceFeesResponseServiceFees) o;
    return Objects.equals(this.feeDefinition, initiateServiceFeesResponseServiceFees.feeDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServiceFeesResponseServiceFees {\n");
    
    sb.append("    feeDefinition: ").append(toIndentedString(feeDefinition)).append("\n");
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
