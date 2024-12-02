package hs.sample.k.apiserver.domain.transactionManager;

import com.kb.common.global.context.CommonContext;

public record TransactionManagerRec(
    String acno, Integer nth, CommonContext commonContext, String tranId
) {

}
