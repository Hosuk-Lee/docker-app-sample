package com.kb.orchestration.domain.core;


import static com.kb.common.global.utils.JsonUtils.toJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.context.CommonContext;
import com.kb.orchestration.domain.core.command.CmpenTranMgtCommand;
import com.kb.orchestration.domain.core.command.dto.RegistTranInfoInDto;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.entity.TransactionTrack;
import com.kb.orchestration.domain.core.enums.CTRL_REC_STUS_CD;
import java.util.Map;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class TransactionManagement {

    private final ObjectMapper om;
    private final CmpenTranMgtCommand command;
    private final CommonContext commonContext;

    public CmpenTranMgtEntity regist(Map<String, Object> body) {
        log.info("CommonContext Test {},{} ", commonContext, commonContext.getGuid());
        TransactionTrack transactionTrack = TransactionTrack.builder()
            .inputData(toJson(body))
            .build();

        RegistTranInfoInDto input = RegistTranInfoInDto.builder()
            .guid(String.valueOf(body.getOrDefault("guid", "Dummy")))
            .tranTrackLogCtnt(toJson(transactionTrack))
            .build();
        return command.createTransactionInformation(input);
    }

    public void start(CmpenTranMgtEntity tranMgt, String tranId) {
        // tranId 채번 Or 상속
        if (tranId == null) {
            tranId = "TRX_" + UUID.randomUUID().toString();
        }
        command.updateTransactionInformation(tranMgt,
            CmpenTranMgtEntity.builder()
                .cmpenTranIdnfr(tranId)
                .ctrlRECORDStusCd(CTRL_REC_STUS_CD.START.getCode())
                .build());
    }

    public void addTransactionLog(CmpenTranMgtEntity cmpenTranMgt,
        TransactionLogReqInfo transactionLogReqInfo,
        Object reqData, Map<String, Object> cmpenData) {
        TransactionTrack transactionTrack = null;
        // cmpenTranMgt.getTranTrackLogCtnt(),
    }

    public void updateTrxInfo() {

    }

    public CmpenTranMgtEntity findByGuid(String guid) {

        return null;
    }


}
