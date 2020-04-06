package com.marble.controller;


import com.marble.server.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookControllerTest {

    @Test
    public void findAllBooks() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookServiceImpl");
        System.out.println(bookServiceImpl.queryAllBook());
    }
}
