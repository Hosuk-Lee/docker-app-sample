package hs.sample.k.dmSavingAccount.domain.prdd.service;

import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import hs.sample.k.apiserver.domain.prdd.repository.CRPartyReferenceDataDirectoryReposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewInstacePrdd {

    private final CRPartyReferenceDataDirectoryReposiroty reposiroty;
    public void execute(CRPartyReferenceDataDirectory crPartyReferenceDataDirectory) {
        CRPartyReferenceDataDirectory save = reposiroty.save(crPartyReferenceDataDirectory);
    }

}
