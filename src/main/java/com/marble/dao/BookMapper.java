package com.marble.dao;

import com.marble.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author marble
 * @date 2020/4/6 12:55
 * @description
 */
public interface BookMapper {
    //增
    int addBook(Books books);

    //删
    int deleteBookById(@Param("bookId") int id);

    //更新
    int updateBook(Books books);

    //查询一本
    Books queryBookById(@Param("bookId") int id);

    //查询所有
    List<Books> queryAllBook();

}
