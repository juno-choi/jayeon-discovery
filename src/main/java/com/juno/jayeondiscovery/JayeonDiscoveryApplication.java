package com.juno.jayeondiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JayeonDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JayeonDiscoveryApplication.class, args);
    }

}
