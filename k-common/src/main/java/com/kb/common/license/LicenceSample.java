package com.kb.common.license;

import static com.kb.common.global.utils.FileUtils.read;

import com.kb.common.global.utils.FileUtils;
import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

@Slf4j
@Component
public class LicenceSample {

    @EventListener(ApplicationReadyEvent.class)
    public void initialize(ApplicationReadyEvent event) {
        String yaml = read("k-common-config.yaml");
        System.out.println(yaml);
    }

}
