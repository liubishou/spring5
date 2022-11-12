package com.atguigu.spring5;

public class User {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private String address;
    public void add(){
        System.out.println("add......");
    }
    public void testDemo(){
        System.out.println(id+"::"+name+"::"+address);
    }
}
