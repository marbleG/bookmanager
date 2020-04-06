package com.marble.controller;

import com.marble.pojo.Books;
import com.marble.server.BookService;
import com.marble.server.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author marble
 * @date 2020/4/6 14:07
 * @description
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    //查询所有数据
    @RequestMapping("/allBook")
    public String findAllBooks(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    //跳转至添加书籍
    @GetMapping("/add")
    public String toAdd() {
        return "addBook";
    }

    //添加书籍
    @PostMapping("/add")
    public String toAdd(Books books) {
        System.out.println("添加数据：" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转至修改书籍
    @GetMapping("/update")
    public String toUpdate(int id, Model model) {
        System.out.println("获取查询id：" + id);
        Books books = bookService.queryBookById(id);
        model.addAttribute("book", books);
        return "updateBook";
    }

    //修改书籍
    @PostMapping("/update")
    public String update(Books books) {
        System.out.println("修改数据：" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @GetMapping("/delete")
    public String delete(int id) {
        System.out.println("删除数据：" + id);
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

}
