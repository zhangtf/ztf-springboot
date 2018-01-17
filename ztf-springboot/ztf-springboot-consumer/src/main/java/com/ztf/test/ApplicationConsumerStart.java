package com.ztf.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhang·tengfei
 * @version 1.0
 * @time 2018-1-10
 */
@SpringBootApplication
@ImportResource({"classpath*:spring/spring-*.xml"})
public class ApplicationConsumerStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumerStart.class, args);
    }
}
