package com.example.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoggingExampleApplication {
    // Use Spring JCL logger
    private static final Log logger1 = LogFactory.getLog(LoggingExampleApplication.class);

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggingExampleApplication.class, args);
        logger.info("Spring Boot Logging Example Application has started.");
        logger1.info("ddd");
    }

    @GetMapping("/log")
    public String logSomething() {
        logger.debug("This is a DEBUG log message");
        logger.info("This is an INFO log message");
        logger.warn("This is a WARN log message");
        logger.error("This is an ERROR log message");

        return "Check the console and log files for log output!";
    }
}
