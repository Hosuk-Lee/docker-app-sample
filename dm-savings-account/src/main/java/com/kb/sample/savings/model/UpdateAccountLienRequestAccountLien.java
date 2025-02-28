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
 * UpdateAccountLienRequestAccountLien
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class UpdateAccountLienRequestAccountLien {
  @JsonProperty("LienType")
  private String lienType = null;

  @JsonProperty("LienProcessingOption")
  private String lienProcessingOption = null;

  @JsonProperty("LienRecord")
  private String lienRecord = null;

  @JsonProperty("LienOriginator")
  private String lienOriginator = null;

  @JsonProperty("LienPurpose")
  private String lienPurpose = null;

  @JsonProperty("LienAmount")
  private Amount lienAmount = null;

  @JsonProperty("LienStartDate")
  private LocalDate lienStartDate = null;

  @JsonProperty("LienExpiryDate")
  private LocalDate lienExpiryDate = null;

  @JsonProperty("LienStatus")
  private String lienStatus = null;

  public UpdateAccountLienRequestAccountLien lienType(String lienType) {
    this.lienType = lienType;
    return this;
  }

   /**
   *  
   * @return lienType
  **/
  @Schema(description = " ")
  public String getLienType() {
    return lienType;
  }

  public void setLienType(String lienType) {
    this.lienType = lienType;
  }

  public UpdateAccountLienRequestAccountLien lienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
    return this;
  }

   /**
   *  
   * @return lienProcessingOption
  **/
  @Schema(description = " ")
  public String getLienProcessingOption() {
    return lienProcessingOption;
  }

  public void setLienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
  }

  public UpdateAccountLienRequestAccountLien lienRecord(String lienRecord) {
    this.lienRecord = lienRecord;
    return this;
  }

   /**
   *  
   * @return lienRecord
  **/
  @Schema(description = " ")
  public String getLienRecord() {
    return lienRecord;
  }

  public void setLienRecord(String lienRecord) {
    this.lienRecord = lienRecord;
  }

  public UpdateAccountLienRequestAccountLien lienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
    return this;
  }

   /**
   *  
   * @return lienOriginator
  **/
  @Schema(description = " ")
  public String getLienOriginator() {
    return lienOriginator;
  }

  public void setLienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
  }

  public UpdateAccountLienRequestAccountLien lienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
    return this;
  }

   /**
   *  
   * @return lienPurpose
  **/
  @Schema(description = " ")
  public String getLienPurpose() {
    return lienPurpose;
  }

  public void setLienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
  }

  public UpdateAccountLienRequestAccountLien lienAmount(Amount lienAmount) {
    this.lienAmount = lienAmount;
    return this;
  }

   /**
   * Get lienAmount
   * @return lienAmount
  **/
  @Schema(description = "")
  public Amount getLienAmount() {
    return lienAmount;
  }

  public void setLienAmount(Amount lienAmount) {
    this.lienAmount = lienAmount;
  }

  public UpdateAccountLienRequestAccountLien lienStartDate(LocalDate lienStartDate) {
    this.lienStartDate = lienStartDate;
    return this;
  }

   /**
   * Get lienStartDate
   * @return lienStartDate
  **/
  @Schema(description = "")
  public LocalDate getLienStartDate() {
    return lienStartDate;
  }

  public void setLienStartDate(LocalDate lienStartDate) {
    this.lienStartDate = lienStartDate;
  }

  public UpdateAccountLienRequestAccountLien lienExpiryDate(LocalDate lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
    return this;
  }

   /**
   * Get lienExpiryDate
   * @return lienExpiryDate
  **/
  @Schema(description = "")
  public LocalDate getLienExpiryDate() {
    return lienExpiryDate;
  }

  public void setLienExpiryDate(LocalDate lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
  }

  public UpdateAccountLienRequestAccountLien lienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
    return this;
  }

   /**
   *  
   * @return lienStatus
  **/
  @Schema(description = " ")
  public String getLienStatus() {
    return lienStatus;
  }

  public void setLienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccountLienRequestAccountLien updateAccountLienRequestAccountLien = (UpdateAccountLienRequestAccountLien) o;
    return Objects.equals(this.lienType, updateAccountLienRequestAccountLien.lienType) &&
        Objects.equals(this.lienProcessingOption, updateAccountLienRequestAccountLien.lienProcessingOption) &&
        Objects.equals(this.lienRecord, updateAccountLienRequestAccountLien.lienRecord) &&
        Objects.equals(this.lienOriginator, updateAccountLienRequestAccountLien.lienOriginator) &&
        Objects.equals(this.lienPurpose, updateAccountLienRequestAccountLien.lienPurpose) &&
        Objects.equals(this.lienAmount, updateAccountLienRequestAccountLien.lienAmount) &&
        Objects.equals(this.lienStartDate, updateAccountLienRequestAccountLien.lienStartDate) &&
        Objects.equals(this.lienExpiryDate, updateAccountLienRequestAccountLien.lienExpiryDate) &&
        Objects.equals(this.lienStatus, updateAccountLienRequestAccountLien.lienStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lienType, lienProcessingOption, lienRecord, lienOriginator, lienPurpose, lienAmount, lienStartDate, lienExpiryDate, lienStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountLienRequestAccountLien {\n");
    
    sb.append("    lienType: ").append(toIndentedString(lienType)).append("\n");
    sb.append("    lienProcessingOption: ").append(toIndentedString(lienProcessingOption)).append("\n");
    sb.append("    lienRecord: ").append(toIndentedString(lienRecord)).append("\n");
    sb.append("    lienOriginator: ").append(toIndentedString(lienOriginator)).append("\n");
    sb.append("    lienPurpose: ").append(toIndentedString(lienPurpose)).append("\n");
    sb.append("    lienAmount: ").append(toIndentedString(lienAmount)).append("\n");
    sb.append("    lienStartDate: ").append(toIndentedString(lienStartDate)).append("\n");
    sb.append("    lienExpiryDate: ").append(toIndentedString(lienExpiryDate)).append("\n");
    sb.append("    lienStatus: ").append(toIndentedString(lienStatus)).append("\n");
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
