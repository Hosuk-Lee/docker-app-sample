package com.kb.orchestration.global.config.rdbms;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;

public abstract class AbstractEntityBase {
    // @Transient 어노테이션 확인해보기
    // 어노테이션을 사용하여 필드를 영속성 컨텍스트에서 제외

    @Transient
    protected String type;

    public String getType() {
        TypeAlias typeAlias = AnnotationUtils.getAnnotation(this.getClass(), TypeAlias.class);
        if (typeAlias != null) {
            this.type = typeAlias.value();
            return typeAlias.value();
        }
        return null;
    }
}
