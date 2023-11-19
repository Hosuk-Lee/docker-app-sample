package hs.sample.k.apiserver.domain.prdd.entity;

import hs.sample.k.apiserver.domain.config.RootEntityBase;
import hs.sample.k.apiserver.model.Datetime;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Capture and maintain reference information about some type of entitity within Party Reference Data Directory.
 * 당사자 참조 데이터 디렉터리 내 일부 유형의 법인에 대한 참조 정보를 캡처하고 유지합니다.
 * */

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "PartyReferenceDataDirectory")
@Entity
@Getter
public class CRPartyReferenceDataDirectory extends RootEntityBase {

    @Column
    private String partyReference;

    @Column
    private String directoryEntryType;

    @Embedded
    private DatetimeEntity directoryEntryDate;
}
