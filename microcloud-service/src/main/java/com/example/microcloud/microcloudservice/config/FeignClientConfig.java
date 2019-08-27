package com.example.microcloud.microcloudservice.config;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;


/**
 * @author benjamin
 * created at 2019/8/26
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public Logger.Level getFeignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("studyjava", "hello");
    }
}
