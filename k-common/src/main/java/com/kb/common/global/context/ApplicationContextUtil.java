package com.kb.common.global.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtil {

    private static ApplicationContext applicationContext;
    public ApplicationContextUtil(){}

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

//    public sat?
}
