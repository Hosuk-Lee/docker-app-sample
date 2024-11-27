package com.kb.orchestration.domain.core.command;

import static com.kb.common.global.utils.DateUtils.getSysYms20;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import com.kb.orchestration.domain.core.command.dto.RegistTranInfoInDto;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.enums.CTRL_REC_STUS_CD;
import com.kb.orchestration.domain.core.repository.CmpenTranMgtRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

        repo.save(tranMgt);
    }

}
