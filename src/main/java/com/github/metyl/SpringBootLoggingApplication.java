package com.github.metyl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootLoggingApplication {

    Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoggingApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "Hello World!";
    }

}
