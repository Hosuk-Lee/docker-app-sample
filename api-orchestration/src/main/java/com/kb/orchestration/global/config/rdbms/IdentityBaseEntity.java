package com.kb.orchestration.global.config.rdbms;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.Id;

//@Setter
//@Getter
@MappedSuperclass // 공통 매핑정보가 필요할때
public abstract class IdentityBaseEntity
    extends AbstractEntityBase
    implements RootEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 생성을 DB에 위임
    @Column(name = "ID")
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Long setId(Long id) {
        return this.id = id;
    }
}
