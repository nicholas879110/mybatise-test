package com.zlw.mybatise.test.reflect;

import java.util.List;

public  class AbstractSimpleClasss<M> {

    public  M test1(){
        return (M) new Object();
    }

    public List<M> test2(){
        return null;
    }

    public  MySimpleObject<M> test(){
        return new MySimpleObject<M>();
    }
}
