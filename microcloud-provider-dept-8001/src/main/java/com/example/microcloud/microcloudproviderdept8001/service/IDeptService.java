package com.example.microcloud.microcloudproviderdept8001.service;




import com.example.microcloud.microcloudproviderdept8001.model.Dept;

import java.util.List;

/**
 * @author benjamin
 * created at 2019/8/25
 */

public interface IDeptService {
    public Dept get(long id) ;
    public boolean add(Dept dept) ;
    public List<Dept> list() ;
}
