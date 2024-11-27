package com.kb.orchestration.global.config.rdbms;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@MappedSuperclass // 공통 매핑정보가 필요할때
public class IdentityBaseEntity {
// @Transient 어노테이션 확인해보기

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 생성을 DB에 위임
    private Long id;

}
