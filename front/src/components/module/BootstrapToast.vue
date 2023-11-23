<!-- components/BootstrapToast.vue -->
<template>
  <div class="position-fixed bottom-0 end-0 p-3" style="z-index: 11">
    <div id="toast" class="toast hide" role="alert" aria-live="assertive" aria-atomic="true">
      <div class="toast-header">
        <strong class="me-auto">Bootstrap Toast</strong>
        <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
      </div>
      <div class="toast-body">
        {{ message }}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ['message', 'type'],
  mounted() {
    const toast = new bootstrap.Toast(document.getElementById('toast'));
    toast.show();
  }
};
</script>

<style scoped>
/* Add your custom styles here if needed */
</style>
