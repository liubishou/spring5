package com.atguigu.spring5.collectiontype;

import java.util.List;

public class Book {
    private List<String> list;

    public void setBookList(List<String> list) {
        this.list = list;
    }
    public void speak1(){
        System.out.println(list);
    }
}
