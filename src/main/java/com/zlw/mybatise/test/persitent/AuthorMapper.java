package com.zlw.mybatise.test.persitent;

import com.zlw.mybatise.test.domain.Author;
import com.zlw.mybatise.test.domain.Blog;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Title
 * @Package com.zlw.mybatise.test.persitent
 * @Description:
 * @Author zlw
 * @Date 2015/12/21
 * @Version v1.0
 */
public interface AuthorMapper {
    void insertAuthor(Author author);
}
