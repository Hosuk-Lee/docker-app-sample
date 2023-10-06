import { createRouter, createWebHistory } from 'vue-router'
import Customer from '../views/Customer.vue'
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
