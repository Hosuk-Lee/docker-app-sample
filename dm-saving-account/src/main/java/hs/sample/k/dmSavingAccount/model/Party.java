package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * Reference to the associated customer (can currently be a person or a company)
 */
@Schema(description = "Reference to the associated customer (can currently be a person or a company)")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Party   {
  @JsonProperty("PartyName")
  private Name partyName = null;

  @JsonProperty("PartyType")
  private Partytypevalues partyType = null;

  @JsonProperty("PartyDateTime")
  private Datetime partyDateTime = null;

  @JsonProperty("PartyIdentification")
  private Partyidentification partyIdentification = null;

  public Party partyName(Name partyName) {
    this.partyName = partyName;
    return this;
  }

  /**
   * Get partyName
   * @return partyName
   **/
  @Schema(description = "")
  
    @Valid
    public Name getPartyName() {
    return partyName;
  }

  public void setPartyName(Name partyName) {
    this.partyName = partyName;
  }

  public Party partyType(Partytypevalues partyType) {
    this.partyType = partyType;
    return this;
  }

  /**
   * Get partyType
   * @return partyType
   **/
  @Schema(description = "")
  
    @Valid
    public Partytypevalues getPartyType() {
    return partyType;
  }

  public void setPartyType(Partytypevalues partyType) {
    this.partyType = partyType;
  }

  public Party partyDateTime(Datetime partyDateTime) {
    this.partyDateTime = partyDateTime;
    return this;
  }

  /**
   * Get partyDateTime
   * @return partyDateTime
   **/
  @Schema(description = "")
  
    @Valid
    public Datetime getPartyDateTime() {
    return partyDateTime;
  }

  public void setPartyDateTime(Datetime partyDateTime) {
    this.partyDateTime = partyDateTime;
  }

  public Party partyIdentification(Partyidentification partyIdentification) {
    this.partyIdentification = partyIdentification;
    return this;
  }

  /**
   * Get partyIdentification
   * @return partyIdentification
   **/
  @Schema(description = "")
  
    @Valid
    public Partyidentification getPartyIdentification() {
    return partyIdentification;
  }

  public void setPartyIdentification(Partyidentification partyIdentification) {
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
    Party party = (Party) o;
    return Objects.equals(this.partyName, party.partyName) &&
        Objects.equals(this.partyType, party.partyType) &&
        Objects.equals(this.partyDateTime, party.partyDateTime) &&
        Objects.equals(this.partyIdentification, party.partyIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyName, partyType, partyDateTime, partyIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Party {\n");
    
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    partyDateTime: ").append(toIndentedString(partyDateTime)).append("\n");
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
