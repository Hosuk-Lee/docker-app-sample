<template>
    <div class="flex-shrink-0 p-3">
    <a href="/transaction_inquiry" class="d-flex align-items-center pb-3 mb-3 link-body-emphasis text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Content</span>
    </a>
    <h2>Transaction Inquiry</h2>

    <!-- 거래 목록 그룹화 -->
    <div v-for="(monthTransactions, month) in groupedTransactions" :key="month">
      <h3>{{ month }}</h3>
      <table class="table">
        <thead>
          <tr>
            <th>Transaction Date</th>
            <th>Description</th>
            <th>Type</th>
            <th>Amount</th>
            <th>Balance</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(transaction, index) in monthTransactions" :key="index">
            <td>{{ transaction.date }}</td>
            <td>{{ transaction.description }}</td>
            <td>{{ transaction.type }}</td>
            <td>{{ transaction.amount }}</td>
            <td>{{ transaction.balance }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      transactions: [
        { date: "2023.09.26 12:10:40", description: "Purchase", type: "Withdrawal", amount: "$50.00", balance: "$4,950.00" },
        { date: "2023.09.15 08:30:20", description: "Salary Deposit", type: "Deposit", amount: "$2,000.00", balance: "$6,950.00" },
        // 다른 거래 항목들을 추가할 수 있습니다.
      ]
    };
  },
  computed: {
    groupedTransactions() {
      // 거래를 월별로 그룹화하는 함수
      const grouped = {};
      this.transactions.forEach(transaction => {
        const month = transaction.date.split(" ")[0]; // 날짜에서 월 부분 추출
        if (!grouped[month]) {
          grouped[month] = [];
        }
        grouped[month].push(transaction);
      });
      return grouped;
    }
  }
};
</script>

<style>
/* 스타일링을 필요에 따라 추가하세요. */
</style>

