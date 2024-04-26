package com.example.controller;

import com.example.entity.Book;
import com.example.entity.Customer;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    public BookService bookService;

    @PostMapping(value = "/saveBooks")
    public String saveCustomers() {
        List<Book> books = Arrays.asList(
                new Book("Thinking in Java", new BigDecimal("46.32")),
                new Book("Mkyong in Java", new BigDecimal("1.99")),
                new Book("Getting Clojure", new BigDecimal("37.3")),
                new Book("Head First Android Development", new BigDecimal("41.19"))
        );

        bookService.saveBooks(books);
        return "success";
    }

    @GetMapping(value = "/findById")
    public Optional<Book> findById(@RequestParam Long id){
        return Optional.ofNullable(bookService.findById(id).orElse(null));
    }

    @DeleteMapping(value = "/deleteById")
    public int deleteById(@RequestParam Long id){
        return bookService.deleteById(id);
    }

    @GetMapping(value = "/findAll")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping(value = "/findByNameAndPrice")
    public List<Book> findCustomerNameById(@RequestParam String name, @RequestParam BigDecimal price){
        return bookService.findByNameAndPrice(name,price);
    }

    @GetMapping(value = "/count")
    public int countCustomers(){
        return bookService.count();
    }

}
