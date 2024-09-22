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
 * InitiatePaymentsResponseSavingsAccountFacility
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiatePaymentsResponseSavingsAccountFacility {
  @JsonProperty("TaxReference")
  private String taxReference = null;

  @JsonProperty("AssociationType")
  private String associationType = null;

  @JsonProperty("AssociationObligationEntitlement")
  private String associationObligationEntitlement = null;

  @JsonProperty("AssociationReference")
  private String associationReference = null;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings = null;

  @JsonProperty("DateType")
  private String dateType = null;

  public InitiatePaymentsResponseSavingsAccountFacility taxReference(String taxReference) {
    this.taxReference = taxReference;
    return this;
  }

   /**
   *  
   * @return taxReference
  **/
  @Schema(description = " ")
  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }

  public InitiatePaymentsResponseSavingsAccountFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

   /**
   *  
   * @return associationType
  **/
  @Schema(description = " ")
  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public InitiatePaymentsResponseSavingsAccountFacility associationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
    return this;
  }

   /**
   *  
   * @return associationObligationEntitlement
  **/
  @Schema(description = " ")
  public String getAssociationObligationEntitlement() {
    return associationObligationEntitlement;
  }

  public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
  }

  public InitiatePaymentsResponseSavingsAccountFacility associationReference(String associationReference) {
    this.associationReference = associationReference;
    return this;
  }

   /**
   *  
   * @return associationReference
  **/
  @Schema(description = " ")
  public String getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(String associationReference) {
    this.associationReference = associationReference;
  }

  public InitiatePaymentsResponseSavingsAccountFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

   /**
   *  
   * @return positionLimitSettings
  **/
  @Schema(description = " ")
  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public InitiatePaymentsResponseSavingsAccountFacility dateType(String dateType) {
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
    InitiatePaymentsResponseSavingsAccountFacility initiatePaymentsResponseSavingsAccountFacility = (InitiatePaymentsResponseSavingsAccountFacility) o;
    return Objects.equals(this.taxReference, initiatePaymentsResponseSavingsAccountFacility.taxReference) &&
        Objects.equals(this.associationType, initiatePaymentsResponseSavingsAccountFacility.associationType) &&
        Objects.equals(this.associationObligationEntitlement, initiatePaymentsResponseSavingsAccountFacility.associationObligationEntitlement) &&
        Objects.equals(this.associationReference, initiatePaymentsResponseSavingsAccountFacility.associationReference) &&
        Objects.equals(this.positionLimitSettings, initiatePaymentsResponseSavingsAccountFacility.positionLimitSettings) &&
        Objects.equals(this.dateType, initiatePaymentsResponseSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxReference, associationType, associationObligationEntitlement, associationReference, positionLimitSettings, dateType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsResponseSavingsAccountFacility {\n");
    
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationEntitlement: ").append(toIndentedString(associationObligationEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
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