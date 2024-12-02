package com.kb.orchestration.api.tranMtg.controller.saga;

public interface SagaEndProcess {

    public String onClose(String guid);

    public String onCancel(String guid);

}
