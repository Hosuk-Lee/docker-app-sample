<template>
  <div class="flex-shrink-0 p-3">
    <a href="/customer" class="d-flex align-items-center pb-3 mb-3 link-body-emphasis text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Content</span>
    </a>
    <h2>Customer Information</h2>

    <!-- 기본정보 그룹 -->
    <div class="group">
      <h3>Basic Information</h3>
      <div class="form-group">
        <label for="name">Name:</label>
        <input type="text" id="name" v-model="customerInfo.name" class="form-control" />
      </div>
      <div class="form-group">
        <label for="phone">Phone Number:</label>
        <input type="text" id="phone" v-model="customerInfo.phone" class="form-control" />
      </div>
      <div class="form-group">
        <label for="email">Email Address:</label>
        <input type="email" id="email" v-model="customerInfo.email" class="form-control" />
      </div>
      <div class="form-group">
        <label for="homeAddress">Home Address:</label>
        <input type="text" id="homeAddress" v-model="customerInfo.homeAddress" class="form-control" />
      </div>
    </div>

    <!-- 직장정보 그룹 -->
    <div class="group">
      <h3>Work Information</h3>
      <div class="form-group">
        <label for="workplace">Workplace:</label>
        <input type="text" id="workplace" v-model="customerInfo.workplace" class="form-control" />
      </div>
      <div class="form-group">
        <label for="department">Department:</label>
        <input type="text" id="department" v-model="customerInfo.department" class="form-control" />
      </div>
      <div class="form-group">
        <label for="workPhone">Work Phone:</label>
        <input type="text" id="workPhone" v-model="customerInfo.workPhone" class="form-control" />
      </div>
      <div class="form-group">
        <label for="workAddress">Work Address:</label>
        <input type="text" id="workAddress" v-model="customerInfo.workAddress" class="form-control" />
      </div>
    </div>

    <!-- 기타정보 그룹 -->
    <div class="group">
      <h3>Other Information</h3>
      <div class="form-group">
        <label>Receive Mail:</label>
        <input type="checkbox" v-model="customerInfo.receiveMail" />
      </div>
      <div class="form-group">
        <label>Receive Phone Calls:</label>
        <input type="checkbox" v-model="customerInfo.receivePhoneCalls" />
      </div>
      <div class="form-group">
        <label>Receive SMS:</label>
        <input type="checkbox" v-model="customerInfo.receiveSMS" />
      </div>
      <div class="form-group">
        <label>Receive Email:</label>
        <input type="checkbox" v-model="customerInfo.receiveEmail" />
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      customerInfo: {
        name: "John Doe",
        phone: "123-456-7890",
        email: "john@example.com",
        homeAddress: "123 Main St, City",
        workplace: "ABC Inc.",
        department: "Sales",
        workPhone: "987-654-3210",
        workAddress: "456 Business Ave, Town",
        receiveMail: true,
        receivePhoneCalls: false,
        receiveSMS: true,
        receiveEmail: false
      }
    };
  },
  mounted() {
    // Vue 컴포넌트가 로드될 때 API를 호출하도록 mounted 훅을 사용합니다.
    this.fetchCustomerInfo();
  },
  methods: {
    async fetchCustomerInfo() {
      try {
        // API 엔드포인트 및 ID를 설정합니다. 예: 1번 고객을 조회하려면 ID를 1로 설정하세요.
        const apiUrl = 'http://customer.app.local:20010/api/customer/1'; // ID를 원하는 값으로 변경하세요.

        // Axios를 사용하여 API를 호출하고 데이터를 가져옵니다.
        const response = await axios.get(apiUrl);

        // API에서 받아온 데이터를 customerInfo에 할당합니다.
        this.customerInfo = response.data;
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
</style>
