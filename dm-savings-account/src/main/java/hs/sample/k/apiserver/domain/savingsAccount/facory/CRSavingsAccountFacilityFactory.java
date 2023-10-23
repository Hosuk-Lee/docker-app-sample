package hs.sample.k.apiserver.domain.savingsAccount.facory;

import hs.sample.k.apiserver.domain.savingsAccount.entity.CRSavingsAccountFacility;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityRequest;
import hs.sample.k.apiserver.model.InitiateSavingsAccountFacilityRequestSavingsAccountFacility;

public class CRSavingsAccountFacilityFactory {

    private final InitiateSavingsAccountFacilityRequest value;

    public CRSavingsAccountFacilityFactory(InitiateSavingsAccountFacilityRequest value) {
        this.value = value;
    }
    public static CRSavingsAccountFacilityFactory createFactory(
            InitiateSavingsAccountFacilityRequest initiateSavingsAccountFacilityRequest
    ){
        return new CRSavingsAccountFacilityFactory(initiateSavingsAccountFacilityRequest);
    }

    public CRSavingsAccountFacility newCRSavingsAccountFacilityEntity() {
        InitiateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility = value.getSavingsAccountFacility();
        CRSavingsAccountFacility entity =
                CRSavingsAccountFacility.builder()
                        .accountDetails(savingsAccountFacility.getAccountType())
                        .build();

        return entity;
    }
}
