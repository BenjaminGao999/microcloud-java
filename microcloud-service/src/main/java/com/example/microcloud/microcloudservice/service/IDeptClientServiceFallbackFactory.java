package com.example.microcloud.microcloudservice.service;

import java.util.List;

import com.example.microcloud.microcloudapi.domain.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class IDeptClientServiceFallbackFactory
        implements FallbackFactory<IDeptClientService> {

    @Override
    public IDeptClientService create(Throwable cause) {
        return new IDeptClientService() {
            @Override
            public Dept get(long id) {
                Dept vo = new Dept();
                vo.setDeptno(888888L);
                vo.setDname("【ERROR】Feign-Hystrix"); // 错误的提示
                vo.setLoc("Consumer客户端提供");
                return vo;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }

}