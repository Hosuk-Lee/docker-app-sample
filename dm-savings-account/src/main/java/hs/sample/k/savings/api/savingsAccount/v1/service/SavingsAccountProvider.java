package hs.sample.k.savings.api.savingsAccount.v1.service;

import static com.kb.common.global.utils.DateUtils.getSysYms;

import com.kb.common.global.context.CommonContext;
import hs.sample.k.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import hs.sample.k.savings.domain.savingsAccount.facory.CRSavingsAccountFacilityFactory;
import hs.sample.k.savings.domain.savingsAccount.repository.CRSavingsAccountFacilityReposiroty;
import hs.sample.k.savings.domain.savingsAccount.service.CreateNewSavingsAccount;
import hs.sample.k.savings.domain.transactionManager.TransactionManagerRec;
import hs.sample.k.savings.domain.transactionManager.entity.CmpenTranMgt;
import hs.sample.k.savings.model.InitiateSavingsAccountFacilityRequest;
import java.math.BigInteger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SavingsAccountProvider {

    // private final SampleApiService sub1ApiService;
    private final CommonContext context;
    private final CreateNewSavingsAccount createNewSavingsAccount;
    private final CRSavingsAccountFacilityReposiroty repo;


    public CRSavingsAccountFacility createNewSavingsAccount(
        InitiateSavingsAccountFacilityRequest input) {
        // Gather
        // Account Number
        String acno = "04390204" + getSysYms("yyyyMMddHHmmss");

        CmpenTranMgt cmpenTranMgt = createTranMgt(input, acno);
        CRSavingsAccountFacilityFactory factory = CRSavingsAccountFacilityFactory.createFactory(
            input);
        // TODO Factory Class 안에서 검증로직 추가.
        if ("jjeongil".equals(input.getSavingsAccountFacility().getLinkType())) {
            log.info("강제오류");
            throw new RuntimeException("ASDF");
        }
        CRSavingsAccountFacility entity = factory.newCRSavingsAccountFacilityEntity();
        entity = repo.save(entity);
        return entity;
    }

    private CmpenTranMgt createTranMgt(InitiateSavingsAccountFacilityRequest input, String acno) {
        TransactionManagerRec transactionManagerRec = new TransactionManagerRec(
            acno, BigInteger.ZERO.intValue(), context, context.getGuid()
        );
        return null;
    }


    public CRSavingsAccountFacility retrieveSavingsAccountFacility(String savingsaccountid) {
        return repo.findById(Long.valueOf(savingsaccountid)).orElseThrow();
    }
}
