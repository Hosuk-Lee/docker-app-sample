package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * > * `OpenDate` -  * `RefreshDate` -  
 */
public enum Directoryentrydatetypevalues {
  OPENDATE("OpenDate"),
    REFRESHDATE("RefreshDate");

  private String value;

  Directoryentrydatetypevalues(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Directoryentrydatetypevalues fromValue(String text) {
    for (Directoryentrydatetypevalues b : Directoryentrydatetypevalues.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
