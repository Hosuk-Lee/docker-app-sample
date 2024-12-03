package com.kb.common.global.context.impl;

import com.kb.common.global.context.CommonContext;
import com.kb.common.global.context.dto.KCommon;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CommonContextImpl implements CommonContext {

    private String uuid;
    private String requestURL;
    private KCommon kCommon;

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public void log(String message) {
        log.info("[" + uuid + "]" + "[" + requestURL + "]" + message);
    }

    @PostConstruct
    public void init() {
        this.uuid = UUID.randomUUID().toString();
        this.kCommon = new KCommon();
        log.info("request scope bean create uuid = {}", uuid);
    }

    @PreDestroy
    public void close() {
        log.info("request scope bean destroy uuid = {}", uuid);
    }

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

    @Override
    public String getStndGuid() {
        return getkCommon().getkHeader().getStndGuid();
    }

    public KCommon getkCommon() {
        return kCommon;
    }

}
