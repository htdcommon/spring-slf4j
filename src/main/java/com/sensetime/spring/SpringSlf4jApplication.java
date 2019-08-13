package com.sensetime.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringSlf4jApplication {

    public static void main(String[] args) {
        log.info("main start");
        SpringApplication.run(SpringSlf4jApplication.class, args);
    }

}
