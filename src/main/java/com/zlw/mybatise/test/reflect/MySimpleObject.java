package com.zlw.mybatise.test.reflect;

public class MySimpleObject<M> extends SimpleObject<M> {

    @Override
    public String getA() {
        return super.getA();
    }

    @Override
    public void setA(String a) {
        super.setA(a);
    }

    @Override
    public M getB() {
        return super.getB();
    }

    @Override
    public void setB(M b) {
        super.setB(b);
    }
}
