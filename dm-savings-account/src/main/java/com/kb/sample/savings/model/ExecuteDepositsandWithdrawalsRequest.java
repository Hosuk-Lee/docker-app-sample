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
 * Input: ExBQ Execute a deposit or withdrawal transaction
 */
@Schema(description = "Input: ExBQ Execute a deposit or withdrawal transaction")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class ExecuteDepositsandWithdrawalsRequest {
  @JsonProperty("DepositsandWithdrawals")
  private ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals = null;

  public ExecuteDepositsandWithdrawalsRequest depositsandWithdrawals(ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

   /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  **/
  @Schema(description = "")
  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteDepositsandWithdrawalsRequest executeDepositsandWithdrawalsRequest = (ExecuteDepositsandWithdrawalsRequest) o;
    return Objects.equals(this.depositsandWithdrawals, executeDepositsandWithdrawalsRequest.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsandWithdrawals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsRequest {\n");
    
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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
