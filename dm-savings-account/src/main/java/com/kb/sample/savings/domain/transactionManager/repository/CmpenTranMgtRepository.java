package com.kb.sample.savings.domain.transactionManager.repository;

import com.kb.sample.savings.domain.transactionManager.entity.CmpenTranMgt;
import jakarta.persistence.LockModeType;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

public interface CmpenTranMgtRepository extends JpaRepository<CmpenTranMgt, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select e from CmpenTranMgt e where e.id = ?1")
    Optional<CmpenTranMgt> findOneForUpdate(Long id);


}
