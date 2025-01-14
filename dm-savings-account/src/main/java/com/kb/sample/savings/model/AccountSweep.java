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
 * AccountSweep
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class AccountSweep {
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

  public AccountSweep accountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
    return this;
  }

   /**
   * The type of sweep (e.g. periodic, threshold)
   * @return accountSweepType
  **/
  @Schema(description = "The type of sweep (e.g. periodic, threshold)")
  public String getAccountSweepType() {
    return accountSweepType;
  }

  public void setAccountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
  }

  public AccountSweep accountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
    return this;
  }

   /**
   * Definition of the type of sweep
   * @return accountSweepDefinition
  **/
  @Schema(description = "Definition of the type of sweep")
  public String getAccountSweepDefinition() {
    return accountSweepDefinition;
  }

  public void setAccountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
  }

  public AccountSweep accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
    return this;
  }

   /**
   * Sweep processing guidelines and scheduling rules
   * @return accountSweepApplicationSchedule
  **/
  @Schema(description = "Sweep processing guidelines and scheduling rules")
  public String getAccountSweepApplicationSchedule() {
    return accountSweepApplicationSchedule;
  }

  public void setAccountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
  }

  public AccountSweep accountSweepConfiguration(String accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
    return this;
  }

   /**
   * The set-up of the sweep facility
   * @return accountSweepConfiguration
  **/
  @Schema(description = "The set-up of the sweep facility")
  public String getAccountSweepConfiguration() {
    return accountSweepConfiguration;
  }

  public void setAccountSweepConfiguration(String accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
  }

  public AccountSweep targetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

   /**
   * The facility that the sweep is made to/from
   * @return targetAccount
  **/
  @Schema(description = "The facility that the sweep is made to/from")
  public String getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }

  public AccountSweep sweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
    return this;
  }

   /**
   * Confirmation that the sweep processing is sanctioned as necessary
   * @return sweepMandate
  **/
  @Schema(description = "Confirmation that the sweep processing is sanctioned as necessary")
  public String getSweepMandate() {
    return sweepMandate;
  }

  public void setSweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
  }

  public AccountSweep sweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
    return this;
  }

   /**
   * Timing and or triggers for initiating sweep transaction
   * @return sweepProcessingSchedule
  **/
  @Schema(description = "Timing and or triggers for initiating sweep transaction")
  public String getSweepProcessingSchedule() {
    return sweepProcessingSchedule;
  }

  public void setSweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
  }

  public AccountSweep sweepApplicationRecord(String sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
    return this;
  }

   /**
   * The transaction record for an applied sweep
   * @return sweepApplicationRecord
  **/
  @Schema(description = "The transaction record for an applied sweep")
  public String getSweepApplicationRecord() {
    return sweepApplicationRecord;
  }

  public void setSweepApplicationRecord(String sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
  }

  public AccountSweep accountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
    return this;
  }

   /**
   * The facility that the sweep is made to/from
   * @return accountSweepTargetAccount
  **/
  @Schema(description = "The facility that the sweep is made to/from")
  public String getAccountSweepTargetAccount() {
    return accountSweepTargetAccount;
  }

  public void setAccountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
  }

  public AccountSweep accountSweepAmount(Amount accountSweepAmount) {
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

  public AccountSweep accountSweepExecutionDate(LocalDate accountSweepExecutionDate) {
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
    AccountSweep accountSweep = (AccountSweep) o;
    return Objects.equals(this.accountSweepType, accountSweep.accountSweepType) &&
        Objects.equals(this.accountSweepDefinition, accountSweep.accountSweepDefinition) &&
        Objects.equals(this.accountSweepApplicationSchedule, accountSweep.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, accountSweep.accountSweepConfiguration) &&
        Objects.equals(this.targetAccount, accountSweep.targetAccount) &&
        Objects.equals(this.sweepMandate, accountSweep.sweepMandate) &&
        Objects.equals(this.sweepProcessingSchedule, accountSweep.sweepProcessingSchedule) &&
        Objects.equals(this.sweepApplicationRecord, accountSweep.sweepApplicationRecord) &&
        Objects.equals(this.accountSweepTargetAccount, accountSweep.accountSweepTargetAccount) &&
        Objects.equals(this.accountSweepAmount, accountSweep.accountSweepAmount) &&
        Objects.equals(this.accountSweepExecutionDate, accountSweep.accountSweepExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepDefinition, accountSweepApplicationSchedule, accountSweepConfiguration, targetAccount, sweepMandate, sweepProcessingSchedule, sweepApplicationRecord, accountSweepTargetAccount, accountSweepAmount, accountSweepExecutionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSweep {\n");
    
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
