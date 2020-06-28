package com.zlw.mybatise.test.resourse;

import com.zlw.mybatise.test.domain.Blog;
import com.zlw.mybatise.test.persitent.BlogMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Title
 * @Package com.zlw.mybatise.test.resourse
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public class MyBatiseResourseUtil {

    public static SqlSessionFactory getSessionFactory() throws IOException {
        String resource = "mybatise-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    public static void excute() {
        SqlSessionFactory sqlSessionFactory= null;
        try {
            sqlSessionFactory = getSessionFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sqlSessionFactory.openSession();
        try {
            Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
        } finally {
            session.close();
        }
//        SqlSession session1 = sqlSessionFactory.openSession();
//        try {
//            BlogMapper mapper = session1.getMapper(BlogMapper.class);
//            Blog blog = mapper.getBlogById(101);
//        } finally {
//            session.close();
//        }
    }


    public static void getSessionFactoryFromCode() {
//        DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
        Properties properties = new Properties();
        properties.setProperty("driver", "com.mysql.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://127.0.0.1:3306/mybatis");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");
        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(properties);
        DataSource dataSource = pooledDataSourceFactory.getDataSource();

        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
//        configuration.addMapper(BlogMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
    }
}
