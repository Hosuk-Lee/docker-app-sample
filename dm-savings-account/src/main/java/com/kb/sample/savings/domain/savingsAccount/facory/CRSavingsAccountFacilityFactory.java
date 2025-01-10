package com.kb.sample.savings.domain.savingsAccount.facory;

import com.kb.sample.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import com.kb.sample.savings.model.InitiateSavingsAccountFacilityRequest;
import com.kb.sample.savings.model.InitiateSavingsAccountFacilityRequestSavingsAccountFacility;

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

        InitiateSavingsAccountFacilityRequestSavingsAccountFacility s = value.getSavingsAccountFacility();

        String accountNumber =
            s.getBankBranchLocationReference()
            +"03"
            +"04"
            ;

        CRSavingsAccountFacility entity =
                CRSavingsAccountFacility.builder()
                    .customerReference(s.getCustomerReference())
                    .bankBranchLocationReference(s.getBankBranchLocationReference())
                    .accountType(s.getAccountType())
                    .accountCurrency(s.getAccountCurrency().getCurrencycode())
                    .taxReference(s.getTaxReference())
                    .entitlementOptionSetting(s.getEntitlementOptionSetting())
                    .restrictionOptionSetting(s.getRestrictionOptionSetting())
                    .associations(s.getAssociations())
                    .associationType(s.getAssociationType())
                    .associationObligationEntitlement(s.getAssociationObligationEntitlement())
                    .associationReference(s.getAssociationReference())
                    .linkedAccounts(s.getLinkedAccounts())
                    .linkType(s.getLinkType())
                    .accountDetails(s.getAccountDetails())
                    .positionLimitSettings(s.getPositionLimitSettings())
                    .dateType(s.getDateType())
                    .statementsSchedule(s.getStatementsSchedule())
                    .statementType(s.getStatementType())
                    .statementTransactionType(s.getStatementTransactionType())
                    .statementPeriod(s.getStatementPeriod())
                    .statementReport(s.getStatementReport())
                    .build();

        return entity;
    }
}
