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
import com.kb.orchestration.model.RequestIssuedDeviceRequestIssuedDevice;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/**
 * Input: RqBQ Request changes or replacement devices or inventory
 */
@Schema(description = "Input: RqBQ Request changes or replacement devices or inventory")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class RequestIssuedDeviceRequest {
  @JsonProperty("IssuedDevice")
  private RequestIssuedDeviceRequestIssuedDevice issuedDevice = null;

  public RequestIssuedDeviceRequest issuedDevice(RequestIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
    return this;
  }

   /**
   * Get issuedDevice
   * @return issuedDevice
  **/
  @Schema(description = "")
  public RequestIssuedDeviceRequestIssuedDevice getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(RequestIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestIssuedDeviceRequest requestIssuedDeviceRequest = (RequestIssuedDeviceRequest) o;
    return Objects.equals(this.issuedDevice, requestIssuedDeviceRequest.issuedDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDevice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestIssuedDeviceRequest {\n");
    
    sb.append("    issuedDevice: ").append(toIndentedString(issuedDevice)).append("\n");
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
