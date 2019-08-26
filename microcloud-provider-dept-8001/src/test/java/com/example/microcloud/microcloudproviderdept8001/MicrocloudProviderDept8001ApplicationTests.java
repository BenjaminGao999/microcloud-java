package com.example.microcloud.microcloudproviderdept8001;

import com.example.microcloud.microcloudproviderdept8001.model.Dept;
import com.example.microcloud.microcloudproviderdept8001.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicrocloudProviderDept8001ApplicationTests {

    @Autowired
    private IDeptService deptService;

    @Test
    public void testGet() {
        Dept dept = this.deptService.get(1);
        System.out.println(dept);
    }

    @Test
    public void testAdd() {
        Dept dept = new Dept();
        dept.setDname("测试部-" + System.currentTimeMillis());
        System.out.println(this.deptService.add(dept));
    }

    @Test
    public void testList() {
        System.out.println(this.deptService.list());
    }


}
