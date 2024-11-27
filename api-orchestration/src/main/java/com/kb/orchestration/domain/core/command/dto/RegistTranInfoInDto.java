package com.kb.orchestration.domain.core.command.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegistTranInfoInDto {

    private String guid;
    private String tranTrackLogCtnt;

}
