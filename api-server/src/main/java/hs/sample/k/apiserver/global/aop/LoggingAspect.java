package hs.sample.k.apiserver.global.aop;


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

    @Before("allProviders()||allServices()||allInfrastructures()||allDomains()")
    public void classCallStartingLog(JoinPoint joinPoint) {
      log.info(String.format("＞＞＞＞＞＞＞＞＞＞＞＞＞ Start : %s", joinPoint.getSignature().toString()));
    }

    @After("allProviders()||allServices()||allInfrastructures()||allDomains()")
    public void classCallFinishLog(JoinPoint joinPoint) {
      log.info(String.format("<<<<<<<<<<<<<<<<<< Finish : %s", joinPoint.getSignature().toString()));
    }
}
