package hs.sample.k.savings.domain.savingsAccount.repository;

import hs.sample.k.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRSavingsAccountFacilityReposiroty extends
        JpaRepository<CRSavingsAccountFacility, Long> {
}
