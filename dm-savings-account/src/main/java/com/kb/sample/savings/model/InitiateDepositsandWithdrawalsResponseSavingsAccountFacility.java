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
 * InitiateDepositsandWithdrawalsResponseSavingsAccountFacility
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateDepositsandWithdrawalsResponseSavingsAccountFacility {
  @JsonProperty("PositionLimitValue")
  private String positionLimitValue = null;

  @JsonProperty("DateType")
  private String dateType = null;

  public InitiateDepositsandWithdrawalsResponseSavingsAccountFacility positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

   /**
   *  
   * @return positionLimitValue
  **/
  @Schema(description = " ")
  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public InitiateDepositsandWithdrawalsResponseSavingsAccountFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

   /**
   *  
   * @return dateType
  **/
  @Schema(description = " ")
  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsResponseSavingsAccountFacility initiateDepositsandWithdrawalsResponseSavingsAccountFacility = (InitiateDepositsandWithdrawalsResponseSavingsAccountFacility) o;
    return Objects.equals(this.positionLimitValue, initiateDepositsandWithdrawalsResponseSavingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateDepositsandWithdrawalsResponseSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionLimitValue, dateType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsResponseSavingsAccountFacility {\n");
    
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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
