package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * The start date for the relationship
 */
@Schema(description = "The start date for the relationship")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Date   {
  @JsonProperty("DateContent")
  private String dateContent = null;

  public Date dateContent(String dateContent) {
    this.dateContent = dateContent;
    return this;
  }

  /**
   * Get dateContent
   * @return dateContent
   **/
  @Schema(description = "")
  
    public String getDateContent() {
    return dateContent;
  }

  public void setDateContent(String dateContent) {
    this.dateContent = dateContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Date date = (Date) o;
    return Objects.equals(this.dateContent, date.dateContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Date {\n");
    
    sb.append("    dateContent: ").append(toIndentedString(dateContent)).append("\n");
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
