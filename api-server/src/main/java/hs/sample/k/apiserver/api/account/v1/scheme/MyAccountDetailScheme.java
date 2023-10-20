package hs.sample.k.apiserver.api.account.v1.scheme;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

@Setter
public class MyAccountDetailScheme {

    @Schema(description = "Account Information")
    @JsonProperty("account_info")
    private AccountInfo accountInfo;

    @Schema(description = "Deposit Information")
    @JsonProperty("deposit_info")
    private DepositInfo depositInfo;

    @Schema(description = "Loan Information")
    @JsonProperty("loan_info")
    private LoanInfo loanInfo;

    @Setter
    public static class AccountInfo {
        @Schema(description = "Account Name")
        @JsonProperty("account_name")
        private String accountName;

        @Schema(description = "Account Number")
        @JsonProperty("account_number")
        private String accountNumber;

        @Schema(description = "Current Balance")
        @JsonProperty("current_balance")
        private String currentBalance;

        @Schema(description = "Available Balance")
        @JsonProperty("available_balance")
        private String availableBalance;
    }

    @Setter
    public static class DepositInfo {
        @Schema(description = "Opening Date")
        @JsonProperty("opening_date")
        private String openingDate;

        @Schema(description = "Branch")
        @JsonProperty("branch")
        private String branch;

        @Schema(description = "Account Status")
        @JsonProperty("account_status")
        private String accountStatus;

        @Schema(description = "Financial Transaction Limit Account")
        @JsonProperty("financial_transaction_limit_account")
        private String financialTransactionLimitAccount;

        @Schema(description = "Card Payment Account")
        @JsonProperty("card_payment_account")
        private String cardPaymentAccount;

        @Schema(description = "ATM Withdrawal Allowed")
        @JsonProperty("atm_withdrawal_allowed")
        private String atmWithdrawalAllowed;

        @Schema(description = "Transfer Fee")
        @JsonProperty("transfer_fee")
        private String transferFee;
    }

    @Setter
    public static class LoanInfo {
        @Schema(description = "Loan Date")
        @JsonProperty("loan_date")
        private String loanDate;

        @Schema(description = "Loan Maturity Date")
        @JsonProperty("loan_maturity_date")
        private String loanMaturityDate;

        @Schema(description = "Loan Limit")
        @JsonProperty("loan_limit")
        private String loanLimit;

        @Schema(description = "Loan Interest Rate")
        @JsonProperty("loan_interest_rate")
        private String loanInterestRate;
    }

    // 생성자, Getter 및 Setter 메서드는 필요에 따라 추가할 수 있습니다.
}