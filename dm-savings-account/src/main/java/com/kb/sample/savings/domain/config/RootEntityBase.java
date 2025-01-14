// THIS FILE IS AUTOGENERATED. MODIFICATIONS WILL BE LOST!

package com.kb.sample.savings.domain.config;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * Provide an abstract class that implements RootEntity interface and will be
 * extended by domain root entities.
 *
 * @Generated
 *
 */
@MappedSuperclass
public abstract class RootEntityBase implements RootEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }
}
