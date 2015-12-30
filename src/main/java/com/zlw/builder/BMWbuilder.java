package com.zlw.builder;

/**
 * @Title
 * @Package com.zlw.builder
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public class BMWbuilder implements Builder {
    public void buildEngine() {
        System.out.println("构建宝马引擎");
    }

    public void bulidTyre() {
        System.out.println("构建宝马轮胎");
    }

    public void buildCar() {

        System.out.println("构建宝马车身");
    }

    public void getCar() {
        System.out.println("获取宝马车");
    }
}
