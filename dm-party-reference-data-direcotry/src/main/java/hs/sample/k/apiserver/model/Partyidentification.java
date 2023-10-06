package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Partyidentification
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Partyidentification   {
  @JsonProperty("PartyIdentificationType")
  private String partyIdentificationType = null;

  @JsonProperty("PartyIdentification")
  private Identifier partyIdentification = null;

  public Partyidentification partyIdentificationType(String partyIdentificationType) {
    this.partyIdentificationType = partyIdentificationType;
    return this;
  }

  /**
   * Get partyIdentificationType
   * @return partyIdentificationType
   **/
  @Schema(description = "")
  
    public String getPartyIdentificationType() {
    return partyIdentificationType;
  }

  public void setPartyIdentificationType(String partyIdentificationType) {
    this.partyIdentificationType = partyIdentificationType;
  }

  public Partyidentification partyIdentification(Identifier partyIdentification) {
    this.partyIdentification = partyIdentification;
    return this;
  }

  /**
   * Get partyIdentification
   * @return partyIdentification
   **/
  @Schema(description = "")
  
    @Valid
    public Identifier getPartyIdentification() {
    return partyIdentification;
  }

  public void setPartyIdentification(Identifier partyIdentification) {
    this.partyIdentification = partyIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partyidentification partyidentification = (Partyidentification) o;
    return Objects.equals(this.partyIdentificationType, partyidentification.partyIdentificationType) &&
        Objects.equals(this.partyIdentification, partyidentification.partyIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyIdentificationType, partyIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partyidentification {\n");
    
    sb.append("    partyIdentificationType: ").append(toIndentedString(partyIdentificationType)).append("\n");
    sb.append("    partyIdentification: ").append(toIndentedString(partyIdentification)).append("\n");
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
