package com.kb.sample.savings.domain.transactionManager.entity;

import com.kb.sample.savings.domain.config.RootEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

@Entity
@Builder
@Setter
@Getter
@TypeAlias("core:CmpenTranMgt")
@Table(name = "NFAFUBC01")
public class CmpenTranMgt extends RootEntityBase {

    @Column(name = "guid")
    protected String guid;

    @Column(name = "cmpenTranIdnfr")
    protected String cmpenTranIdnfr;

    @Column(name = "acno")
    protected String acno;

    @Column(name = "ctrlRECORDStusCd")
    protected String ctrlRECORDStusCd;

    @Column(name = "ctrlRECORDDmndYMS")
    protected String ctrlRECORDDmndYMS;

    @Column(name = "ctrlRECORDModfiYMS")
    protected String ctrlRECORDModfiYMS;

    @Column(name = "ctrlRECORDFnshYMS")
    protected String ctrlRECORDFnshYMS;

    @Column(name = "sysLastPrcssYMS")
    protected String sysLastPrcssYMS;

    @Column(name = "sysLastUno")
    protected String sysLastUno;

    @Column(name = "orcpyNFAFUB101")
    protected String orcpyNFAFUB101;

}
