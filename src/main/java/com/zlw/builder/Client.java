package com.zlw.builder;

/**
 * @Title
 * @Package com.zlw.builder
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public class Client {
    public static void main(String args[]){
        Builder builder=new BMWbuilder();//创建一个Builder对象
        Director director=new Director();//创建一个Director对象
        director.product(builder);//Director对象造车
        builder.getCar();//将制造的车返回
    }
}
