package com.kb.sample.savings.api.savingsAccount.v1.controller;


import com.kb.sample.savings.api.savingsAccount.v1.SavingsAccountApi;
import com.kb.sample.savings.api.savingsAccount.v1.service.SavingsAccountProvider;
import com.kb.sample.savings.domain.savingsAccount.entity.CRSavingsAccountFacility;
import com.kb.sample.savings.model.Currencycode;
import com.kb.sample.savings.model.InitiateSavingsAccountFacilityRequest;
import com.kb.sample.savings.model.InitiateSavingsAccountFacilityResponse;
import com.kb.sample.savings.model.RetrieveSavingsAccountFacilityResponse;
import com.kb.sample.savings.model.UpdateSavingsAccountFacilityRequestSavingsAccountFacility;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//@RestController(value = "/api/v1")
@RestController
@Slf4j
@RequiredArgsConstructor
public class SavingsAccountController implements SavingsAccountApi
{

    private final SavingsAccountProvider delegate;

//    @Override
//    public ResponseEntity<RegisterPartyReferenceDataDirectoryEntryRequest> registerPartyReferenceDataDirectoryEntry(
//            RegisterPartyReferenceDataDirectoryEntryRequest registerPartyReferenceDataDirectoryEntryRequest) {
//
//        log.info("request ==> {}", registerPartyReferenceDataDirectoryEntryRequest);
//        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry request = registerPartyReferenceDataDirectoryEntryRequest.getPartyReferenceDataDirectoryEntry();
//
//        delegate.register(registerPartyReferenceDataDirectoryEntryRequest);
//
//        RegisterPartyReferenceDataDirectoryEntryRequest response = new RegisterPartyReferenceDataDirectoryEntryRequest();
//        RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry
//                = new RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry();
//
//
//
//        log.info("request.getDirectoryEntryDateType() {}",request.getDirectoryEntryDateType());
//        partyReferenceDataDirectoryEntry.setDirectoryEntryDateType(
//                request.getDirectoryEntryDateType()
//        );
//
//        response.setPartyReferenceDataDirectoryEntry(partyReferenceDataDirectoryEntry);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }


    @Override
    public ResponseEntity<InitiateSavingsAccountFacilityResponse> initiate(
        InitiateSavingsAccountFacilityRequest body) {

        delegate.createNewSavingsAccount(body);

        InitiateSavingsAccountFacilityResponse response = null;
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<RetrieveSavingsAccountFacilityResponse> retrieve(
        String savingsaccountid) {
        CRSavingsAccountFacility crSavingsAccountFacility = delegate.retrieveSavingsAccountFacility(
            savingsaccountid);

        UpdateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility
            = new UpdateSavingsAccountFacilityRequestSavingsAccountFacility();
        savingsAccountFacility
            .customerReference(crSavingsAccountFacility.getCustomerReference())
            .bankBranchLocationReference(crSavingsAccountFacility.getBankBranchLocationReference())
            .savingsAccountNumber(crSavingsAccountFacility.getSavingsAccountNumber())
            .accountDetails(crSavingsAccountFacility.getAccountDetails())
            .accountType(crSavingsAccountFacility.getAccountType())
            .accountCurrency(new Currencycode().currencycode(crSavingsAccountFacility.getAccountCurrency()))
            .taxReference(crSavingsAccountFacility.getTaxReference())
            .entitlementOptionDefinition(crSavingsAccountFacility.getEntitlementOptionDefinition())
            .restrictionOptionDefinition(crSavingsAccountFacility.getRestrictionOptionDefinition())
            .associations(crSavingsAccountFacility.getAssociations())
            .associationType(crSavingsAccountFacility.getAssociationType())
            .linkedAccounts(crSavingsAccountFacility.getLinkedAccounts())
            .linkType(crSavingsAccountFacility.getLinkType())
            .accountDetails(crSavingsAccountFacility.getAccountDetails())
            .positionLimits(crSavingsAccountFacility.getPositionLimits())
            .dateType(crSavingsAccountFacility.getDateType())
            .statementType(crSavingsAccountFacility.getStatementType())
            .statementTransactionType(crSavingsAccountFacility.getStatementTransactionType())
            .statementPeriod(crSavingsAccountFacility.getStatementPeriod())
            .statementReport(crSavingsAccountFacility.getStatementReport())

            ;

        RetrieveSavingsAccountFacilityResponse response = new RetrieveSavingsAccountFacilityResponse();
        response.setSavingsAccountFacility(savingsAccountFacility);
        return ResponseEntity.ok(response);
    }
}
