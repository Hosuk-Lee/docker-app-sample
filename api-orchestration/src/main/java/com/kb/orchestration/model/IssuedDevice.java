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
 * IssuedDevice
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class IssuedDevice {
  @JsonProperty("IssuedDeviceType")
  private String issuedDeviceType = null;

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

  public IssuedDevice issuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
    return this;
  }

   /**
   * The type of issued device/inventory (e.g. checkbook, pay-in slip)
   * @return issuedDeviceType
  **/
  @Schema(description = "The type of issued device/inventory (e.g. checkbook, pay-in slip)")
  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }

  public IssuedDevice issuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
    return this;
  }

   /**
   * Definition of the inventory item, including processing and handling guidelines and rules
   * @return issuedDeviceDescription
  **/
  @Schema(description = "Definition of the inventory item, including processing and handling guidelines and rules")
  public String getIssuedDeviceDescription() {
    return issuedDeviceDescription;
  }

  public void setIssuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
  }

  public IssuedDevice issuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
    return this;
  }

   /**
   * Definition of the processing option and impact (e.g. lost check handling)
   * @return issuedDeviceOptionDefinition
  **/
  @Schema(description = "Definition of the processing option and impact (e.g. lost check handling)")
  public String getIssuedDeviceOptionDefinition() {
    return issuedDeviceOptionDefinition;
  }

  public void setIssuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
  }

  public IssuedDevice issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
    return this;
  }

   /**
   * The processing option setting
   * @return issuedDeviceOptionSetting
  **/
  @Schema(description = "The processing option setting")
  public String getIssuedDeviceOptionSetting() {
    return issuedDeviceOptionSetting;
  }

  public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
  }

  public IssuedDevice issuedDeviceProperty(String issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
    return this;
  }

   /**
   * A property of the issued device/inventory (e.g. card, checkbook, pay-in slip)
   * @return issuedDeviceProperty
  **/
  @Schema(description = "A property of the issued device/inventory (e.g. card, checkbook, pay-in slip)")
  public String getIssuedDeviceProperty() {
    return issuedDeviceProperty;
  }

  public void setIssuedDeviceProperty(String issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
  }

  public IssuedDevice issuedDevicePropertyType(String issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
    return this;
  }

   /**
   * Tracked property of the issued device/inventory (e.g. issued check numbers)
   * @return issuedDevicePropertyType
  **/
  @Schema(description = "Tracked property of the issued device/inventory (e.g. issued check numbers)")
  public String getIssuedDevicePropertyType() {
    return issuedDevicePropertyType;
  }

  public void setIssuedDevicePropertyType(String issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
  }

  public IssuedDevice issuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
    return this;
  }

   /**
   * The tracked values associated with an issued device/inventory item
   * @return issuedDevicePropertyValue
  **/
  @Schema(description = "The tracked values associated with an issued device/inventory item")
  public String getIssuedDevicePropertyValue() {
    return issuedDevicePropertyValue;
  }

  public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
  }

  public IssuedDevice issuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
    return this;
  }

   /**
   * The tracked status of the device/inventory item (e.g. active, suspended, cancelled)
   * @return issuedDeviceStatus
  **/
  @Schema(description = "The tracked status of the device/inventory item (e.g. active, suspended, cancelled)")
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
    IssuedDevice issuedDevice = (IssuedDevice) o;
    return Objects.equals(this.issuedDeviceType, issuedDevice.issuedDeviceType) &&
        Objects.equals(this.issuedDeviceDescription, issuedDevice.issuedDeviceDescription) &&
        Objects.equals(this.issuedDeviceOptionDefinition, issuedDevice.issuedDeviceOptionDefinition) &&
        Objects.equals(this.issuedDeviceOptionSetting, issuedDevice.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDeviceProperty, issuedDevice.issuedDeviceProperty) &&
        Objects.equals(this.issuedDevicePropertyType, issuedDevice.issuedDevicePropertyType) &&
        Objects.equals(this.issuedDevicePropertyValue, issuedDevice.issuedDevicePropertyValue) &&
        Objects.equals(this.issuedDeviceStatus, issuedDevice.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceType, issuedDeviceDescription, issuedDeviceOptionDefinition, issuedDeviceOptionSetting, issuedDeviceProperty, issuedDevicePropertyType, issuedDevicePropertyValue, issuedDeviceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedDevice {\n");
    
    sb.append("    issuedDeviceType: ").append(toIndentedString(issuedDeviceType)).append("\n");
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
