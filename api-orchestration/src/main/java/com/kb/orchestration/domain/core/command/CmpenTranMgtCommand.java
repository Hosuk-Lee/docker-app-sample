package com.kb.orchestration.domain.core.command;

import com.kb.orchestration.domain.core.command.dto.RegistTranInfoInDto;
import com.kb.orchestration.domain.core.entity.CmpenTranMgtEntity;
import com.kb.orchestration.domain.core.repository.CmpenTranMgtRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service("CmpenTranMgtCommand")
public class CmpenTranMgtCommand {

    private final CmpenTranMgtRepository repo;

    public CmpenTranMgtEntity registTransactionInformation(
        RegistTranInfoInDto registTranInfoInDto
    ) {
return null;
    }

}
