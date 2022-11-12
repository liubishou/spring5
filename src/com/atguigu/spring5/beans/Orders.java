package com.atguigu.spring5.beans;

public class Orders {
    private String oName;

    public Orders() {
        System.out.println("输出第一步，通过无参构造器创建对象");
    }

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("第二步：通过set方法注入属性");
    }
    //bean初始化方法
    public void initMethod(){
        System.out.println("第三步：配置bean的初始化方法");
    }
    //bean的销毁方法
    public void desMethod(){
        System.out.println("第五步 销毁bean对象");
    }
}
