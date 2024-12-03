package hs.sample.k.savings.domain.transactionManager.command;

import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import hs.sample.k.savings.domain.transactionManager.entity.CmpenTranMgt;
import hs.sample.k.savings.domain.transactionManager.repository.CmpenTranMgtRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class CmpenTranMgtCommand {

    private final CmpenTranMgtRepository repo;

    public void updateRecord(
        CmpenTranMgt tranMgt,
        CmpenTranMgt updateTanMgt) {
        // TODO 비교문
        if (updateTanMgt.getCmpenTranIdnfr() != null) {
            tranMgt.setCmpenTranIdnfr(updateTanMgt.getCmpenTranIdnfr());
        }
        if (updateTanMgt.getCtrlRECORDStusCd() != null) {
            tranMgt.setCtrlRECORDStusCd(updateTanMgt.getCtrlRECORDStusCd());
        }
        if (updateTanMgt.getCtrlRECORDDmndYMS() != null) {
            tranMgt.setCtrlRECORDDmndYMS(updateTanMgt.getCtrlRECORDDmndYMS());
        }
        if (updateTanMgt.getCtrlRECORDModfiYMS() != null) {
            tranMgt.setCtrlRECORDModfiYMS(updateTanMgt.getCtrlRECORDModfiYMS());
        }
        if (updateTanMgt.getCtrlRECORDFnshYMS() != null) {
            tranMgt.setCtrlRECORDFnshYMS(updateTanMgt.getCtrlRECORDFnshYMS());
        }
        if (updateTanMgt.getOrcpyNFAFUB101() != null) {
            tranMgt.setOrcpyNFAFUB101(updateTanMgt.getOrcpyNFAFUB101());
        }
        repo.save(tranMgt);
    }

    public CmpenTranMgt find(CmpenTranMgt e) {
        return repo.findOne(Example.of(e))
            .orElseThrow(() -> new BusinessException(
                GErrorCode.DB_DATA_NOT_FOUND,
                GTreatCode.DATA_NOT_FOUND,
                "Transaction not found error"));
    }

    public CmpenTranMgt findLock(CmpenTranMgt e) {
        return repo.findOne(Example.of(e))
            .orElseThrow(() -> new BusinessException(
                GErrorCode.DB_DATA_NOT_FOUND,
                GTreatCode.DATA_NOT_FOUND,
                "Transaction not found error"));
    }

    public Optional<CmpenTranMgt> findLockOpt(CmpenTranMgt e) {
        return repo.findOne(Example.of(e));
    }
}
