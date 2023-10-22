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

package hs.sample.k.apiserver.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;





import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The processing schedule for applying interest rates to the account
 */
@Schema(description = "The processing schedule for applying interest rates to the account")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class Rate {
  @JsonProperty("RateValue")
  private String rateValue = null;

  @JsonProperty("RateUnit")
  private String rateUnit = null;

  @JsonProperty("RatePeriod")
  private String ratePeriod = null;

  @JsonProperty("RateCapitalUnit")
  private String rateCapitalUnit = null;

  public Rate rateValue(String rateValue) {
    this.rateValue = rateValue;
    return this;
  }

   /**
   * Get rateValue
   * @return rateValue
  **/
  @Schema(description = "")
  public String getRateValue() {
    return rateValue;
  }

  public void setRateValue(String rateValue) {
    this.rateValue = rateValue;
  }

  public Rate rateUnit(String rateUnit) {
    this.rateUnit = rateUnit;
    return this;
  }

   /**
   * The unit of measure like Percentage or BPS  Basis points (BPS) refers to a common unit of measure for interest rates and other percentages in finance.
   * @return rateUnit
  **/
  @Schema(description = "The unit of measure like Percentage or BPS  Basis points (BPS) refers to a common unit of measure for interest rates and other percentages in finance.")
  public String getRateUnit() {
    return rateUnit;
  }

  public void setRateUnit(String rateUnit) {
    this.rateUnit = rateUnit;
  }

  public Rate ratePeriod(String ratePeriod) {
    this.ratePeriod = ratePeriod;
    return this;
  }

   /**
   * Get ratePeriod
   * @return ratePeriod
  **/
  @Schema(description = "")
  public String getRatePeriod() {
    return ratePeriod;
  }

  public void setRatePeriod(String ratePeriod) {
    this.ratePeriod = ratePeriod;
  }

  public Rate rateCapitalUnit(String rateCapitalUnit) {
    this.rateCapitalUnit = rateCapitalUnit;
    return this;
  }

   /**
   * Get rateCapitalUnit
   * @return rateCapitalUnit
  **/
  @Schema(description = "")
  public String getRateCapitalUnit() {
    return rateCapitalUnit;
  }

  public void setRateCapitalUnit(String rateCapitalUnit) {
    this.rateCapitalUnit = rateCapitalUnit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rate rate = (Rate) o;
    return Objects.equals(this.rateValue, rate.rateValue) &&
        Objects.equals(this.rateUnit, rate.rateUnit) &&
        Objects.equals(this.ratePeriod, rate.ratePeriod) &&
        Objects.equals(this.rateCapitalUnit, rate.rateCapitalUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateValue, rateUnit, ratePeriod, rateCapitalUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    
    sb.append("    rateValue: ").append(toIndentedString(rateValue)).append("\n");
    sb.append("    rateUnit: ").append(toIndentedString(rateUnit)).append("\n");
    sb.append("    ratePeriod: ").append(toIndentedString(ratePeriod)).append("\n");
    sb.append("    rateCapitalUnit: ").append(toIndentedString(rateCapitalUnit)).append("\n");
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
