package com.springboot;

import com.springboot.Controller.BookController;
import com.springboot.DAO.BookRepository;
import com.springboot.Entity.Book;
import com.springboot.Service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TEST2 {
    @Autowired
    BookService service;

    @MockBean
    private BookController repository;

    @Test
    public void getBooks(){
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book(1, "Abcd", "str"));
        list.add(new Book(3, "Abce", "sda"));
        when(repository.getBooks()).thenReturn(list);
        ArrayList<Book> books = (ArrayList<Book>) service.getBooks();
        assert books.size() == list.size();
    }

}