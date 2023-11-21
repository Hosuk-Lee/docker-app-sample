import { createRouter, createWebHistory } from 'vue-router'
import Customer from '../views/Customer.vue'
import CustomerInquiry from '../views/customer/CustomerInquiry.vue'
import CustomerRegister from '../views/customer/CustomerRegister.vue'
import Account from '../views/Account.vue'
import TransactionInquiry from '../views/TransactionInquiry.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import(/* webpackChunkName: "home" */ '../views/Home.vue')
  },
  {
    path: '/customer',
    name: 'Customer',
    component: Customer
  },
  {
    path: '/customer/inquiry',
    name: 'CustomerInquiry',
    component: CustomerInquiry
  },
  {
    path: '/customer/register',
    name: 'CustomerRegister',
    component: CustomerRegister
  },
  {
    path: '/account',
    name: 'Account',
    component: Account
  },
  {
    path: '/transaction_inquiry',
    name: 'TransactionInquiry',
    component: TransactionInquiry
  }
]

const router = createRouter({
  //history: createWebHistory(process.env.BASE_URL),
  history: createWebHistory(),
  routes
})

export default router
