package hs.sample.k.apiserver.domain.prdd.entity;


import jakarta.persistence.Embeddable;

@Embeddable
public class DatetimeEntity {
    private String dateTimeContent = null;
    private String timeZoneCode = null;
    private String daylightSavingIndicator = null;
}
