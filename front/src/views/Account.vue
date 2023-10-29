<template>
  <div class="flex-shrink-0 p-3">
    <a href="/customer" class="d-flex align-items-center pb-3 mb-3 link-body-emphasis text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Content</span>
    </a>
    <button class="btn btn-primary" @click="fetchAccountInfo">Fetch Account Info</button>
    <h2>Account Details</h2>

    <!-- 계좌 상세 정보 -->
    <div class="account-details">
      <div class="form-group">
        <label>Account Name:</label>
        <span>{{ accountInfo.accountName }}</span>
      </div>
      <div class="form-group">
        <label>Account Number:</label>
        <span>{{ accountInfo.accountNumber }}</span>
      </div>
      <div class="form-group">
        <label>Current Balance:</label>
        <span>{{ accountInfo.currentBalance }}</span>
      </div>
      <div class="form-group">
        <label>Available Balance:</label>
        <span>{{ accountInfo.availableBalance }}</span>
      </div>
    </div>

    <!-- 예금 정보 그룹 -->
    <div class="group">
      <h3>Deposit Information</h3>
      <div class="form-group">
        <label>Opening Date:</label>
        <span>{{ depositInfo.openingDate }}</span>
      </div>
      <div class="form-group">
        <label>Branch:</label>
        <span>{{ depositInfo.branch }}</span>
      </div>
      <div class="form-group">
        <label>Account Status:</label>
        <span>{{ depositInfo.accountStatus }}</span>
      </div>
      <div class="form-group">
        <label>Financial Transaction Limit Account:</label>
        <span>{{ depositInfo.financialTransactionLimitAccount }}</span>
      </div>
      <div class="form-group">
        <label>Card Payment Account:</label>
        <span>{{ depositInfo.cardPaymentAccount }}</span>
      </div>
      <div class="form-group">
        <label>ATM Withdrawal Allowed:</label>
        <span>{{ depositInfo.atmWithdrawalAllowed }}</span>
      </div>
      <div class="form-group">
        <label>Transfer Fee:</label>
        <span>{{ depositInfo.transferFee }}</span>
      </div>
    </div>

    <!-- 대출 정보 그룹 -->
    <div class="group">
      <h3>Loan Information</h3>
      <div class="form-group">
        <label>Loan Date:</label>
        <span>{{ loanInfo.loanDate }}</span>
      </div>
      <div class="form-group">
        <label>Loan Maturity Date:</label>
        <span>{{ loanInfo.loanMaturityDate }}</span>
      </div>
      <div class="form-group">
        <label>Loan Limit:</label>
        <span>{{ loanInfo.loanLimit }}</span>
      </div>
      <div class="form-group">
        <label>Loan Interest Rate:</label>
        <span>{{ loanInfo.loanInterestRate }}</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      accountInfo: {
        accountName: "Savings Account",
        accountNumber: "1234567890",
        currentBalance: "$5,000.00",
        availableBalance: "$4,500.00"
      },
      depositInfo: {
        openingDate: "2023-01-15",
        branch: "Main Branch",
        accountStatus: "Active",
        financialTransactionLimitAccount: "Yes",
        cardPaymentAccount: "No",
        atmWithdrawalAllowed: "Yes",
        transferFee: "$1.00"
      },
      loanInfo: {
        loanDate: "2022-06-10",
        loanMaturityDate: "2024-06-10",
        loanLimit: "$10,000.00",
        loanInterestRate: "5%"
      }
    };
  },
  methods: {
    async fetchAccountInfo(button) {
      try {
        // Disable the button while the API call is in progress.
        button.disabled = true;

        // API 엔드포인트를 설정합니다.
        const apiUrl = 'http://nginx:8080/my-account-detail';

        // Axios를 사용하여 API를 호출하고 데이터를 가져옵니다.
        const response = await axios.get(apiUrl);

        // API에서 받아온 데이터를 accountInfo에 할당합니다.
        this.accountInfo = response.data;

        // API 호출이 완료되면 버튼을 활성화합니다.
        button.disabled = false;
      } catch (error) {
        console.error('API 호출 중 오류 발생:', error);
      }
    }
  }

};
</script>

<style>
/* 스타일링을 필요에 따라 추가하세요. */
.group {
  margin-bottom: 20px;
}

.account-details {
  border: 1px solid #ccc;
  padding: 10px;
  margin-bottom: 20px;
}

.form-group {
  margin-bottom: 10px;
}
</style>

