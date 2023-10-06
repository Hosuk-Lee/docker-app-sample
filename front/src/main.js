import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import Navbar from '@/components/Navbar.vue'

const app = createApp(App)

app.use(router)
app.component('Navbar', Navbar)

app.mount('#app')

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.js";
