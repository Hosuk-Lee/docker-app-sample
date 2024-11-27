package com.kb.orchestration.domain.core.enums;

import lombok.Getter;

@Getter
public enum CTRL_REC_STUS_CD {
    INIT("Init"),
    START("Start"),
    DONE("Done"),
    ERROR("Error"),
    COMPLETED("Completed"),
    COMPENSATING("Compensating"),
    COMPENSATED("Compensated"),
    AFTER("After");

    private final String code;


    CTRL_REC_STUS_CD(String code) {
        this.code = code;
    }
}
