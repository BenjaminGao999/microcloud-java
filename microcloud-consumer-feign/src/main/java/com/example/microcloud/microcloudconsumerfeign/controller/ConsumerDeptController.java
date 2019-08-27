package com.example.microcloud.microcloudconsumerfeign.controller;

import com.example.microcloud.microcloudapi.domain.Dept;
import com.example.microcloud.microcloudservice.service.IDeptClientService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author benjamin
 * created at 2019/8/25
 */

@RestController
public class ConsumerDeptController {
    @Resource
    private IDeptClientService deptService;

    @GetMapping(value = "/consumer/dept/get")
    public Object getDept(long id) {
        return this.deptService.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public Object listDept() {
        return this.deptService.list();
    }

    @PostMapping(value = "/consumer/dept/add")
    public Object addDept(Dept dept) {
        return this.deptService.add(dept);
    }
}
