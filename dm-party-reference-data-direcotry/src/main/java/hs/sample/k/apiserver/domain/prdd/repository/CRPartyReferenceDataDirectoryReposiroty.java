package hs.sample.k.apiserver.domain.prdd.repository;

import hs.sample.k.apiserver.domain.prdd.entity.CRPartyReferenceDataDirectory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRPartyReferenceDataDirectoryReposiroty extends
        JpaRepository<CRPartyReferenceDataDirectory, Long> {
}
