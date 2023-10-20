package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * Involvedparty
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Involvedparty   {
  @JsonProperty("PartyReference")
  private Party partyReference = null;

  @JsonProperty("PartyInvolvement")
  private Partyrole partyInvolvement = null;

  public Involvedparty partyReference(Party partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Get partyReference
   * @return partyReference
   **/
  @Schema(description = "")
  
    @Valid
    public Party getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(Party partyReference) {
    this.partyReference = partyReference;
  }

  public Involvedparty partyInvolvement(Partyrole partyInvolvement) {
    this.partyInvolvement = partyInvolvement;
    return this;
  }

  /**
   * Get partyInvolvement
   * @return partyInvolvement
   **/
  @Schema(description = "")
  
    @Valid
    public Partyrole getPartyInvolvement() {
    return partyInvolvement;
  }

  public void setPartyInvolvement(Partyrole partyInvolvement) {
    this.partyInvolvement = partyInvolvement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Involvedparty involvedparty = (Involvedparty) o;
    return Objects.equals(this.partyReference, involvedparty.partyReference) &&
        Objects.equals(this.partyInvolvement, involvedparty.partyInvolvement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReference, partyInvolvement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Involvedparty {\n");
    
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    partyInvolvement: ").append(toIndentedString(partyInvolvement)).append("\n");
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
