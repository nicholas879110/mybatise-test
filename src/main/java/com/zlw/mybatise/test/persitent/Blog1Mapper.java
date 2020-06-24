package com.zlw.mybatise.test.persitent;

import com.zlw.mybatise.test.domain.Blog;
import org.apache.ibatis.annotations.*;

/**
 * @Title
 * @Package com.zlw.mybatise.test.persitent
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public interface Blog1Mapper {

    @SelectProvider(type=BlogProvider.class,method="getBlogByIdAnnotation")
    @Results({
            @Result(id = true, property = "id" ,column = "id"),
            @Result(column="title", property="title")
    })
    Blog getBlogByIdAnnotation(@Param(value = "id") Integer id);

}
