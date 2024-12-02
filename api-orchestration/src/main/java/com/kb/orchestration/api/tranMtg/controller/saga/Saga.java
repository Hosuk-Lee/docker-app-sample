package com.kb.orchestration.api.tranMtg.controller.saga;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Saga {

    String compensateBeanName() default "";

    String completeBeanName() default "";
}
