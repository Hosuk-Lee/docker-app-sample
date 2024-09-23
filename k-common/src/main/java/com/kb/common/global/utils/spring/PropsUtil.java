package com.kb.common.global.utils.spring;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;

@Slf4j
public class PropsUtil {

    public static String getPropValue(String k) {
        Environment env = ApplicationContextUtil.getBean(Environment.class);
        return env.getProperty(k);
    }

    public static String getPropValue(String k, String v) {
        String propValue = getPropValue(k);
        return StringUtils.defaultIfEmpty(propValue, v);
    }

    public static boolean getPropBoolValue(String k) {
        String p = getPropValue(k);
        return StringUtils.isEmpty(p) ? false : Boolean.parseBoolean(p);
    }
}
