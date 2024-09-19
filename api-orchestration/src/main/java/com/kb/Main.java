package com.kb;

import static java.nio.charset.StandardCharsets.UTF_8;

import jakarta.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        springEnvSetup();
        SpringApplication.run(Main.class, args);
    }

    private static void springEnvSetup() {
        Properties properties = System.getProperties();

        Map<String, String> env = System.getenv();
        env.forEach((k,v) -> log.info("-- {} : {} " , k, v ));
        // properties.setProperty("key", "value");

        properties.forEach((k,v) -> log.info("++ {} : {} " , k, v ));
    }

    @PostConstruct
    public void postConstruct(){
        log.info("TimeZone {}, {}", TimeZone.getDefault().getDisplayName(), TimeZone.getTimeZone("UTC").getDisplayName());
        log.info("Charset  {}, {}", Charset.defaultCharset(), UTF_8);
        log.info("Locale   {}, {}", Locale.getDefault(), Locale.KOREA);
    }
}