package com.kb.common.global.config.yaml;

import java.io.IOException;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

@Slf4j
public class YamlPropertySourceFactory extends DefaultPropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        log.info("YamlPropertySourceFactory");
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource.getResource());
        Properties properties = factory.getObject();
        return new PropertiesPropertySource(resource.getResource().getFilename(), properties);
    }
}