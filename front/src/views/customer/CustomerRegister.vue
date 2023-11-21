<template>
  <div class="flex-shrink-0 p-3">
    <a href="/customer" class="d-flex align-items-center pb-3 mb-3 link-body-emphasis text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Content</span>
    </a>
    <div>
      <!-- 기본정보 그룹 -->
      <div class="group" v-show="currentGroup === 'basic'">
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
        <button @click="nextGroup('work')">다음</button>
      </div>

      <!-- 직장정보 그룹 -->
      <div class="group" v-show="currentGroup === 'work'">
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
        <button @click="nextGroup('other')">다음</button>
      </div>

      <!-- 기타정보 그룹 -->
      <div class="group" v-show="currentGroup === 'other'">
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
        <button @click="submitForm">등록</button>
      </div>
      <!-- 성공 알림 -->
      <div v-if="successMessage" class="alert alert-success" role="alert">
        {{ successMessage }}
      </div>

      <!-- 실패 알림 -->
      <div v-if="errorMessage" class="alert alert-danger" role="alert">
        {{ errorMessage }}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      customerInfo: {
        name: '',
        phone: '',
        email: '',
        homeAddress: '',
        workplace: '',
        department: '',
        workPhone: '',
        workAddress: '',
        receiveMail: false,
        receivePhoneCalls: false,
        receiveSMS: false,
        receiveEmail: false,
      },
      currentGroup: 'basic',
      successMessage: null,
      errorMessage: null,

    };
  },
  methods: {
    nextGroup(group) {
      // 유효성 검사를 수행하고 필요한 경우에만 그룹 전환
      if (this.validateCurrentGroup()) {
        this.currentGroup = group;
      }
    },
    validateCurrentGroup() {
      // 각 그룹의 유효성 검사를 수행하고 유효한 경우에만 true 반환
      // 예를 들어, 필수 필드가 모두 채워져 있는지 확인할 수 있습니다.
      return true; // 실제로는 유효성 검사를 구현해야 합니다.
    },
    submitForm() {
      // 최종 등록 로직을 수행합니다.
      if (this.validateCurrentGroup()) {
        // 모든 그룹이 유효한 경우에만 등록 로직을 수행
        console.log('등록 완료', this.customerInfo);
        // 여기에서 서버에 데이터를 보내거나 다른 작업을 수행할 수 있습니다.
        // this.successMessage = '등록이 성공적으로 완료되었습니다.';
        // 성공 메시지 표시
        this.$root.showToast('등록이 성공적으로 완료되었습니다.', 'success');
      }
    },
    clearMessages() {
      // 메시지 초기화
      this.successMessage = null;
      this.errorMessage = null;
    },
  },
};
</script>

<style scoped>
/* 필요한 스타일을 여기에 추가할 수 있습니다. */
</style>