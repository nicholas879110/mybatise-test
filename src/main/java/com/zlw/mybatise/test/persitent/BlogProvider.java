package com.zlw.mybatise.test.persitent;

import com.zlw.mybatise.test.domain.Blog;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class BlogProvider {

    public String getBlogByIdAnnotation(final Blog blog){
        return new SQL(){{
            SELECT("*");
            FROM("blog");
            WHERE("id="+blog.getId());
        }}.toString();
    }

}
