package com.atguigu.spring5.dao1;

import org.springframework.stereotype.Repository;

@Repository
public class UsrDaoOneImp implements UserDaoOne{
    @Override
    public void add() {
        System.out.println("dao add........");
    }
}
