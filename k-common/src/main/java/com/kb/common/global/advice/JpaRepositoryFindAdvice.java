package com.kb.common.global.advice;

import com.kb.common.global.utils.spring.PropsUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class JpaRepositoryFindAdvice {

    @Around("execution(* com.kbstar..repository..*.find*(..) || execution(public * org.springframework.data..repository..*.find*(..))")
    public Object doTran(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Object result = joinPoint.proceed(args);
        if ( result == null ) return null;
        else {
            boolean enabled = true; // PropsUtil.getPropValue()
            if ( !enabled ) {
                return result;
            }
        }
        return null;
    }

}
