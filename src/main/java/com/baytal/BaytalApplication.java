package com.baytal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
// Add this annotation to enable caching support
@EnableCaching
@EnableAsync
public class BaytalApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaytalApplication.class, args);
    }


}
