package com.kb.orchestration.domain.core.command;

import static com.kb.common.global.utils.DateUtils.getSysYms20;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.orchestration.domain.core.command.dto.RegistTranInfoInDto;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.enums.CTRL_REC_STUS_CD;
import com.kb.orchestration.domain.core.repository.CmpenTranMgtRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service("CmpenTranMgtCommand")
public class CmpenTranMgtCommand {

    private final CmpenTranMgtRepository repo;

    public CmpenTranMgtEntity createTransactionInformation(
        RegistTranInfoInDto input
    ) {
        return repo.save(CmpenTranMgtEntity.builder()
            .guid(input.getGuid())
            .cmpenTranIdnfr(EMPTY)
            .ctrlRECORDStusCd(CTRL_REC_STUS_CD.INIT.getCode())
            .ctrlRECORDDmndYMS(getSysYms20())
            .ctrlRECORDModfiYMS(EMPTY)
            .ctrlRECORDFnshYMS(EMPTY)
            .tranTrackLogCtnt(input.getTranTrackLogCtnt())
            .build());
    }

    public void updateTransactionInformation(
        CmpenTranMgtEntity tranMgt,
        CmpenTranMgtEntity updateTanMgt) {
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
        if (updateTanMgt.getTranTrackLogCtnt() != null) {
            tranMgt.setTranTrackLogCtnt(updateTanMgt.getTranTrackLogCtnt());
        }
        repo.save(tranMgt);
    }

    public CmpenTranMgtEntity find(CmpenTranMgtEntity entity) {
        return repo.findOne(Example.of(entity))
            .orElseThrow(() -> new BusinessException(
                GErrorCode.DB_DATA_NOT_FOUND,
                GTreatCode.DATA_NOT_FOUND,
                "Transaction not found error"));
    }

}
