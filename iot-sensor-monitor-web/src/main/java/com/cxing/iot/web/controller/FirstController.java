package com.cxing.iot.web.controller;

import com.cxing.iot.model.book.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FirstController {

    @RequestMapping("/index")
    public String index(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/book")
    public List<Book> getBook() {
        List<Book> books = new LinkedList<>();
        books.add(new Book("java 开发经典", 67, "电子出版社"));
        books.add(new Book("python 开发经典", 57, "电子出版社"));
        return books;
    }
}
