package com.kb.orchestration.domain.core.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TrxInfoUpdateDto {

    private String ctrlRECORDStusCd;
    private String ctrlRECORDDmndYMS;
    private String ctrlRECORDModfiYMS;
}
