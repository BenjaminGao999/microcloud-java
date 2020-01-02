package com.example.microcloud.microcloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.example.microcloud.microcloudservice.service"})
@ComponentScan("com.example.microcloud")
public class MicrocloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudConsumerFeignApplication.class, args);
    }

}
