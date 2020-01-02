package com.example.microcloud.microcloudconsumer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.client.ClientHttpRequestInterceptor;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ribbonClient01")
public class MicrocloudConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudConsumer80Application.class, args);

        RestTemplateCustomizer restTemplateCustomizer = restTemplate -> {

            List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();


        };
    }

}
