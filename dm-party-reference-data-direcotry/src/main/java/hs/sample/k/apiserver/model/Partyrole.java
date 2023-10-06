package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Partyrole
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Partyrole   {
  @JsonProperty("PartyRoleType")
  private Text partyRoleType = null;

  @JsonProperty("PartyRoleName")
  private Name partyRoleName = null;

  @JsonProperty("PartyRoleValidityPeriod")
  private Datetimeperiod partyRoleValidityPeriod = null;

  @JsonProperty("PartyInvolvementType")
  private Partyinvolvementtypevalues partyInvolvementType = null;

  public Partyrole partyRoleType(Text partyRoleType) {
    this.partyRoleType = partyRoleType;
    return this;
  }

  /**
   * Get partyRoleType
   * @return partyRoleType
   **/
  @Schema(description = "")
  
    @Valid
    public Text getPartyRoleType() {
    return partyRoleType;
  }

  public void setPartyRoleType(Text partyRoleType) {
    this.partyRoleType = partyRoleType;
  }

  public Partyrole partyRoleName(Name partyRoleName) {
    this.partyRoleName = partyRoleName;
    return this;
  }

  /**
   * Get partyRoleName
   * @return partyRoleName
   **/
  @Schema(description = "")
  
    @Valid
    public Name getPartyRoleName() {
    return partyRoleName;
  }

  public void setPartyRoleName(Name partyRoleName) {
    this.partyRoleName = partyRoleName;
  }

  public Partyrole partyRoleValidityPeriod(Datetimeperiod partyRoleValidityPeriod) {
    this.partyRoleValidityPeriod = partyRoleValidityPeriod;
    return this;
  }

  /**
   * Get partyRoleValidityPeriod
   * @return partyRoleValidityPeriod
   **/
  @Schema(description = "")
  
    @Valid
    public Datetimeperiod getPartyRoleValidityPeriod() {
    return partyRoleValidityPeriod;
  }

  public void setPartyRoleValidityPeriod(Datetimeperiod partyRoleValidityPeriod) {
    this.partyRoleValidityPeriod = partyRoleValidityPeriod;
  }

  public Partyrole partyInvolvementType(Partyinvolvementtypevalues partyInvolvementType) {
    this.partyInvolvementType = partyInvolvementType;
    return this;
  }

  /**
   * Get partyInvolvementType
   * @return partyInvolvementType
   **/
  @Schema(description = "")
  
    @Valid
    public Partyinvolvementtypevalues getPartyInvolvementType() {
    return partyInvolvementType;
  }

  public void setPartyInvolvementType(Partyinvolvementtypevalues partyInvolvementType) {
    this.partyInvolvementType = partyInvolvementType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partyrole partyrole = (Partyrole) o;
    return Objects.equals(this.partyRoleType, partyrole.partyRoleType) &&
        Objects.equals(this.partyRoleName, partyrole.partyRoleName) &&
        Objects.equals(this.partyRoleValidityPeriod, partyrole.partyRoleValidityPeriod) &&
        Objects.equals(this.partyInvolvementType, partyrole.partyInvolvementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRoleType, partyRoleName, partyRoleValidityPeriod, partyInvolvementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partyrole {\n");
    
    sb.append("    partyRoleType: ").append(toIndentedString(partyRoleType)).append("\n");
    sb.append("    partyRoleName: ").append(toIndentedString(partyRoleName)).append("\n");
    sb.append("    partyRoleValidityPeriod: ").append(toIndentedString(partyRoleValidityPeriod)).append("\n");
    sb.append("    partyInvolvementType: ").append(toIndentedString(partyInvolvementType)).append("\n");
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
