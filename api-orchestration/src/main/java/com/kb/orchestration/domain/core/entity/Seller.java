package com.kb.orchestration.domain.core.entity;

import com.kb.orchestration.global.config.rdbms.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class Seller extends BaseEntity {

    private String shopName;
}
