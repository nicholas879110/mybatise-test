package com.zlw.mybatise.test.persitent;

import com.zlw.mybatise.test.domain.Author;
import com.zlw.mybatise.test.domain.Blog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import javax.xml.bind.annotation.XmlEnumValue;
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

//    @Select({"SELECT * FROM blog WHERE id = #{id}"})
//    @Select({
//       "<script>" +
//               "SELECT * FROM blog " +
//               "<where> <if test=\"id != null\"> and id = #{id}</if></where> " +
//                    "</script>"
//     })
//    @Select({
//        "SELECT * FROM blog " +
//        "where id =${id} "
//     })
    @SelectProvider(type=BlogProvider.class,method="getBlogByIdAnnotation")
    Blog getBlogByIdAnnotation(@Param(value="id")Integer id);

    List<Blog> listBlogs();

    List<Blog> listBlogsByTrim(Blog blog);

    void insertBlog(Blog blog);

    void updateBlog(Blog blog);

    void insertAuthor(Author author);


}
