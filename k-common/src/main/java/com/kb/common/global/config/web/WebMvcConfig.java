package com.kb.common.global.config.web;

import com.kb.common.global.interceptor.ContextInterceptor;
import com.kb.common.global.interceptor.LoggerInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    private final ContextInterceptor contextInterceptor;
    private final LoggerInterceptor loggerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggerInterceptor);
        registry.addInterceptor(contextInterceptor)
                .excludePathPatterns("/css/**", "/images/**", "/js/**");
    }
}