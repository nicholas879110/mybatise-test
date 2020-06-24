package com.zlw.mybatise.test.persitent;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class BlogProvider {

    public String getBlogByIdAnnotation(final Integer id){
        return new SQL(){{
            SELECT("*");
            FROM("blog");
            WHERE("id="+id);
        }}.toString();
    }

}
