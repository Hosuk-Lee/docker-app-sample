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
import com.kb.orchestration.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/**
 * RetrieveServiceFeesResponseServiceFees
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class RetrieveServiceFeesResponseServiceFees {
  @JsonProperty("FeeConfigurationProfile")
  private String feeConfigurationProfile = null;

  @JsonProperty("FeeType")
  private String feeType = null;

  @JsonProperty("FeeDefinition")
  private String feeDefinition = null;

  @JsonProperty("FeeApplicationRecord")
  private String feeApplicationRecord = null;

  @JsonProperty("FeeTransaction")
  private String feeTransaction = null;

  @JsonProperty("TransactionDescription")
  private String transactionDescription = null;

  @JsonProperty("TransactionFeeType")
  private String transactionFeeType = null;

  @JsonProperty("TransactionFeeCharge")
  private String transactionFeeCharge = null;

  @JsonProperty("FeeProjectionsandCommitments")
  private String feeProjectionsandCommitments = null;

  @JsonProperty("ProjectedTransactionDescription")
  private String projectedTransactionDescription = null;

  @JsonProperty("ProjectedTransactionFeeType")
  private String projectedTransactionFeeType = null;

  @JsonProperty("ProjectedTransactionFeeCharge")
  private String projectedTransactionFeeCharge = null;

  @JsonProperty("FeeAccrualAmount")
  private Amount feeAccrualAmount = null;

  @JsonProperty("AccrualFeeType")
  private String accrualFeeType = null;

  @JsonProperty("AccrualFeeCharge")
  private String accrualFeeCharge = null;

  public RetrieveServiceFeesResponseServiceFees feeConfigurationProfile(String feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

   /**
   *  
   * @return feeConfigurationProfile
  **/
  @Schema(description = " ")
  public String getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(String feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }

  public RetrieveServiceFeesResponseServiceFees feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   *  
   * @return feeType
  **/
  @Schema(description = " ")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public RetrieveServiceFeesResponseServiceFees feeDefinition(String feeDefinition) {
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

  public RetrieveServiceFeesResponseServiceFees feeApplicationRecord(String feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
    return this;
  }

   /**
   *  
   * @return feeApplicationRecord
  **/
  @Schema(description = " ")
  public String getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(String feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }

  public RetrieveServiceFeesResponseServiceFees feeTransaction(String feeTransaction) {
    this.feeTransaction = feeTransaction;
    return this;
  }

   /**
   *  
   * @return feeTransaction
  **/
  @Schema(description = " ")
  public String getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(String feeTransaction) {
    this.feeTransaction = feeTransaction;
  }

  public RetrieveServiceFeesResponseServiceFees transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   *  
   * @return transactionDescription
  **/
  @Schema(description = " ")
  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public RetrieveServiceFeesResponseServiceFees transactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
    return this;
  }

   /**
   *  
   * @return transactionFeeType
  **/
  @Schema(description = " ")
  public String getTransactionFeeType() {
    return transactionFeeType;
  }

  public void setTransactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
  }

  public RetrieveServiceFeesResponseServiceFees transactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
    return this;
  }

   /**
   *  
   * @return transactionFeeCharge
  **/
  @Schema(description = " ")
  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }

  public RetrieveServiceFeesResponseServiceFees feeProjectionsandCommitments(String feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
    return this;
  }

   /**
   *  
   * @return feeProjectionsandCommitments
  **/
  @Schema(description = " ")
  public String getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(String feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }

  public RetrieveServiceFeesResponseServiceFees projectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
    return this;
  }

   /**
   *  
   * @return projectedTransactionDescription
  **/
  @Schema(description = " ")
  public String getProjectedTransactionDescription() {
    return projectedTransactionDescription;
  }

  public void setProjectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
  }

  public RetrieveServiceFeesResponseServiceFees projectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
    return this;
  }

   /**
   *  
   * @return projectedTransactionFeeType
  **/
  @Schema(description = " ")
  public String getProjectedTransactionFeeType() {
    return projectedTransactionFeeType;
  }

  public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
  }

  public RetrieveServiceFeesResponseServiceFees projectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
    return this;
  }

   /**
   *  
   * @return projectedTransactionFeeCharge
  **/
  @Schema(description = " ")
  public String getProjectedTransactionFeeCharge() {
    return projectedTransactionFeeCharge;
  }

  public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
  }

  public RetrieveServiceFeesResponseServiceFees feeAccrualAmount(Amount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
    return this;
  }

   /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  **/
  @Schema(description = "")
  public Amount getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(Amount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }

  public RetrieveServiceFeesResponseServiceFees accrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
    return this;
  }

   /**
   *  
   * @return accrualFeeType
  **/
  @Schema(description = " ")
  public String getAccrualFeeType() {
    return accrualFeeType;
  }

  public void setAccrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
  }

  public RetrieveServiceFeesResponseServiceFees accrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
    return this;
  }

   /**
   *  
   * @return accrualFeeCharge
  **/
  @Schema(description = " ")
  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveServiceFeesResponseServiceFees retrieveServiceFeesResponseServiceFees = (RetrieveServiceFeesResponseServiceFees) o;
    return Objects.equals(this.feeConfigurationProfile, retrieveServiceFeesResponseServiceFees.feeConfigurationProfile) &&
        Objects.equals(this.feeType, retrieveServiceFeesResponseServiceFees.feeType) &&
        Objects.equals(this.feeDefinition, retrieveServiceFeesResponseServiceFees.feeDefinition) &&
        Objects.equals(this.feeApplicationRecord, retrieveServiceFeesResponseServiceFees.feeApplicationRecord) &&
        Objects.equals(this.feeTransaction, retrieveServiceFeesResponseServiceFees.feeTransaction) &&
        Objects.equals(this.transactionDescription, retrieveServiceFeesResponseServiceFees.transactionDescription) &&
        Objects.equals(this.transactionFeeType, retrieveServiceFeesResponseServiceFees.transactionFeeType) &&
        Objects.equals(this.transactionFeeCharge, retrieveServiceFeesResponseServiceFees.transactionFeeCharge) &&
        Objects.equals(this.feeProjectionsandCommitments, retrieveServiceFeesResponseServiceFees.feeProjectionsandCommitments) &&
        Objects.equals(this.projectedTransactionDescription, retrieveServiceFeesResponseServiceFees.projectedTransactionDescription) &&
        Objects.equals(this.projectedTransactionFeeType, retrieveServiceFeesResponseServiceFees.projectedTransactionFeeType) &&
        Objects.equals(this.projectedTransactionFeeCharge, retrieveServiceFeesResponseServiceFees.projectedTransactionFeeCharge) &&
        Objects.equals(this.feeAccrualAmount, retrieveServiceFeesResponseServiceFees.feeAccrualAmount) &&
        Objects.equals(this.accrualFeeType, retrieveServiceFeesResponseServiceFees.accrualFeeType) &&
        Objects.equals(this.accrualFeeCharge, retrieveServiceFeesResponseServiceFees.accrualFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeType, feeDefinition, feeApplicationRecord, feeTransaction, transactionDescription, transactionFeeType, transactionFeeCharge, feeProjectionsandCommitments, projectedTransactionDescription, projectedTransactionFeeType, projectedTransactionFeeCharge, feeAccrualAmount, accrualFeeType, accrualFeeCharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveServiceFeesResponseServiceFees {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeDefinition: ").append(toIndentedString(feeDefinition)).append("\n");
    sb.append("    feeApplicationRecord: ").append(toIndentedString(feeApplicationRecord)).append("\n");
    sb.append("    feeTransaction: ").append(toIndentedString(feeTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionFeeType: ").append(toIndentedString(transactionFeeType)).append("\n");
    sb.append("    transactionFeeCharge: ").append(toIndentedString(transactionFeeCharge)).append("\n");
    sb.append("    feeProjectionsandCommitments: ").append(toIndentedString(feeProjectionsandCommitments)).append("\n");
    sb.append("    projectedTransactionDescription: ").append(toIndentedString(projectedTransactionDescription)).append("\n");
    sb.append("    projectedTransactionFeeType: ").append(toIndentedString(projectedTransactionFeeType)).append("\n");
    sb.append("    projectedTransactionFeeCharge: ").append(toIndentedString(projectedTransactionFeeCharge)).append("\n");
    sb.append("    feeAccrualAmount: ").append(toIndentedString(feeAccrualAmount)).append("\n");
    sb.append("    accrualFeeType: ").append(toIndentedString(accrualFeeType)).append("\n");
    sb.append("    accrualFeeCharge: ").append(toIndentedString(accrualFeeCharge)).append("\n");
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
