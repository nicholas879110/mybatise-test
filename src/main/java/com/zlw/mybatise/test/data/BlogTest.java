package com.zlw.mybatise.test.data;

import com.zlw.mybatise.test.domain.Author;
import com.zlw.mybatise.test.domain.Blog;
import com.zlw.mybatise.test.resourse.MyBatiseResourseUtil;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title
 * @Package com.zlw.mybatise.test.data
 * @Description:
 * @Author zlw
 * @Date 2015/12/30
 * @Version v1.0
 */
public class BlogTest {

    public static void insetBlogs() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Blog> blogs = assembleDatas();
            for (Blog blog : blogs) {
                session.insert("com.zlw.mybatise.test.persitent.BlogMapper.insertBlog", blog);
            }
            session.commit();
        } finally {
            session.close();
        }
    }

    public static void insetAuthor() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            Author author = new Author();
            author.setEmail("2@11.ccc");
            author.setBio("女");
            author.setFavouriteSection("足球");
            author.setUsername("zhs");
            author.setPassword("123456");
            session.insert("com.zlw.mybatise.test.persitent.BlogMapper.insertAuthor", author);
            session.commit();
        } finally {
            session.close();
        }
    }


    public static List<Blog> listBlogsByTrim() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            Blog param = new Blog();
            param.setId(1);
            param.setTitle("title");
            List<Blog> blogs = session.selectList("com.zlw.mybatise.test.persitent.BlogMapper.listBlogsByTrim", param);
            for (Blog blog : blogs) {
                System.out.println("blog:" + blog.getId() + "," + blog.getTitle());
                System.out.println("--------------------------------------");
            }
            return blogs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return new ArrayList<Blog>();
    }

    public static List<Blog> listAllBlogs() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Blog> blogs = session.selectList("com.zlw.mybatise.test.persitent.BlogMapper.listBlogs");
            for (Blog blog : blogs) {
                System.out.println("blog:" + blog.getId() + "," + blog.getTitle());
                System.out.println("--------------------------------------");
            }
            return blogs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return new ArrayList<Blog>();
    }

    public static void updateBlogs(List<Blog> blogs) {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            for (Blog blog : blogs) {
                blog.setTitle(blog.getTitle() + "--update");
                session.update("com.zlw.mybatise.test.persitent.BlogMapper.updateBlog", blog);
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static List<Blog> listBlogsBySqlGram() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
//            List<Blog> blogs = session.selectList("com.zlw.mybatise.test.persitent.BlogMapper.listBlogsBySqlGram");
            List<Blog> blogs = session.selectList("com.zlw.mybatise.test.persitent.BlogMapper.listBlogsBySqlIncludGram");
            Configuration configuration=session.getConfiguration();
            for (Blog blog : blogs) {
                System.out.println("blog:" + blog.getId() + "," + blog.getTitle());
                System.out.println("--------------------------------------");
            }
            return blogs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return new ArrayList<Blog>();
    }


    public static List<Blog> assembleDatas() {
        List<Blog> list = new ArrayList<Blog>();
        Blog blog = null;
        for (int i = 0; i < 10; i++) {
            blog = new Blog();
            blog.setTitle("title-" + i);
            list.add(blog);
        }
        return list;
    }

    public static Blog getBlogByIdAnnotation() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = MyBatiseResourseUtil.getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            Blog blog = session.selectOne("com.zlw.mybatise.test.persitent.BlogMapper.getBlogByIdAnnotation", 1);
            Blog blog1 = session.selectOne("com.zlw.mybatise.test.persitent.Blog1Mapper.getBlogByIdAnnotation", 1);

            Configuration configuration=session.getConfiguration();
            System.out.println("blog:" + blog.getId() + "," + blog.getTitle());
            System.out.println("--------------------------------------");
            return blog;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public static void main(String[] args) {
//        insetAuthor();
//        insetBlogs();
        getBlogByIdAnnotation();

//        List<Blog> blogs= listBlogsByTrim();
//        updateBlogs(blogs);

//        List<Blog> blogs = listBlogsBySqlGram();


    }
}
