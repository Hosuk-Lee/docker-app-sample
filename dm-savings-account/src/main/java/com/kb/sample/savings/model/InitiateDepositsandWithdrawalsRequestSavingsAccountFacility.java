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
 * InitiateDepositsandWithdrawalsRequestSavingsAccountFacility
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateDepositsandWithdrawalsRequestSavingsAccountFacility {
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

  @JsonProperty("PositionLimitType")
  private String positionLimitType = null;

  @JsonProperty("DateType")
  private String dateType = null;

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility productInstanceReference(String productInstanceReference) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility savingsAccountNumber(String savingsAccountNumber) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility customerReference(String customerReference) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility bankBranchLocationReference(String bankBranchLocationReference) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility accountType(String accountType) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility accountCurrency(Currencycode accountCurrency) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

   /**
   *  
   * @return positionLimitType
  **/
  @Schema(description = " ")
  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility dateType(String dateType) {
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
    InitiateDepositsandWithdrawalsRequestSavingsAccountFacility initiateDepositsandWithdrawalsRequestSavingsAccountFacility = (InitiateDepositsandWithdrawalsRequestSavingsAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.productInstanceReference) &&
        Objects.equals(this.savingsAccountNumber, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.savingsAccountNumber) &&
        Objects.equals(this.customerReference, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchLocationReference, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.bankBranchLocationReference) &&
        Objects.equals(this.accountType, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionSetting, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimitType, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.positionLimitType) &&
        Objects.equals(this.dateType, initiateDepositsandWithdrawalsRequestSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, savingsAccountNumber, customerReference, bankBranchLocationReference, accountType, accountCurrency, entitlementOptionSetting, restrictionOptionSetting, positionLimitType, dateType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequestSavingsAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchLocationReference: ").append(toIndentedString(bankBranchLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
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
