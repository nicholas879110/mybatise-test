package com.zlw.mybatise.test.persitent;

import com.zlw.mybatise.test.domain.Blog;

import java.util.List;

/**
 * @Title
 * @Package com.zlw.mybatise.test.persitent
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public interface BlogMapper {

//    @Select("SELECT * FROM blog WHERE id = #{id}")
    Blog getBlogById(int id);

    List<Blog> listBlogs();

    List<Blog> listBlogsByTrim(Blog blog);

    void insertBlog(Blog blog);

    void updateBlog(Blog blog);

}
