package com.kb.common.global.config.jpa;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

/**
  sample
  capitalize() 함수를 사용하여 identifier 첫글자 대문자로 변경
  identifier.toIdentifier(String, Boolean) 두번째 parameter true 로 double quotes 추가
*/
public class CustomPhysicalNamingStrategy implements PhysicalNamingStrategy {

    @Override
    public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }

    @Override
    public Identifier toPhysicalSchemaName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }

    @Override
    public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return capitalize(identifier);
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier identifier,JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return capitalize(identifier);
    }

    private Identifier capitalize(Identifier name) {
        /* id 의 경우 default 값으로 처리 */
        if (name == null || "id".equals(name.getText())) {
            return  name;
        } else {
            return Identifier.toIdentifier(StringUtils.capitalize(name.getText()),true);
        }
    }
}
