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
import java.util.Objects;

/**
 * InitiatePaymentsRequestSavingsAccountFacility
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiatePaymentsRequestSavingsAccountFacility {
  @JsonProperty("ProductInstanceReference")
  private String productInstanceReference = null;

  @JsonProperty("SavingsAccountNumber")
  private String savingsAccountNumber = null;

  @JsonProperty("CustomerReference")
  private String customerReference = null;

  @JsonProperty("BankBranchLocationReference")
  private String bankBranchLocationReference = null;

  @JsonProperty("AccountType")
  private String accountType = null;

  @JsonProperty("AccountCurrency")
  private Currencycode accountCurrency = null;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting = null;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting = null;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue = null;

  @JsonProperty("DateType")
  private String dateType = null;

  @JsonProperty("StatementsSchedule")
  private String statementsSchedule = null;

  @JsonProperty("StatementType")
  private String statementType = null;

  @JsonProperty("StatementTransactionType")
  private String statementTransactionType = null;

  @JsonProperty("StatementPeriod")
  private String statementPeriod = null;

  @JsonProperty("StatementReport")
  private String statementReport = null;

  public InitiatePaymentsRequestSavingsAccountFacility productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

   /**
   *  
   * @return productInstanceReference
  **/
  @Schema(description = " ")
  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public InitiatePaymentsRequestSavingsAccountFacility savingsAccountNumber(String savingsAccountNumber) {
    this.savingsAccountNumber = savingsAccountNumber;
    return this;
  }

   /**
   *  
   * @return savingsAccountNumber
  **/
  @Schema(description = " ")
  public String getSavingsAccountNumber() {
    return savingsAccountNumber;
  }

  public void setSavingsAccountNumber(String savingsAccountNumber) {
    this.savingsAccountNumber = savingsAccountNumber;
  }

  public InitiatePaymentsRequestSavingsAccountFacility customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   *  
   * @return customerReference
  **/
  @Schema(description = " ")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public InitiatePaymentsRequestSavingsAccountFacility bankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
    return this;
  }

   /**
   *  
   * @return bankBranchLocationReference
  **/
  @Schema(description = " ")
  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }

  public InitiatePaymentsRequestSavingsAccountFacility accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   *  
   * @return accountType
  **/
  @Schema(description = " ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public InitiatePaymentsRequestSavingsAccountFacility accountCurrency(Currencycode accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

   /**
   * Get accountCurrency
   * @return accountCurrency
  **/
  @Schema(description = "")
  public Currencycode getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(Currencycode accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public InitiatePaymentsRequestSavingsAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

   /**
   *  
   * @return entitlementOptionSetting
  **/
  @Schema(description = " ")
  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public InitiatePaymentsRequestSavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

   /**
   *  
   * @return restrictionOptionSetting
  **/
  @Schema(description = " ")
  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public InitiatePaymentsRequestSavingsAccountFacility positionLimitValue(String positionLimitValue) {
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

  public InitiatePaymentsRequestSavingsAccountFacility dateType(String dateType) {
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

  public InitiatePaymentsRequestSavingsAccountFacility statementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
    return this;
  }

   /**
   *  
   * @return statementsSchedule
  **/
  @Schema(description = " ")
  public String getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }

  public InitiatePaymentsRequestSavingsAccountFacility statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   *  
   * @return statementType
  **/
  @Schema(description = " ")
  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public InitiatePaymentsRequestSavingsAccountFacility statementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
    return this;
  }

   /**
   *  
   * @return statementTransactionType
  **/
  @Schema(description = " ")
  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }

  public InitiatePaymentsRequestSavingsAccountFacility statementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
    return this;
  }

   /**
   *  
   * @return statementPeriod
  **/
  @Schema(description = " ")
  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }

  public InitiatePaymentsRequestSavingsAccountFacility statementReport(String statementReport) {
    this.statementReport = statementReport;
    return this;
  }

   /**
   *  
   * @return statementReport
  **/
  @Schema(description = " ")
  public String getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(String statementReport) {
    this.statementReport = statementReport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsRequestSavingsAccountFacility initiatePaymentsRequestSavingsAccountFacility = (InitiatePaymentsRequestSavingsAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiatePaymentsRequestSavingsAccountFacility.productInstanceReference) &&
        Objects.equals(this.savingsAccountNumber, initiatePaymentsRequestSavingsAccountFacility.savingsAccountNumber) &&
        Objects.equals(this.customerReference, initiatePaymentsRequestSavingsAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchLocationReference, initiatePaymentsRequestSavingsAccountFacility.bankBranchLocationReference) &&
        Objects.equals(this.accountType, initiatePaymentsRequestSavingsAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiatePaymentsRequestSavingsAccountFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionSetting, initiatePaymentsRequestSavingsAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiatePaymentsRequestSavingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimitValue, initiatePaymentsRequestSavingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiatePaymentsRequestSavingsAccountFacility.dateType) &&
        Objects.equals(this.statementsSchedule, initiatePaymentsRequestSavingsAccountFacility.statementsSchedule) &&
        Objects.equals(this.statementType, initiatePaymentsRequestSavingsAccountFacility.statementType) &&
        Objects.equals(this.statementTransactionType, initiatePaymentsRequestSavingsAccountFacility.statementTransactionType) &&
        Objects.equals(this.statementPeriod, initiatePaymentsRequestSavingsAccountFacility.statementPeriod) &&
        Objects.equals(this.statementReport, initiatePaymentsRequestSavingsAccountFacility.statementReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, savingsAccountNumber, customerReference, bankBranchLocationReference, accountType, accountCurrency, entitlementOptionSetting, restrictionOptionSetting, positionLimitValue, dateType, statementsSchedule, statementType, statementTransactionType, statementPeriod, statementReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsRequestSavingsAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchLocationReference: ").append(toIndentedString(bankBranchLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    statementsSchedule: ").append(toIndentedString(statementsSchedule)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    statementTransactionType: ").append(toIndentedString(statementTransactionType)).append("\n");
    sb.append("    statementPeriod: ").append(toIndentedString(statementPeriod)).append("\n");
    sb.append("    statementReport: ").append(toIndentedString(statementReport)).append("\n");
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
