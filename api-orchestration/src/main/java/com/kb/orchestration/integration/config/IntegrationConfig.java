package com.kb.orchestration.integration.config;

import com.kb.orchestration.global.config.YamlPropertySourceFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

@AllArgsConstructor
@Configuration
//@Getter
//@PropertySource(value = "classpath:integration.yaml", factory = YamlPropertySourceFactory.class)
@Slf4j
public class IntegrationConfig {

    private final Environment env;
    private final ConfigurableEnvironment environment;

    @Bean
    public String ss(){
        log.info("env : {}", env);
        log.info("env : {}", env.getDefaultProfiles());
        log.info("env : {}", env.getActiveProfiles());
        log.info("env : {}", env.getProperty("integration.account.url"));

        StringBuilder properties = new StringBuilder();
        log.info("ll {}", environment.getPropertySources().toString());

        return "S";
    }

}
