package com.kb.sample.savings.domain.savingsAccount.repository;

import com.kb.sample.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRSavingsAccountFacilityReposiroty extends
        JpaRepository<CRSavingsAccountFacility, Long> {
}
