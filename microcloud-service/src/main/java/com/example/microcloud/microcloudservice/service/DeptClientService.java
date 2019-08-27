package com.example.microcloud.microcloudservice.service;

import java.util.List;

import com.example.microcloud.microcloudapi.domain.Dept;
import com.example.microcloud.microcloudservice.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * 通过注解@FeignClient添加接口对应的远程微服务名称value="MICROCLOUD-PROVIDER-DEPT"和
 * 服务的认证configuration=FeignClientConfig.class
 */
@FeignClient(value = "MICROCLOUD-PROVIDER-DEPT",
        configuration = FeignClientConfig.class,
        fallbackFactory = IDeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();

    @PostMapping(value = "/dept/add")
    boolean add(Dept dept);
}
