package com.kb.common.global.context.impl;

import com.kb.common.global.context.CommonContext;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CommonContextImpl implements CommonContext {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL) {
        this.requestURL=requestURL;
    }

    public void log(String message) {
        log.info("["+uuid+"]"+"["+requestURL+"]"+ message);
    }

    @PostConstruct
    public void init() {
        uuid = UUID.randomUUID().toString();
        log.info("request scope bean create uuid = " + uuid);
    }

    @PreDestroy
    public void close() {
        log.info("request scope bean destroy uuid = " + uuid);    }

    @Override
    public String getGuid() {
        return uuid;
    }

    @Override
    public String getTranBaseYmd() {
        return "";
    }

    @Override
    public String getTranBaseHms() {
        return "";
    }
}
