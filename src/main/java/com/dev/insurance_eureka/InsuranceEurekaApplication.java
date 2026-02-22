package com.dev.insurance_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InsuranceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceEurekaApplication.class, args);
    }

}
