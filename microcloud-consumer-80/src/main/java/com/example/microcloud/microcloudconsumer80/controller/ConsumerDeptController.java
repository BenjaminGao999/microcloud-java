package com.example.microcloud.microcloudconsumer80.controller;

import com.example.microcloud.microcloudapi.domain.Dept;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author benjamin
 * created at 2019/8/25
 */

@RestController
public class ConsumerDeptController {
    public static final String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list/";
    public static final String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add?dname=";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders headers;

    @GetMapping(value = "/consumer/dept/get")
    public Object getDept(long id) {
        Dept dept = this.restTemplate
                .exchange(DEPT_GET_URL + id, HttpMethod.GET,
                        new HttpEntity<Object>(this.headers), Dept.class)
                .getBody();
        return dept;
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/consumer/dept/list")
    public Object listDept() {
        List<Dept> allDepts = this.restTemplate
                .exchange(DEPT_LIST_URL, HttpMethod.GET,
                        new HttpEntity<Object>(this.headers), List.class)
                .getBody();
        return allDepts;
    }

    @PostMapping(value = "/consumer/dept/add")
    public Object addDept(Dept dept) throws Exception {
        Boolean flag = this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST,
                new HttpEntity<Object>(dept, this.headers), Boolean.class)
                .getBody();
        return flag;
    }
}