package com.kb.common.global.interceptor;

import static com.kb.common.global.utils.spring.PropsUtil.*;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.context.CommonContext;
import com.kb.common.global.context.impl.CommonContextImpl;
import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.common.global.interceptor.enums.XKHeaderEnum;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
@RequiredArgsConstructor
public class ContextInterceptor implements HandlerInterceptor {

    private final CommonContext commonContext;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("==================== START ====================");
        log.info(" Request URI \t: " + request.getRequestURI());
        log.info(" commonContext {}", commonContext.getGuid());

        String xGuid = request.getHeader(XKHeaderEnum.X_K_GUID.getV());
        if( isNotEmpty(xGuid)) {
            MDC.put("xGuid", xGuid);
        }

        _setUpCommonContext(request);


//        return HandlerInterceptor.super.preHandle(request, response, handler);
        return true;
    }

    private void _setUpCommonContext(HttpServletRequest request) {
        Object o = _getHeaderValue(request, XKHeaderEnum.X_K_GUID);
        CommonContextImpl _commonContextImpl = (CommonContextImpl) this.commonContext;
        // _commonContextImpl.get XKBCommon set xKHeader
    }

    private Object _getHeaderValue(HttpServletRequest request, XKHeaderEnum key) {
        String header = request.getHeader(key.getV());
        if ( _isAlterLocalFile(key) ) {
            log.debug("x-k-header using local file");
            header = _getHeaderValueUseLocalFile(key);
        }

        if ( _isEncodedRequestHeader() ) {
            if(_isAlterLocalFile(key)) {
                throw new BusinessException(GErrorCode.SYSTEM_ERROR, GTreatCode.CONFIGURATION
                    ,
                    "App Config error - Use local header file is not supported by base64 encode.");
            }
            // TODO 한글깨짐 확인 할 것
            return Base64.getMimeDecoder().decode(header);
        }
        return header;
    }

    private boolean _isEncodedRequestHeader() {
        return getPropBoolValue("k.common.x-header.base64.encoded.request");
    }

    private boolean _isAlterLocalFile(XKHeaderEnum key) {
        return getPropBoolValue("k.common.x-header.file.enabled");
    }

    private String _getHeaderValueUseLocalFile(XKHeaderEnum key) {
        String fileName = getPropValue("k.common.x-header.file.name");
        if (isEmpty(fileName)) {
            throw new BusinessException(GErrorCode.SYSTEM_ERROR, GTreatCode.CONFIGURATION
                ,"App Config error - config file set used the local header but didn't set name");
        }
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        // TODO CLASSPATH_URL_PREFIX not found 발생하면 prefix 붙이기 테스트 성공하면 지우기
        Resource resource = resourceLoader.getResource(fileName);

        try(InputStream fileInputStream = resource.getInputStream()) {
            return resource.getContentAsString(StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("==================== END ====================");
    }

}
