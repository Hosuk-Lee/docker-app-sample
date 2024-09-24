package com.kb.orchestration.domain.core;


import static com.kb.common.global.utils.JsonUtils.toJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.context.CommonContext;
import com.kb.orchestration.domain.core.command.CmpenTranMgtCommand;
import com.kb.orchestration.domain.core.command.dto.RegistTranInfoInDto;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.entity.TransactionTrack;
import java.util.Map;
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

        log.info("CommonContext Test {},{} ", commonContext,commonContext.getGuid());
        TransactionTrack transactionTrack = TransactionTrack.builder()
            .inputData(toJson(body))
            .build();

        RegistTranInfoInDto input = RegistTranInfoInDto.builder()
//            .guid()
            .tranTrackLogCtnt(toJson(transactionTrack))

            .build();

        return null;
    }

    public CmpenTranMgtEntity findByGuid(String guid) {

        return null;
    }


}
