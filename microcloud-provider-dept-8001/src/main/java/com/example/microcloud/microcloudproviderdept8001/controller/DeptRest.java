package com.example.microcloud.microcloudproviderdept8001.controller;

import com.example.microcloud.microcloudproviderdept8001.model.Dept;
import com.example.microcloud.microcloudproviderdept8001.service.IDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author benjamin
 * created at 2019/8/25
 */
@RestController
public class DeptRest {

    @Resource
    private IDeptService deptService;

    @Resource
    private DiscoveryClient client;    // 进行Eureka的发现服务

    @GetMapping("/dept/discover")
    public Object discover() {    // 直接返回发现服务信息
        return this.client;
    }


    @GetMapping("/dept/sessionId")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId();
    }


    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "getFallback")    // 如果当前调用的get()方法出现了错误，则执行fallback
    public Object get(@PathVariable("id") long id) {
        Dept dept = this.deptService.get(id);
        if (dept == null) {// 数据不存在，假设让它抛出个错误
            throw new RuntimeException("部门信息不存在！");
        }
        return dept;
    }

    public Object getFallback(@PathVariable("id") long id) {    // 此时方法的参数 与get()一致
        Dept vo = new Dept() ;
        vo.setDeptno(999999L);
        vo.setDname("【ERROR】Microcloud-Dept-Hystrix");    // 错误的提示
        vo.setLoc("DEPT-Provider");
        return vo ;
    }


    @PostMapping(value = "/dept/add")
    public Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept);
    }

    @GetMapping(value = "/dept/list")
    public Object list() {
        return this.deptService.list();
    }

}
