<template>
<div>
  <nav class="navbar navbar-expand-sm navbar-light bg-light">
	<img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="25" height="25" />
    <div class="container-fluid">
      <router-link to="/" class="navbar-brand">Home</router-link>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <router-link to="/customer" class="nav-link">Customer</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/account" class="nav-link">Account</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/transaction_inquiry" class="nav-link">Transaction Inquiry</router-link>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  </div>
</template>

<script>
export default {
  name: 'Navbar'
}
</script>

<style scoped>
/* CSS 스타일링을 여기에 추가할 수 있습니다. */
</style>
