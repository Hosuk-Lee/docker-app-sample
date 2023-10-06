package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * > * `Agreementinvolvement` -  * `Partyinvolvement` -  * `Arrangementinvolvement` -  * `Designspecificationinvolvement` -  * `Relationshipinvolvement` -  * `Locationinvolvement` -  * `Bankguaranteeinvolvement` -  
 */
public enum Partyinvolvementtypevalues {
  AGREEMENTINVOLVEMENT("Agreementinvolvement"),
    PARTYINVOLVEMENT("Partyinvolvement"),
    ARRANGEMENTINVOLVEMENT("Arrangementinvolvement"),
    DESIGNSPECIFICATIONINVOLVEMENT("Designspecificationinvolvement"),
    RELATIONSHIPINVOLVEMENT("Relationshipinvolvement"),
    LOCATIONINVOLVEMENT("Locationinvolvement"),
    BANKGUARANTEEINVOLVEMENT("Bankguaranteeinvolvement");

  private String value;

  Partyinvolvementtypevalues(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Partyinvolvementtypevalues fromValue(String text) {
    for (Partyinvolvementtypevalues b : Partyinvolvementtypevalues.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
