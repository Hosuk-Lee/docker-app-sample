package com.kb.common.global.interceptor.enums;

import lombok.Getter;

/**
 * @Author hosuk.lee
 * @Desc
 * x-custom-headers
 *
 * */
@Getter
public enum XKHeaderEnum {

    X_K_GUID("x-k-guid", "X-K-Guid", false),
    X_K_HEADER("x-k-header", "X-K-Header", true);

    private final String v;
    private final String u;
    private final boolean encoded;


    XKHeaderEnum(String v, String u, boolean encoded) {
        this.v = v;
        this.u = u;
        this.encoded = encoded;
    }
}
