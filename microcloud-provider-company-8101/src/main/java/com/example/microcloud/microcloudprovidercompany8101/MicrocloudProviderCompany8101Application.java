package com.example.microcloud.microcloudprovidercompany8101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
public class MicrocloudProviderCompany8101Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudProviderCompany8101Application.class, args);
    }

}
