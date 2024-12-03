package hs.sample.k.savings.domain.transactionManager;

import com.kb.common.global.context.CommonContext;


public record TransactionManagerRec(
    String acno, Integer nth, CommonContext commonContext, String tranId
) {

    public String getGuid() {
        return commonContext.getGuid();
    }
}
