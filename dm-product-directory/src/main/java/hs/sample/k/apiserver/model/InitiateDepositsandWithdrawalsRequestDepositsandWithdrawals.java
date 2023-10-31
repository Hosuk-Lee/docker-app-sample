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





import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals {
  @JsonProperty("DepositType")
  private String depositType = null;

  @JsonProperty("WithdrawalType")
  private String withdrawalType = null;

  @JsonProperty("AccountLimitBreachResponse")
  private String accountLimitBreachResponse = null;

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositType(String depositType) {
    this.depositType = depositType;
    return this;
  }

   /**
   *  
   * @return depositType
  **/
  @Schema(description = " ")
  public String getDepositType() {
    return depositType;
  }

  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
    return this;
  }

   /**
   *  
   * @return withdrawalType
  **/
  @Schema(description = " ")
  public String getWithdrawalType() {
    return withdrawalType;
  }

  public void setWithdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
  }

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals accountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
    return this;
  }

   /**
   *  
   * @return accountLimitBreachResponse
  **/
  @Schema(description = " ")
  public String getAccountLimitBreachResponse() {
    return accountLimitBreachResponse;
  }

  public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals initiateDepositsandWithdrawalsRequestDepositsandWithdrawals = (InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals) o;
    return Objects.equals(this.depositType, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.depositType) &&
        Objects.equals(this.withdrawalType, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalType) &&
        Objects.equals(this.accountLimitBreachResponse, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.accountLimitBreachResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, withdrawalType, accountLimitBreachResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    withdrawalType: ").append(toIndentedString(withdrawalType)).append("\n");
    sb.append("    accountLimitBreachResponse: ").append(toIndentedString(accountLimitBreachResponse)).append("\n");
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