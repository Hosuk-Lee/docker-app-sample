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
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.Objects;
//import org.threeten.bp.LocalDate;
/**
 * ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals {
  @JsonProperty("DepositTransaction")
  private String depositTransaction = null;

  @JsonProperty("DepositTransactionSourceReference")
  private String depositTransactionSourceReference = null;

  @JsonProperty("DepositTransactionDepositType")
  private String depositTransactionDepositType = null;

  @JsonProperty("DepositTransactionDescription")
  private String depositTransactionDescription = null;

  @JsonProperty("DepositTransactionAmount")
  private Amount depositTransactionAmount = null;

  @JsonProperty("DepositTransactionDate")
  private LocalDate depositTransactionDate = null;

  @JsonProperty("WithdrawalTransaction")
  private String withdrawalTransaction = null;

  @JsonProperty("WithdrawalTransactionSourceReference")
  private String withdrawalTransactionSourceReference = null;

  @JsonProperty("WithdrawalTransactionWithdrawalType")
  private String withdrawalTransactionWithdrawalType = null;

  @JsonProperty("WithdrawalTransactionDescription")
  private String withdrawalTransactionDescription = null;

  @JsonProperty("WithdrawalTransactionAmount")
  private Amount withdrawalTransactionAmount = null;

  @JsonProperty("WithdrawalTransactionDate")
  private LocalDate withdrawalTransactionDate = null;

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransaction(String depositTransaction) {
    this.depositTransaction = depositTransaction;
    return this;
  }

   /**
   *  
   * @return depositTransaction
  **/
  @Schema(description = " ")
  public String getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(String depositTransaction) {
    this.depositTransaction = depositTransaction;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
    return this;
  }

   /**
   *  
   * @return depositTransactionSourceReference
  **/
  @Schema(description = " ")
  public String getDepositTransactionSourceReference() {
    return depositTransactionSourceReference;
  }

  public void setDepositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
    return this;
  }

   /**
   *  
   * @return depositTransactionDepositType
  **/
  @Schema(description = " ")
  public String getDepositTransactionDepositType() {
    return depositTransactionDepositType;
  }

  public void setDepositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
    return this;
  }

   /**
   *  
   * @return depositTransactionDescription
  **/
  @Schema(description = " ")
  public String getDepositTransactionDescription() {
    return depositTransactionDescription;
  }

  public void setDepositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionAmount(Amount depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
    return this;
  }

   /**
   * Get depositTransactionAmount
   * @return depositTransactionAmount
  **/
  @Schema(description = "")
  public Amount getDepositTransactionAmount() {
    return depositTransactionAmount;
  }

  public void setDepositTransactionAmount(Amount depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals depositTransactionDate(LocalDate depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
    return this;
  }

   /**
   * Get depositTransactionDate
   * @return depositTransactionDate
  **/
  @Schema(description = "")
  public LocalDate getDepositTransactionDate() {
    return depositTransactionDate;
  }

  public void setDepositTransactionDate(LocalDate depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransaction(String withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
    return this;
  }

   /**
   *  
   * @return withdrawalTransaction
  **/
  @Schema(description = " ")
  public String getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(String withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
    return this;
  }

   /**
   *  
   * @return withdrawalTransactionSourceReference
  **/
  @Schema(description = " ")
  public String getWithdrawalTransactionSourceReference() {
    return withdrawalTransactionSourceReference;
  }

  public void setWithdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
    return this;
  }

   /**
   *  
   * @return withdrawalTransactionWithdrawalType
  **/
  @Schema(description = " ")
  public String getWithdrawalTransactionWithdrawalType() {
    return withdrawalTransactionWithdrawalType;
  }

  public void setWithdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
    return this;
  }

   /**
   *  
   * @return withdrawalTransactionDescription
  **/
  @Schema(description = " ")
  public String getWithdrawalTransactionDescription() {
    return withdrawalTransactionDescription;
  }

  public void setWithdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionAmount(Amount withdrawalTransactionAmount) {
    this.withdrawalTransactionAmount = withdrawalTransactionAmount;
    return this;
  }

   /**
   * Get withdrawalTransactionAmount
   * @return withdrawalTransactionAmount
  **/
  @Schema(description = "")
  public Amount getWithdrawalTransactionAmount() {
    return withdrawalTransactionAmount;
  }

  public void setWithdrawalTransactionAmount(Amount withdrawalTransactionAmount) {
    this.withdrawalTransactionAmount = withdrawalTransactionAmount;
  }

  public ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals withdrawalTransactionDate(LocalDate withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
    return this;
  }

   /**
   * Get withdrawalTransactionDate
   * @return withdrawalTransactionDate
  **/
  @Schema(description = "")
  public LocalDate getWithdrawalTransactionDate() {
    return withdrawalTransactionDate;
  }

  public void setWithdrawalTransactionDate(LocalDate withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals executeDepositsandWithdrawalsRequestDepositsandWithdrawals = (ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals) o;
    return Objects.equals(this.depositTransaction, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransaction) &&
        Objects.equals(this.depositTransactionSourceReference, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionSourceReference) &&
        Objects.equals(this.depositTransactionDepositType, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionDepositType) &&
        Objects.equals(this.depositTransactionDescription, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionDescription) &&
        Objects.equals(this.depositTransactionAmount, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionAmount) &&
        Objects.equals(this.depositTransactionDate, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.depositTransactionDate) &&
        Objects.equals(this.withdrawalTransaction, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransaction) &&
        Objects.equals(this.withdrawalTransactionSourceReference, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionSourceReference) &&
        Objects.equals(this.withdrawalTransactionWithdrawalType, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionWithdrawalType) &&
        Objects.equals(this.withdrawalTransactionDescription, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionDescription) &&
        Objects.equals(this.withdrawalTransactionAmount, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionAmount) &&
        Objects.equals(this.withdrawalTransactionDate, executeDepositsandWithdrawalsRequestDepositsandWithdrawals.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransaction, depositTransactionSourceReference, depositTransactionDepositType, depositTransactionDescription, depositTransactionAmount, depositTransactionDate, withdrawalTransaction, withdrawalTransactionSourceReference, withdrawalTransactionWithdrawalType, withdrawalTransactionDescription, withdrawalTransactionAmount, withdrawalTransactionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsRequestDepositsandWithdrawals {\n");
    
    sb.append("    depositTransaction: ").append(toIndentedString(depositTransaction)).append("\n");
    sb.append("    depositTransactionSourceReference: ").append(toIndentedString(depositTransactionSourceReference)).append("\n");
    sb.append("    depositTransactionDepositType: ").append(toIndentedString(depositTransactionDepositType)).append("\n");
    sb.append("    depositTransactionDescription: ").append(toIndentedString(depositTransactionDescription)).append("\n");
    sb.append("    depositTransactionAmount: ").append(toIndentedString(depositTransactionAmount)).append("\n");
    sb.append("    depositTransactionDate: ").append(toIndentedString(depositTransactionDate)).append("\n");
    sb.append("    withdrawalTransaction: ").append(toIndentedString(withdrawalTransaction)).append("\n");
    sb.append("    withdrawalTransactionSourceReference: ").append(toIndentedString(withdrawalTransactionSourceReference)).append("\n");
    sb.append("    withdrawalTransactionWithdrawalType: ").append(toIndentedString(withdrawalTransactionWithdrawalType)).append("\n");
    sb.append("    withdrawalTransactionDescription: ").append(toIndentedString(withdrawalTransactionDescription)).append("\n");
    sb.append("    withdrawalTransactionAmount: ").append(toIndentedString(withdrawalTransactionAmount)).append("\n");
    sb.append("    withdrawalTransactionDate: ").append(toIndentedString(withdrawalTransactionDate)).append("\n");
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
