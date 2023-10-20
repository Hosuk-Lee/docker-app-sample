package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * Datetimeperiod
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Datetimeperiod   {
  @JsonProperty("FromDateTime")
  private Datetime fromDateTime = null;

  @JsonProperty("ToDateTime")
  private Datetime toDateTime = null;

  public Datetimeperiod fromDateTime(Datetime fromDateTime) {
    this.fromDateTime = fromDateTime;
    return this;
  }

  /**
   * Get fromDateTime
   * @return fromDateTime
   **/
  @Schema(description = "")
  
    @Valid
    public Datetime getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(Datetime fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public Datetimeperiod toDateTime(Datetime toDateTime) {
    this.toDateTime = toDateTime;
    return this;
  }

  /**
   * Get toDateTime
   * @return toDateTime
   **/
  @Schema(description = "")
  
    @Valid
    public Datetime getToDateTime() {
    return toDateTime;
  }

  public void setToDateTime(Datetime toDateTime) {
    this.toDateTime = toDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datetimeperiod datetimeperiod = (Datetimeperiod) o;
    return Objects.equals(this.fromDateTime, datetimeperiod.fromDateTime) &&
        Objects.equals(this.toDateTime, datetimeperiod.toDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDateTime, toDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datetimeperiod {\n");
    
    sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
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
