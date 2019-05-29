package com.springboot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.DAO.BookRepository;
import com.springboot.Entity.Book;
import com.springboot.Service.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMockitoApplicationTests {

    @Autowired
    private BookService service;

    @MockBean
    private BookRepository repository;

    @Test
    public void getBooksTest() {
        when(repository.findAll()).thenReturn(Stream
                .of(new Book(500, "Danile",  "USA"), new Book(958, "Huy",  "UK")).collect(Collectors.toList()));
        assertEquals(2, service.getBooks().size());
    }

    @Test
    public void getBookbyId() {
        int  id = 4;
        when(repository.findAll()).thenReturn(Stream
                .of(new Book(500, "Danile",  "USA"), new Book(958, "Huy",  "UK")).collect(Collectors.toList()));
        assertEquals(1, service.getBooks().size());
    }

//    @Test
//    public void saveUserTest() {
//        User user = new User(999, "Pranya", 33, "Pune");
//        when(repository.save(user)).thenReturn(user);
//        assertEquals(user, service.addUser(user));
//    }
//
//    @Test
//    public void deleteUserTest() {
//        User user = new User(999, "Pranya", 33, "Pune");
//        service.deleteUser(user);
//        verify(repository, times(1)).delete(user);
//    }

}