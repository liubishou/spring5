package com.atguigu.spring5.add;

import com.atguigu.spring5.dao1.UserDaoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdd {
    @Autowired
    private UserDaoOne userDaoOne;
    public void add(){
        System.out.println("add......");
        userDaoOne.add();
    }

}
