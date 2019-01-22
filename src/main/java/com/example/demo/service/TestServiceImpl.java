package com.example.demo.service;

import com.example.demo.Dao.TestDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

    @Autowired
    private TestDao testDao;

    public void test(){
        System.out.println("我是service");
        System.out.println("service开始");
        User user = testDao.findByName("aaa");
        System.out.println(user.getId()+"======="+user.getName());
        System.out.println("service结束");
    }
}
