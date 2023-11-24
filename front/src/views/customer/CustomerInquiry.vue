<template>
  
  <AppAlert :show="showAlert" :message="alertMessage" :alertType="alertType"/>
  <div class="flex-shrink-0 p-3">
    <a href="/customer" class="d-flex align-items-center pb-3 mb-3 link-body-emphasis text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Content</span>
    </a>
    <div class="group">
      <h3>Customer ID</h3>
      <input type="text" id="customerId" v-model="req.customerId" class="form-control" />
    </div>
    <button class="btn btn-primary" @click="fetchCustomerInfo">Fetch Customer Info</button>
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

<script setup>
import { ref, onMounted } from 'vue';

//import BootstrapToast from '@/components/module/BootstrapToast';
import axios from 'axios';
import AppAlert from '@/components/AppAlert.vue';

const customerInfo = ref({
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
  receiveEmail: false,
});

const req = ref({
  customerId: null,
});
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

    // const showToast = (message, type = 'success') => {
    //   const toastComponent = createApp(BootstrapToast, { message, type });
    //   const toastVm = toastComponent.mount();
    //   document.body.appendChild(toastVm.$el);
    // };

    const fetchCustomerInfo = async (button) => {
      try {
        console.log(button);
        console.log(req.value);
        console.log(req.value.customerId);
        console.log(`뭐야이거 ${req.value}`);
        console.log(`뭐야이거 ${req.value}`);
        button.disabled = true;
        const apiUrl = `http://127.0.0.1:80/api/customer-information/${req.value.customerId}`;
        const response = await axios.get(apiUrl);
        customerInfo.value = response.data;
        button.disabled = false;
      } catch (error) {
        console.error('API 호출 중 오류 발생:', error);
      }
    };

    onMounted(() => {
      // 컴포넌트가 마운트될 때 API를 호출하도록 변경
      // vAlert("onMounted() 함수 :: 화면로딩1", 'info');
      // vAlert("onMounted() 함수 :: 화면로딩2", 'success');
      vAlert("onMounted() 함수 :: 화면로딩3", 'error');
      // fetchCustomerInfo();
    });

/*
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
            },
            req: {
                customerId: null
            }
        };
    },
    mounted() {
        // Vue 컴포넌트가 로드될 때 API를 호출하도록 mounted 훅을 사용합니다.
        // this.fetchCustomerInfo();
    },
    methods: {
        showToast(message, type = 'success') {
            const toastComponent = new Vue({
                render: (h) => h(BootstrapToast, { props: { message, type } }),
            }).$mount();
            document.body.appendChild(toastComponent.$el);
        },
        async fetchCustomerInfo(button) {
            try {
                // Disable the button while the API call is in progress.
                console.log(button);
                //console.log('${this.req.customerId}');
                console.log(this.req);
                console.log(this.req.customerId);
                console.log('뭐야이거 ${this.req}');
                console.log("뭐야이거 ${this.req}");
                button.disabled = true;
                // API 엔드포인트 및 ID를 설정합니다. 예: 1번 고객을 조회하려면 ID를 1로 설정하세요.
                // const apiUrl = 'http://nginx:80/api/customer-information/${this.req.customerId}'; // ID를 원하는 값으로 변경하세요.
                const apiUrl = 'http://127.0.0.1:80/api/customer-information/' + this.req.customerId; // ID를 원하는 값으로 변경하세요.
                // Axios를 사용하여 API를 호출하고 데이터를 가져옵니다.
                const response = await axios.get(apiUrl);
                // API에서 받아온 데이터를 customerInfo에 할당합니다.
                this.customerInfo = response.data;
                // API 호출이 완료되면 버튼을 활성화합니다.
                button.disabled = false;
            }
            catch (error) {
                console.error('API 호출 중 오류 발생:', error);
            }
        }
    },
    components: { AppAlert }
};
*/
</script>

<style>
/* 스타일링을 필요에 따라 추가하세요. */
.group {
  margin-bottom: 20px;
}
</style>
