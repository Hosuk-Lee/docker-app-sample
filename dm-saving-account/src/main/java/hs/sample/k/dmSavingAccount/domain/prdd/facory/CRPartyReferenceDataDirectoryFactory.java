package hs.sample.k.dmSavingAccount.domain.prdd.facory;

import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import hs.sample.k.apiserver.model.RegisterPartyReferenceDataDirectoryEntryRequest;

public class CRPartyReferenceDataDirectoryFactory {

    private final RegisterPartyReferenceDataDirectoryEntryRequest value;

    private CRPartyReferenceDataDirectoryFactory(
            RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest) {
        this.value = registerPartyReferenceDataDirectoryEntryRequest;
    }

    public static CRPartyReferenceDataDirectoryFactory createFactory(
            RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest) {
        return new CRPartyReferenceDataDirectoryFactory(registerPartyReferenceDataDirectoryEntryRequest);
    }

    public CRPartyReferenceDataDirectory newCRPartyReferenceDataDirectoryEntity() {
        CRPartyReferenceDataDirectory entity =
                CRPartyReferenceDataDirectory.builder()
                        .directoryEntryType(
                                value.getPartyReferenceDataDirectoryEntry().getDirectoryEntryDateType().toString())
                        .build();

        return entity;
    }
}
