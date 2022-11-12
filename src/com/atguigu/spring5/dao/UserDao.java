package com.atguigu.spring5.dao;

public class UserDao implements Dao{
    @Override
    public void speak() {
        System.out.println("speak............");
    }
}
