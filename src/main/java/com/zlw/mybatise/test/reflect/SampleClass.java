package com.zlw.mybatise.test.reflect;

public  class  SampleClass extends AbstractSimpleClasss<String> {

    private String sampleField;

    public String getSampleField() {
        return sampleField;
    }

    public void setSampleField(String sampleField) {
        this.sampleField = sampleField;
    }


}
