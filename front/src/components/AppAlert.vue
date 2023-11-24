<template>
    <div v-if="show" class="app-alert alert" :class="styleClass" role="alert">
        {{ message }}
    </div>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps( {
    show: {
        type: Boolean,
        default: false,
    },
    message: {
        type: String,
        required: true,
    },
    alertType: {
        type: String,
        default: 'info',
        validator: (value) => {
            return ['success', 'error', 'info'].includes(value);
        }
    }
});
const styleClass = computed( () => {
    if ( props.alertType === 'success' ) {
        return 'alert-success'
    };
    if ( props.alertType === 'error' ) {
        return 'alert-danger'
    };
    if ( props.alertType === 'info' ) {
        return 'alert-info'
    };
    return '';

} );
</script>

<style scoped>
.app-alert {
    position: fixed;
    top: 10px;
    right: 10px;
}

</style>