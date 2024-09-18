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
 * InitiateIssuedDeviceResponseIssuedDevice
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateIssuedDeviceResponseIssuedDevice {
  @JsonProperty("IssuedDeviceDescription")
  private String issuedDeviceDescription = null;

  @JsonProperty("IssuedDeviceOptionDefinition")
  private String issuedDeviceOptionDefinition = null;

  @JsonProperty("IssuedDeviceOptionSetting")
  private String issuedDeviceOptionSetting = null;

  @JsonProperty("IssuedDeviceProperty")
  private String issuedDeviceProperty = null;

  @JsonProperty("IssuedDevicePropertyType")
  private String issuedDevicePropertyType = null;

  @JsonProperty("IssuedDevicePropertyValue")
  private String issuedDevicePropertyValue = null;

  @JsonProperty("IssuedDeviceStatus")
  private String issuedDeviceStatus = null;

  public InitiateIssuedDeviceResponseIssuedDevice issuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
    return this;
  }

   /**
   *  
   * @return issuedDeviceDescription
  **/
  @Schema(description = " ")
  public String getIssuedDeviceDescription() {
    return issuedDeviceDescription;
  }

  public void setIssuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
  }

  public InitiateIssuedDeviceResponseIssuedDevice issuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
    return this;
  }

   /**
   *  
   * @return issuedDeviceOptionDefinition
  **/
  @Schema(description = " ")
  public String getIssuedDeviceOptionDefinition() {
    return issuedDeviceOptionDefinition;
  }

  public void setIssuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
  }

  public InitiateIssuedDeviceResponseIssuedDevice issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
    return this;
  }

   /**
   *  
   * @return issuedDeviceOptionSetting
  **/
  @Schema(description = " ")
  public String getIssuedDeviceOptionSetting() {
    return issuedDeviceOptionSetting;
  }

  public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
  }

  public InitiateIssuedDeviceResponseIssuedDevice issuedDeviceProperty(String issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
    return this;
  }

   /**
   *  
   * @return issuedDeviceProperty
  **/
  @Schema(description = " ")
  public String getIssuedDeviceProperty() {
    return issuedDeviceProperty;
  }

  public void setIssuedDeviceProperty(String issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
  }

  public InitiateIssuedDeviceResponseIssuedDevice issuedDevicePropertyType(String issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
    return this;
  }

   /**
   *  
   * @return issuedDevicePropertyType
  **/
  @Schema(description = " ")
  public String getIssuedDevicePropertyType() {
    return issuedDevicePropertyType;
  }

  public void setIssuedDevicePropertyType(String issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
  }

  public InitiateIssuedDeviceResponseIssuedDevice issuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
    return this;
  }

   /**
   *  
   * @return issuedDevicePropertyValue
  **/
  @Schema(description = " ")
  public String getIssuedDevicePropertyValue() {
    return issuedDevicePropertyValue;
  }

  public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
  }

  public InitiateIssuedDeviceResponseIssuedDevice issuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
    return this;
  }

   /**
   *  
   * @return issuedDeviceStatus
  **/
  @Schema(description = " ")
  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceResponseIssuedDevice initiateIssuedDeviceResponseIssuedDevice = (InitiateIssuedDeviceResponseIssuedDevice) o;
    return Objects.equals(this.issuedDeviceDescription, initiateIssuedDeviceResponseIssuedDevice.issuedDeviceDescription) &&
        Objects.equals(this.issuedDeviceOptionDefinition, initiateIssuedDeviceResponseIssuedDevice.issuedDeviceOptionDefinition) &&
        Objects.equals(this.issuedDeviceOptionSetting, initiateIssuedDeviceResponseIssuedDevice.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDeviceProperty, initiateIssuedDeviceResponseIssuedDevice.issuedDeviceProperty) &&
        Objects.equals(this.issuedDevicePropertyType, initiateIssuedDeviceResponseIssuedDevice.issuedDevicePropertyType) &&
        Objects.equals(this.issuedDevicePropertyValue, initiateIssuedDeviceResponseIssuedDevice.issuedDevicePropertyValue) &&
        Objects.equals(this.issuedDeviceStatus, initiateIssuedDeviceResponseIssuedDevice.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceDescription, issuedDeviceOptionDefinition, issuedDeviceOptionSetting, issuedDeviceProperty, issuedDevicePropertyType, issuedDevicePropertyValue, issuedDeviceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceResponseIssuedDevice {\n");
    
    sb.append("    issuedDeviceDescription: ").append(toIndentedString(issuedDeviceDescription)).append("\n");
    sb.append("    issuedDeviceOptionDefinition: ").append(toIndentedString(issuedDeviceOptionDefinition)).append("\n");
    sb.append("    issuedDeviceOptionSetting: ").append(toIndentedString(issuedDeviceOptionSetting)).append("\n");
    sb.append("    issuedDeviceProperty: ").append(toIndentedString(issuedDeviceProperty)).append("\n");
    sb.append("    issuedDevicePropertyType: ").append(toIndentedString(issuedDevicePropertyType)).append("\n");
    sb.append("    issuedDevicePropertyValue: ").append(toIndentedString(issuedDevicePropertyValue)).append("\n");
    sb.append("    issuedDeviceStatus: ").append(toIndentedString(issuedDeviceStatus)).append("\n");
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
