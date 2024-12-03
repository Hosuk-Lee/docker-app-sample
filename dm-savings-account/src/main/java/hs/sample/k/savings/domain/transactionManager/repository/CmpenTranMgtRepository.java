package hs.sample.k.savings.domain.transactionManager.repository;

import hs.sample.k.savings.domain.transactionManager.entity.CmpenTranMgt;
import jakarta.persistence.LockModeType;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

public interface CmpenTranMgtRepository extends JpaRepository<CmpenTranMgt, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<CmpenTranMgt> findWriteLockByOne(Example<CmpenTranMgt> example);
}
