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

import java.time.LocalDate;
import java.util.Objects;


import io.swagger.v3.oas.annotations.media.Schema;
//import org.threeten.bp.LocalDate;
/**
 * DepositsandWithdrawals
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class DepositsandWithdrawals {
  @JsonProperty("DepositType")
  private String depositType = null;

  @JsonProperty("WithdrawalType")
  private String withdrawalType = null;

  @JsonProperty("AccountLimitBreachResponse")
  private String accountLimitBreachResponse = null;

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

  public DepositsandWithdrawals depositType(String depositType) {
    this.depositType = depositType;
    return this;
  }

   /**
   * The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit)
   * @return depositType
  **/
  @Schema(description = "The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit)")
  public String getDepositType() {
    return depositType;
  }

  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }

  public DepositsandWithdrawals withdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
    return this;
  }

   /**
   * The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement)
   * @return withdrawalType
  **/
  @Schema(description = "The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement)")
  public String getWithdrawalType() {
    return withdrawalType;
  }

  public void setWithdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
  }

  public DepositsandWithdrawals accountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
    return this;
  }

   /**
   * The handling options if a withdrawal results in a breach of an account limit
   * @return accountLimitBreachResponse
  **/
  @Schema(description = "The handling options if a withdrawal results in a breach of an account limit")
  public String getAccountLimitBreachResponse() {
    return accountLimitBreachResponse;
  }

  public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
  }

  public DepositsandWithdrawals depositTransaction(String depositTransaction) {
    this.depositTransaction = depositTransaction;
    return this;
  }

   /**
   * The collection of applicable rates
   * @return depositTransaction
  **/
  @Schema(description = "The collection of applicable rates")
  public String getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(String depositTransaction) {
    this.depositTransaction = depositTransaction;
  }

  public DepositsandWithdrawals depositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
    return this;
  }

   /**
   * Identifies the source of the deposit
   * @return depositTransactionSourceReference
  **/
  @Schema(description = "Identifies the source of the deposit")
  public String getDepositTransactionSourceReference() {
    return depositTransactionSourceReference;
  }

  public void setDepositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
  }

  public DepositsandWithdrawals depositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
    return this;
  }

   /**
   * The type of deposit made with the transaction
   * @return depositTransactionDepositType
  **/
  @Schema(description = "The type of deposit made with the transaction")
  public String getDepositTransactionDepositType() {
    return depositTransactionDepositType;
  }

  public void setDepositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
  }

  public DepositsandWithdrawals depositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
    return this;
  }

   /**
   * Any necessary details describing the purpose or reference properties of the deposit
   * @return depositTransactionDescription
  **/
  @Schema(description = "Any necessary details describing the purpose or reference properties of the deposit")
  public String getDepositTransactionDescription() {
    return depositTransactionDescription;
  }

  public void setDepositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
  }

  public DepositsandWithdrawals depositTransactionAmount(Amount depositTransactionAmount) {
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

  public DepositsandWithdrawals depositTransactionDate(LocalDate depositTransactionDate) {
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

  public DepositsandWithdrawals withdrawalTransaction(String withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
    return this;
  }

   /**
   * The record of applied interest
   * @return withdrawalTransaction
  **/
  @Schema(description = "The record of applied interest")
  public String getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(String withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }

  public DepositsandWithdrawals withdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
    return this;
  }

   /**
   * Identifies the target for the withdrawal
   * @return withdrawalTransactionSourceReference
  **/
  @Schema(description = "Identifies the target for the withdrawal")
  public String getWithdrawalTransactionSourceReference() {
    return withdrawalTransactionSourceReference;
  }

  public void setWithdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
  }

  public DepositsandWithdrawals withdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
    return this;
  }

   /**
   * The type of withdrawal made with the transaction
   * @return withdrawalTransactionWithdrawalType
  **/
  @Schema(description = "The type of withdrawal made with the transaction")
  public String getWithdrawalTransactionWithdrawalType() {
    return withdrawalTransactionWithdrawalType;
  }

  public void setWithdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
  }

  public DepositsandWithdrawals withdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
    return this;
  }

   /**
   * Any necessary details describing the purpose or reference properties of the withdrawal
   * @return withdrawalTransactionDescription
  **/
  @Schema(description = "Any necessary details describing the purpose or reference properties of the withdrawal")
  public String getWithdrawalTransactionDescription() {
    return withdrawalTransactionDescription;
  }

  public void setWithdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
  }

  public DepositsandWithdrawals withdrawalTransactionAmount(Amount withdrawalTransactionAmount) {
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

  public DepositsandWithdrawals withdrawalTransactionDate(LocalDate withdrawalTransactionDate) {
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
    DepositsandWithdrawals depositsandWithdrawals = (DepositsandWithdrawals) o;
    return Objects.equals(this.depositType, depositsandWithdrawals.depositType) &&
        Objects.equals(this.withdrawalType, depositsandWithdrawals.withdrawalType) &&
        Objects.equals(this.accountLimitBreachResponse, depositsandWithdrawals.accountLimitBreachResponse) &&
        Objects.equals(this.depositTransaction, depositsandWithdrawals.depositTransaction) &&
        Objects.equals(this.depositTransactionSourceReference, depositsandWithdrawals.depositTransactionSourceReference) &&
        Objects.equals(this.depositTransactionDepositType, depositsandWithdrawals.depositTransactionDepositType) &&
        Objects.equals(this.depositTransactionDescription, depositsandWithdrawals.depositTransactionDescription) &&
        Objects.equals(this.depositTransactionAmount, depositsandWithdrawals.depositTransactionAmount) &&
        Objects.equals(this.depositTransactionDate, depositsandWithdrawals.depositTransactionDate) &&
        Objects.equals(this.withdrawalTransaction, depositsandWithdrawals.withdrawalTransaction) &&
        Objects.equals(this.withdrawalTransactionSourceReference, depositsandWithdrawals.withdrawalTransactionSourceReference) &&
        Objects.equals(this.withdrawalTransactionWithdrawalType, depositsandWithdrawals.withdrawalTransactionWithdrawalType) &&
        Objects.equals(this.withdrawalTransactionDescription, depositsandWithdrawals.withdrawalTransactionDescription) &&
        Objects.equals(this.withdrawalTransactionAmount, depositsandWithdrawals.withdrawalTransactionAmount) &&
        Objects.equals(this.withdrawalTransactionDate, depositsandWithdrawals.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, withdrawalType, accountLimitBreachResponse, depositTransaction, depositTransactionSourceReference, depositTransactionDepositType, depositTransactionDescription, depositTransactionAmount, depositTransactionDate, withdrawalTransaction, withdrawalTransactionSourceReference, withdrawalTransactionWithdrawalType, withdrawalTransactionDescription, withdrawalTransactionAmount, withdrawalTransactionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositsandWithdrawals {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    withdrawalType: ").append(toIndentedString(withdrawalType)).append("\n");
    sb.append("    accountLimitBreachResponse: ").append(toIndentedString(accountLimitBreachResponse)).append("\n");
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
