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
 * RetrieveAccountSweepResponseAccountSweep
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class RetrieveAccountSweepResponseAccountSweep {
  @JsonProperty("AccountSweepType")
  private String accountSweepType = null;

  @JsonProperty("AccountSweepDefinition")
  private String accountSweepDefinition = null;

  @JsonProperty("AccountSweepApplicationSchedule")
  private String accountSweepApplicationSchedule = null;

  @JsonProperty("AccountSweepConfiguration")
  private String accountSweepConfiguration = null;

  @JsonProperty("TargetAccount")
  private String targetAccount = null;

  @JsonProperty("SweepMandate")
  private String sweepMandate = null;

  @JsonProperty("SweepProcessingSchedule")
  private String sweepProcessingSchedule = null;

  @JsonProperty("SweepApplicationRecord")
  private String sweepApplicationRecord = null;

  @JsonProperty("AccountSweepTargetAccount")
  private String accountSweepTargetAccount = null;

  @JsonProperty("AccountSweepAmount")
  private Amount accountSweepAmount = null;

  @JsonProperty("AccountSweepExecutionDate")
  private LocalDate accountSweepExecutionDate = null;

  public RetrieveAccountSweepResponseAccountSweep accountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
    return this;
  }

   /**
   *  
   * @return accountSweepType
  **/
  @Schema(description = " ")
  public String getAccountSweepType() {
    return accountSweepType;
  }

  public void setAccountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
  }

  public RetrieveAccountSweepResponseAccountSweep accountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
    return this;
  }

   /**
   *  
   * @return accountSweepDefinition
  **/
  @Schema(description = " ")
  public String getAccountSweepDefinition() {
    return accountSweepDefinition;
  }

  public void setAccountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
  }

  public RetrieveAccountSweepResponseAccountSweep accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
    return this;
  }

   /**
   *  
   * @return accountSweepApplicationSchedule
  **/
  @Schema(description = " ")
  public String getAccountSweepApplicationSchedule() {
    return accountSweepApplicationSchedule;
  }

  public void setAccountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
  }

  public RetrieveAccountSweepResponseAccountSweep accountSweepConfiguration(String accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
    return this;
  }

   /**
   *  
   * @return accountSweepConfiguration
  **/
  @Schema(description = " ")
  public String getAccountSweepConfiguration() {
    return accountSweepConfiguration;
  }

  public void setAccountSweepConfiguration(String accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
  }

  public RetrieveAccountSweepResponseAccountSweep targetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

   /**
   *  
   * @return targetAccount
  **/
  @Schema(description = " ")
  public String getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }

  public RetrieveAccountSweepResponseAccountSweep sweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
    return this;
  }

   /**
   *  
   * @return sweepMandate
  **/
  @Schema(description = " ")
  public String getSweepMandate() {
    return sweepMandate;
  }

  public void setSweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
  }

  public RetrieveAccountSweepResponseAccountSweep sweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
    return this;
  }

   /**
   *  
   * @return sweepProcessingSchedule
  **/
  @Schema(description = " ")
  public String getSweepProcessingSchedule() {
    return sweepProcessingSchedule;
  }

  public void setSweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
  }

  public RetrieveAccountSweepResponseAccountSweep sweepApplicationRecord(String sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
    return this;
  }

   /**
   *  
   * @return sweepApplicationRecord
  **/
  @Schema(description = " ")
  public String getSweepApplicationRecord() {
    return sweepApplicationRecord;
  }

  public void setSweepApplicationRecord(String sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
  }

  public RetrieveAccountSweepResponseAccountSweep accountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
    return this;
  }

   /**
   *  
   * @return accountSweepTargetAccount
  **/
  @Schema(description = " ")
  public String getAccountSweepTargetAccount() {
    return accountSweepTargetAccount;
  }

  public void setAccountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
  }

  public RetrieveAccountSweepResponseAccountSweep accountSweepAmount(Amount accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
    return this;
  }

   /**
   * Get accountSweepAmount
   * @return accountSweepAmount
  **/
  @Schema(description = "")
  public Amount getAccountSweepAmount() {
    return accountSweepAmount;
  }

  public void setAccountSweepAmount(Amount accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
  }

  public RetrieveAccountSweepResponseAccountSweep accountSweepExecutionDate(LocalDate accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
    return this;
  }

   /**
   * Get accountSweepExecutionDate
   * @return accountSweepExecutionDate
  **/
  @Schema(description = "")
  public LocalDate getAccountSweepExecutionDate() {
    return accountSweepExecutionDate;
  }

  public void setAccountSweepExecutionDate(LocalDate accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAccountSweepResponseAccountSweep retrieveAccountSweepResponseAccountSweep = (RetrieveAccountSweepResponseAccountSweep) o;
    return Objects.equals(this.accountSweepType, retrieveAccountSweepResponseAccountSweep.accountSweepType) &&
        Objects.equals(this.accountSweepDefinition, retrieveAccountSweepResponseAccountSweep.accountSweepDefinition) &&
        Objects.equals(this.accountSweepApplicationSchedule, retrieveAccountSweepResponseAccountSweep.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, retrieveAccountSweepResponseAccountSweep.accountSweepConfiguration) &&
        Objects.equals(this.targetAccount, retrieveAccountSweepResponseAccountSweep.targetAccount) &&
        Objects.equals(this.sweepMandate, retrieveAccountSweepResponseAccountSweep.sweepMandate) &&
        Objects.equals(this.sweepProcessingSchedule, retrieveAccountSweepResponseAccountSweep.sweepProcessingSchedule) &&
        Objects.equals(this.sweepApplicationRecord, retrieveAccountSweepResponseAccountSweep.sweepApplicationRecord) &&
        Objects.equals(this.accountSweepTargetAccount, retrieveAccountSweepResponseAccountSweep.accountSweepTargetAccount) &&
        Objects.equals(this.accountSweepAmount, retrieveAccountSweepResponseAccountSweep.accountSweepAmount) &&
        Objects.equals(this.accountSweepExecutionDate, retrieveAccountSweepResponseAccountSweep.accountSweepExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepDefinition, accountSweepApplicationSchedule, accountSweepConfiguration, targetAccount, sweepMandate, sweepProcessingSchedule, sweepApplicationRecord, accountSweepTargetAccount, accountSweepAmount, accountSweepExecutionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAccountSweepResponseAccountSweep {\n");
    
    sb.append("    accountSweepType: ").append(toIndentedString(accountSweepType)).append("\n");
    sb.append("    accountSweepDefinition: ").append(toIndentedString(accountSweepDefinition)).append("\n");
    sb.append("    accountSweepApplicationSchedule: ").append(toIndentedString(accountSweepApplicationSchedule)).append("\n");
    sb.append("    accountSweepConfiguration: ").append(toIndentedString(accountSweepConfiguration)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    sweepMandate: ").append(toIndentedString(sweepMandate)).append("\n");
    sb.append("    sweepProcessingSchedule: ").append(toIndentedString(sweepProcessingSchedule)).append("\n");
    sb.append("    sweepApplicationRecord: ").append(toIndentedString(sweepApplicationRecord)).append("\n");
    sb.append("    accountSweepTargetAccount: ").append(toIndentedString(accountSweepTargetAccount)).append("\n");
    sb.append("    accountSweepAmount: ").append(toIndentedString(accountSweepAmount)).append("\n");
    sb.append("    accountSweepExecutionDate: ").append(toIndentedString(accountSweepExecutionDate)).append("\n");
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