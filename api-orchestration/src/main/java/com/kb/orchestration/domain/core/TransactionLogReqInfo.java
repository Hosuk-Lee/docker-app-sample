package com.kb.orchestration.domain.core;

public interface TransactionLogReqInfo {

    public String getCallName();
    public String getBeanName();
    public String getMethodName();
    public Boolean isCompensate();
}
