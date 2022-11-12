package com.atguigu.spring5.annonate;

import org.springframework.stereotype.Component;

//在注解里面value可以不写
//默认值是类的名称，首字母小写

@Component(value = "userService")   //<bean id= class= >类似
public class UserService {
    public void add(){
        System.out.println("add.........");
    }
}
