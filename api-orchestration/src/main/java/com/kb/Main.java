package com.kb;

import static java.nio.charset.StandardCharsets.UTF_8;

import jakarta.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

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

    @Bean
    public CommandLineRunner test(Environment env) {
        return args -> {
            log.info("====== Environment and configuration ======");
            log.info("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));
            final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
            StreamSupport.stream(sources.spliterator(), false)
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
                .flatMap(Arrays::stream)
                .distinct()
                .filter(prop -> !(prop.contains("credentials") || prop.contains("password")))
                .forEach(prop -> log.info("{}: {}", prop, env.getProperty(prop)));
            log.info("===========================================");
        };
    }

}