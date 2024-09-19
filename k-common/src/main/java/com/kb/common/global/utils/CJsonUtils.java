package com.kb.common.global.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CJsonUtils {
    private static ObjectMapper om = new ObjectMapper();
    private CJsonUtils() { throw new IllegalStateException("Utility class"); }

    public static void logObjectToJson(Object obj) {
        log.info("{} >> {}",
            Thread.currentThread().getStackTrace()[2].getLineNumber(),
            toJson(obj));
    }

    public static String toJson(Object obj) {
        try {
            om.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
