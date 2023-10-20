package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * Datetime
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Datetime   {
  @JsonProperty("DateTimeContent")
  private String dateTimeContent = null;

  @JsonProperty("TimeZoneCode")
  private String timeZoneCode = null;

  @JsonProperty("DaylightSavingIndicator")
  private String daylightSavingIndicator = null;

  public Datetime dateTimeContent(String dateTimeContent) {
    this.dateTimeContent = dateTimeContent;
    return this;
  }

  /**
   * Get dateTimeContent
   * @return dateTimeContent
   **/
  @Schema(description = "")
  
    public String getDateTimeContent() {
    return dateTimeContent;
  }

  public void setDateTimeContent(String dateTimeContent) {
    this.dateTimeContent = dateTimeContent;
  }

  public Datetime timeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
    return this;
  }

  /**
   * Get timeZoneCode
   * @return timeZoneCode
   **/
  @Schema(description = "")
  
    public String getTimeZoneCode() {
    return timeZoneCode;
  }

  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }

  public Datetime daylightSavingIndicator(String daylightSavingIndicator) {
    this.daylightSavingIndicator = daylightSavingIndicator;
    return this;
  }

  /**
   * Get daylightSavingIndicator
   * @return daylightSavingIndicator
   **/
  @Schema(description = "")
  
    public String getDaylightSavingIndicator() {
    return daylightSavingIndicator;
  }

  public void setDaylightSavingIndicator(String daylightSavingIndicator) {
    this.daylightSavingIndicator = daylightSavingIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datetime datetime = (Datetime) o;
    return Objects.equals(this.dateTimeContent, datetime.dateTimeContent) &&
        Objects.equals(this.timeZoneCode, datetime.timeZoneCode) &&
        Objects.equals(this.daylightSavingIndicator, datetime.daylightSavingIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimeContent, timeZoneCode, daylightSavingIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datetime {\n");
    
    sb.append("    dateTimeContent: ").append(toIndentedString(dateTimeContent)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
    sb.append("    daylightSavingIndicator: ").append(toIndentedString(daylightSavingIndicator)).append("\n");
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
