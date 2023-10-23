package hs.sample.k.apiserver.domain.savingsAccount.entity;

import hs.sample.k.apiserver.domain.config.RootEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Savings Account.
 * 일반적으로 저축 계좌 내의 금융 상품이나 시설에 대한 서비스 계약에 따라 예정된 특별한 의무를 이행해야 합니다.
 */
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "SavingsAccountFacility")
@Entity
@Getter
public class CRSavingsAccountFacility extends RootEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "product_instance_reference",
            columnDefinition = "VARCHAR(255) COMMENT 'Reference to the savings account product instance'"
    )
    private String productInstanceReference;

    @Column(name = "savings_account_number")
    private String savingsAccountNumber;

    @Column(name = "customer_reference")
    private String customerReference;

    @Column(name = "bank_branch_location_reference")
    private String bankBranchLocationReference;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_currency")
    private String accountCurrency;

    @Column(name = "tax_reference")
    private String taxReference;

    @Column(name = "entitlement_option_definition")
    private String entitlementOptionDefinition;

    @Column(name = "entitlement_option_setting")
    private String entitlementOptionSetting;

    @Column(name = "restriction_option_definition")
    private String restrictionOptionDefinition;

    @Column(name = "restriction_option_setting")
    private String restrictionOptionSetting;

    @Column(name = "associations")
    private String associations;

    @Column(name = "association_type")
    private String associationType;

    @Column(name = "association_obligation_entitlement")
    private String associationObligationEntitlement;

    @Column(name = "association_reference")
    private String associationReference;

    @Column(name = "linked_accounts")
    private String linkedAccounts;

    @Column(name = "link_type")
    private String linkType;

    @Column(name = "account_details")
    private String accountDetails;

    @Column(name = "position_limits")
    private String positionLimits;

    @Column(name = "position_limit_type")
    private String positionLimitType;

    @Column(name = "position_limit_settings")
    private String positionLimitSettings;

    @Column(name = "position_limit_value")
    private String positionLimitValue;

    @Column(name = "date_type")
    private String dateType;

    @Column(name = "date")
    private String date;

    @Column(name = "statements_schedule")
    private String statementsSchedule;

    @Column(name = "statement_type")
    private String statementType;

    @Column(name = "statement_transaction_type")
    private String statementTransactionType;

    @Column(name = "statement_period")
    private String statementPeriod;

    @Column(name = "statement_report")
    private String statementReport;


}
