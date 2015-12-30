package com.zlw.builder;

/**
 * @Title
 * @Package com.zlw.builder
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public class Director {
    public void product(Builder builder){
        builder.buildCar();
        builder.buildEngine();
        builder.bulidTyre();
    }
}
