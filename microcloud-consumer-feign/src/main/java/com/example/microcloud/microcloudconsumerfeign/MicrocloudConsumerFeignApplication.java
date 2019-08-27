package com.example.microcloud.microcloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicrocloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudConsumerFeignApplication.class, args);
    }

}
