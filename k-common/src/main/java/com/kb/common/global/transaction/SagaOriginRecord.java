package com.kb.common.global.transaction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.utils.spring.ApplicationContextUtil;
import java.util.ArrayList;
import java.util.List;

public class SagaOriginRecord {

    private CUDFlag cudfLag;
    private String className;
    private Object detailObject;

    public SagaOriginRecord(CUDFlag cudfLag, Object detailObject) {
        this.cudfLag = cudfLag;
        this.detailObject = detailObject;
        this.className = detailObject.getClass().getName();
    }

    public CUDFlag getCudfLag() {
        return cudfLag;
    }

    public String getClassName() {
        return className;
    }

    public Object getDetailObject() {
        return detailObject;
    }

    public enum CUDFlag {
        CREATE, UPDATE, DELETE
    }

    public static List<SagaOriginRecord> toObject(String jsonStr) {
        List<SagaOriginRecord> list = new ArrayList<>();
        ObjectMapper om = (ObjectMapper) ApplicationContextUtil.getBean("objectMapper");
        try {
            JsonNode node = om.readTree(jsonStr);
            for (JsonNode recordNode : node) {
                SagaOriginRecord.CUDFlag cudFlag = SagaOriginRecord.CUDFlag.valueOf(
                    recordNode.get("cudFlag").asText());
                String className = recordNode.get("className").asText();
                Class<?> detailObjectClass = Class.forName(className);
                list.add(new SagaOriginRecord(cudFlag, detailObjectClass));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static String toJson(List<SagaOriginRecord> list) {
        String jsonStr = null;
        ObjectMapper om = (ObjectMapper) ApplicationContextUtil.getBean("objectMapper");
        try {
            jsonStr = om.writeValueAsString(list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return jsonStr;
    }

}
