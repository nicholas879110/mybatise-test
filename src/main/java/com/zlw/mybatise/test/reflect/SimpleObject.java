package com.zlw.mybatise.test.reflect;

public class SimpleObject<T> {

    private String a;
    private T b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }
}
