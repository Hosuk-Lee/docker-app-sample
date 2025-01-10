package com.kb.sample.savings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {"hs.sample.k.savings.*", "com.kb.common.global.*"}
)
public class SavingsAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SavingsAccountApplication.class, args);
    }

}
