<template>
  <AppAlert :show="showAlert" :message="alertMessage" :alertType="alertType"/>

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
          <label for="cname">Name</label>
          <input placeholder="이호석" type="text" id="cname" v-model="customerInfo.name" ref="customerInfo.name" class="form-control" />
        </div>
        <div class="form-group">
          <label for="phone">Phone Number</label>
          <input placeholder="0109942****" type="text" id="phone" v-model="customerInfo.phone" class="form-control" />
        </div>
        <div class="form-group">
          <label for="email">Email Address</label>
          <input placeholder="hosuk1497@gmail.com" type="email" id="email" v-model="customerInfo.email" class="form-control" />
        </div>
        <div class="form-group">
          <label for="homeAddress">Home Address</label>
          <input placeholder="서울시 동작구 동작대로" type="text" id="homeAddress" v-model="customerInfo.homeAddress" class="form-control" />
        </div>
        <button @click="nextGroup('work')" class="btn btn-primary">다음</button>
      </div>

      <!-- 직장정보 그룹 -->
      <div class="group" v-show="currentGroup === 'work'">
        <h3>Work Information</h3>
        <div class="form-group">
          <label for="workplace">Workplace</label>
          <input type="text" id="workplace" v-model="customerInfo.workplace" class="form-control" />
        </div>
        <div class="form-group">
          <label for="department">Department</label>
          <input type="text" id="department" v-model="customerInfo.department" class="form-control" />
        </div>
        <div class="form-group">
          <label for="workPhone">Work Phone</label>
          <input type="text" id="workPhone" v-model="customerInfo.workPhone" class="form-control" />
        </div>
        <div class="form-group">
          <label for="workAddress">Work Address</label>
          <input type="text" id="workAddress" v-model="customerInfo.workAddress" class="form-control" />
        </div>
        <button @click="nextGroup('other')" class="btn btn-primary">다음</button>
      </div>

      <!-- 기타정보 그룹 -->
      <div class="group" v-show="currentGroup === 'other'">
        <h3>Other Information</h3>
        <div class="form-group">
          <label class="checkbox-label">Receive Marketing</label>
          <input type="checkbox" v-model="customerInfo.receiveMarketing" />
        </div>
        <div class="form-group">
          <label class="checkbox-label">Receive Mail</label>
          <input id="receiveMail" type="checkbox" v-model="customerInfo.receiveMail" />
        </div>
        <div class="form-group">
          <label class="checkbox-label">Receive Phone Calls</label>
          <input type="checkbox" v-model="customerInfo.receivePhoneCalls" />
        </div>
        <div class="form-group">
          <label class="checkbox-label">Receive SMS</label>
          <input type="checkbox" v-model="customerInfo.receiveSMS" />
        </div>
        
        <button @click="submitForm" class="btn btn-primary">등록</button>
      </div>
      
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
import AppAlert from '@/components/AppAlert.vue';

const customerInfo = ref({
  name: '',
  phone: '',
  email: '',
  homeAddress: '',
  workplace: '',
  department: '',
  workPhone: '',
  workAddress: '',
  receiveMarketing: false,
  receiveMail: false,
  receivePhoneCalls: false,
  receiveSMS: false,
});

const currentGroup = ref('basic');

// 메서드 정의
const nextGroup = (group) => {
  // 유효성 검사를 수행하고 필요한 경우에만 그룹 전환
  if (validateCurrentGroup()) {
    currentGroup.value = group;
  }
};

const validateCurrentGroup = () => {
  // 각 그룹의 유효성 검사를 수행하고 유효한 경우에만 true 반환
  switch (currentGroup.value) {
    case 'basic':
      if (!customerInfo.value.name || !customerInfo.value.phone || !customerInfo.value.email || !customerInfo.value.homeAddress) {
        vAlert('기본 정보를 모두 입력하세요.', 'error');
        if (!customerInfo.value.name) {
          cname.focus()
        } else if (!customerInfo.value.phone) {
          phone.focus();
        } else if (!customerInfo.value.email) {
          email.focus();
        } else if (!customerInfo.value.homeAddress) {
          homeAddress.focus();
        }

        return false;
      }
      break;
    case 'work':
      if (!customerInfo.value.workplace || !customerInfo.value.department || !customerInfo.value.workPhone || !customerInfo.value.workAddress) {
        vAlert('직장 정보를 모두 입력하세요.', 'error');
        console.log(customerInfo.value.workplace,'dfdf')
        // 누락된 항목에 따라 포커스 설정
        if (!customerInfo.value.workplace) {
          workplace.focus();
        } else if (!customerInfo.value.department) {
          department.focus();
        } else if (!customerInfo.value.workPhone) {
          workPhone.focus();
        } else if (!customerInfo.value.workAddress) {
          workAddress.focus();
        }

        return false;
      }
      break;
    case 'other':
      // 기타 정보 그룹에서는 추가적인 유효성 검사를 수행할 수 있습니다.
      // if (!customerInfo.value.receiveMail || !customerInfo.value.receivePhoneCalls || !customerInfo.value.receiveSMS || !customerInfo.value.receiveEmail) {
      //   vAlert('기타 정보를 모두 선택하세요.', 'error');
      //   return false;
      // }
      break;
  }
  return true;

};

const submitForm = async (button) => {
  // 최종 등록 로직을 수행합니다.
  if (validateCurrentGroup()) {
    // 모든 그룹이 유효한 경우에만 등록 로직을 수행
    console.log('등록 완료', customerInfo.value);
    // 여기에서 서버에 데이터를 보내거나 다른 작업을 수행할 수 있습니다.
    button.disabled = true;
    const apiUrl = `http://127.0.0.1:80/api/customer-register`;
    try {
      // 모든 그룹이 유효한 경우에만 등록 로직을 수행
      console.log('등록 완료', customerInfo.value);
      // 여기에서 서버에 데이터를 보내거나 다른 작업을 수행할 수 있습니다.
      const response = await axios.post(apiUrl, customerInfo.value);
      console.log('서버 응답:', response.data);
      // 성공 메시지 표시
      vAlert('등록이 성공적으로 완료되었습니다.', 'success');
    } catch (error) {
      console.error('서버 에러:', error);
      // 실패 메시지 표시
      vAlert('등록 중 오류가 발생했습니다.', 'error');
    }
    button.disabled = false;    

  }
};

// alert
const showAlert = ref(false);
const alertType = ref('error');
const alertMessage = ref('');
const vAlert = (message, type = 'error') => {
  showAlert.value = true;
  alertMessage.value = message;
  alertType.value = type;

  setTimeout(() => {
    showAlert.value = false;
  }, 2000);
}

onMounted(() => {

})

</script>

<style scoped>
/* 필요한 스타일을 여기에 추가할 수 있습니다. */
.checkbox-label {
  display: inline-block;
  width: 150px; /* 조절 가능한 너비로 설정 */
  margin-bottom: 5px; /* 원하는 간격으로 조절 */
}
</style>