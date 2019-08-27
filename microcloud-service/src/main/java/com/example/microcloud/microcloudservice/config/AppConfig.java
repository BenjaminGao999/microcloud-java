package com.example.microcloud.microcloudservice.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author benjamin
 * created at 2019/8/27
 */
@Configuration
@EnableFeignClients(basePackages = "com.example.microcloud.microcloudservice.service")
public class AppConfig {

}
