package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.Dao;
import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao1.UserDaoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service(value = "userService")
@Repository
public class UserService {
//    private Dao dao;
    //添加注解
    //不需要set方法
    @Autowired
    private UserDaoOne userDaoOne;

//    public void setDao(Dao dao) {
//        this.dao = dao;
//    }

    public void add(){
        System.out.println("add.......");
//        dao.speak();
        userDaoOne.add();
    }


}
