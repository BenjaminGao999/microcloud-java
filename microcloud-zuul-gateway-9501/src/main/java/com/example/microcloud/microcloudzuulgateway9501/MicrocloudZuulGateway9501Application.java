package com.example.microcloud.microcloudzuulgateway9501;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicrocloudZuulGateway9501Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudZuulGateway9501Application.class, args);
    }

}
