package com.example.microcloud.microcloudproviderdept8001.service.impl;

import com.example.microcloud.microcloudproviderdept8001.mapper.DeptMapper;
import com.example.microcloud.microcloudproviderdept8001.model.Dept;
import com.example.microcloud.microcloudproviderdept8001.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author benjamin
 * created at 2019/8/25
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(long id) {

        Dept dept = deptMapper.selectByPrimaryKey(id);

        return dept;

    }

    @Override
    public boolean add(Dept dept) {

        int i = deptMapper.insertSelective(dept);

        return i > 0;
    }

    @Override
    public List<Dept> list() {
        List<Dept> depts = deptMapper.selectByExample(null);

        return depts;

    }

}
