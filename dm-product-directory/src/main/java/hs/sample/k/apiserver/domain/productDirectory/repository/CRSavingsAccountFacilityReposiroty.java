package hs.sample.k.apiserver.domain.productDirectory.repository;

import hs.sample.k.apiserver.domain.productDirectory.entity.CRSavingsAccountFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRSavingsAccountFacilityReposiroty extends
        JpaRepository<CRSavingsAccountFacility, Long> {
}
