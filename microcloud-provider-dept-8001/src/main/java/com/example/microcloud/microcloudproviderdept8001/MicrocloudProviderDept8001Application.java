package com.example.microcloud.microcloudproviderdept8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.microcloud.microcloudproviderdept8001.mapper"})
@EnableEurekaClient
@EnableDiscoveryClient
public class MicrocloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudProviderDept8001Application.class, args);
    }

}
