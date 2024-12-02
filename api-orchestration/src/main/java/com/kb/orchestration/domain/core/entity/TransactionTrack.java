package com.kb.orchestration.domain.core.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class TransactionTrack {

    private String inputData;
    private String outputData;
    private String path;

    @Default
    public List<TransactionLog> transactionLogs = new ArrayList<>();

    @Getter
    @Builder
    public static class TransactionLog {

        private int sequence;
        private String requestTargetName;
        private String requestType;
        private String requestData;
        private String status;
        private boolean compensateTargetYn;
        private String compensateBeanName;
        private String compensateMethodName;

        @Default
        private int compensateRetryCount = 0;
        private boolean compensateResult;
        private Map<String, Object> compensateParamValue;

        public void updateSequence(int sequence) {
            this.sequence = sequence;
        }

        public void updateCompensateResult(boolean compensateResult) {
            this.compensateResult = compensateResult;
            this.compensateRetryCount++;
        }
    }

    public enum RequestType {
        RESTApi,
        Kafka,
        ETC;

        private RequestType() {
        }
    }

    public void addTransactionLog(TransactionLog tranLog) {
        tranLog.updateSequence(transactionLogs.size() + 1);
        transactionLogs.add(tranLog);
    }


}
