package com.marble.server;

import com.marble.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author marble
 * @date 2020/4/6 13:08
 * @description
 */
public interface BookService {
    //增
    int addBook(Books books);

    //删
    int deleteBookById(int id);

    //更新
    int updateBook(Books books);

    //查询一本
    Books queryBookById(int id);

    //查询所有
    List<Books> queryAllBook();

    //查询书籍 通过书名
    Books queryBookByBookName(String name);
}
