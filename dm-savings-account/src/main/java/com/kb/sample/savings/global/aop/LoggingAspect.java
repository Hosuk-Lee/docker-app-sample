package com.kb.sample.savings.global.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
//    @Pointcut("execution(* hs.sample.k.*.api..*Provider*.*(..))")
    @Pointcut("execution(* hs.sample.k.*.api..*Controller*.*(..))")
    public void allControllers() {
    }
    @Pointcut("execution(* hs.sample.k.*.api..*Provider*.*(..))")
    public void allProviders() {
    }

    @Pointcut("execution(* hs.sample.k.*.service..*Service*.*(..))")
    public void allServices() {
    }

    @Pointcut("execution(* hs.sample.k.*.domain..*.*(..))")
    public void allDomains() {
    }

    @Pointcut("execution(* hs.sample.k.*.infra..*.*(..))")
    public void allInfrastructures() {
    }

    @Before("allControllers()||allProviders()||allServices()||allInfrastructures()||allDomains()")
    public void classCallStartingLog(JoinPoint joinPoint) {
      log.info(String.format("＞＞＞＞＞＞＞＞＞＞＞＞＞ Start : %s", joinPoint.getSignature().toString()));
    }

    @After("allControllers()||allProviders()||allServices()||allInfrastructures()||allDomains()")
    public void classCallFinishLog(JoinPoint joinPoint) {
      log.info(String.format("<<<<<<<<<<<<<<<<<< Finish : %s", joinPoint.getSignature().toString()));
    }
}
