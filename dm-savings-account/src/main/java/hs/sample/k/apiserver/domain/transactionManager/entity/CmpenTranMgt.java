package hs.sample.k.apiserver.domain.transactionManager.entity;

import hs.sample.k.apiserver.domain.config.RootEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "NFAFUBC01")
@Entity
@Getter
public class CmpenTranMgt extends RootEntityBase {

    @Column(name = "guid")
    protected String guid;

    @Column(name = "cmpenTranIdnfr")
    protected String cmpenTranIdnfr;

    @Column(name = "acno")
    protected String acno;

    @Column(name = "ctrlRECORDDmndYms")
    protected String ctrlRECORDDmndYms;

    @Column(name = "ctrlRECORDModfiYms")
    protected String ctrlRECORDModfiYms;

    @Column(name = "ctrlRECORDStusYms")
    protected String ctrlRECORDStusYms;

    @Column(name = "sysLastPrcssYMS")
    protected String sysLastPrcssYMS;

    @Column(name = "sysLastUno")
    protected String sysLastUno;

    @Column(name = "orcpyNFAFUB101")
    protected String orcpyNFAFUB101;

}
