package com.kb.common.global.context.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.kb.common.global.exception.BusinessException;
import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class KCommon {

    @JsonProperty("x-k-guid")
    private String guid;

    @JsonProperty("x-k-header")
    private KHeader kHeader;

    @JsonIgnore
    private List<BusinessException> businessExceptionList;

    @JsonIgnore
    private HttpServletRequest httpServletRequet;

    public String getGuid() {
        return guid;
    }

    public void setGuid(final String guid) {
        this.guid = guid;
    }

    public KHeader getkHeader() {
        return kHeader;
    }

    public void setkHeader(final KHeader kHeader) {
        this.kHeader = kHeader;
    }

    public HttpServletRequest getHttpServletRequet() {
        return httpServletRequet;
    }

    public void setHttpServletRequet(final HttpServletRequest httpServletRequet) {
        this.httpServletRequet = httpServletRequet;
    }

    private void addBusinessExceptionList(final BusinessException e) {
        /* Run/ Debug Configuration > Edit Configuration > Modify options > VM arguments -ea */
        assert e == null : "BusinessException cannot be null.";
        if (this.businessExceptionList == null) {
            this.businessExceptionList = new ArrayList<BusinessException>();
        }
        if (this.businessExceptionList.size() > 10) {
            this.businessExceptionList.remove(0);
        }
        this.businessExceptionList.add(e);
    }

    public List<BusinessException> getBusinessExceptionList() {
        return this.businessExceptionList;
    }
}
