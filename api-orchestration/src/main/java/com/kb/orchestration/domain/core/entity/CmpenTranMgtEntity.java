package com.kb.orchestration.domain.core.entity;

import com.kb.orchestration.global.config.rdbms.IdentityBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.TypeAlias;

@Entity
@Builder
@Setter
@Getter
@TypeAlias("core:CmpenTranMgt")
@Table(name = "CmpenTranMgt")
public class CmpenTranMgtEntity extends IdentityBaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Comment("GUID")
    @Column(name = "guid")
    protected String guid;

    @Comment("보상거래 식별자")
    @Column(name = "cmpenTranIdnfr")
    protected String cmpenTranIdnfr;

    @Comment("제어레코드 상태코드")
    @Column(name = "ctrlRECORDStusCd")
    protected String ctrlRECORDStusCd;

    @Comment("제어레코드 요청일시")
    @Column(name = "ctrlRECORDDmndYMS")
    protected String ctrlRECORDDmndYMS;

    @Comment("제어레코드 변경일시")
    @Column(name = "ctrlRECORDModfiYMS")
    protected String ctrlRECORDModfiYMS;

    @Comment("제어레코드 종료일시")
    @Column(name = "ctrlRECORDFnshYMS")
    protected String ctrlRECORDFnshYMS;

    @Comment("최종 사용자 번호")
    @Column(name = "sysLastUno")
    protected String sysLastUno;

    @Column(name = "거래추적로그내용")
    protected String tranTrackLogCtnt;

}
