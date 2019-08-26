package com.example.microcloud.microcloudproviderdept8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.microcloud.microcloudproviderdept8001.mapper"})
public class MicrocloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudProviderDept8001Application.class, args);
    }

}
