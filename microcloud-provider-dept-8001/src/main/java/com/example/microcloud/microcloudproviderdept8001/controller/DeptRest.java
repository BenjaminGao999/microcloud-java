package com.example.microcloud.microcloudproviderdept8001.controller;

import com.example.microcloud.microcloudproviderdept8001.model.Dept;
import com.example.microcloud.microcloudproviderdept8001.service.IDeptService;
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

    @GetMapping("/dept/sessionId")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId();
    }


    @GetMapping(value = "/dept/get/{id}")
    public Object get(@PathVariable("id") long id) {
        return this.deptService.get(id);
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
