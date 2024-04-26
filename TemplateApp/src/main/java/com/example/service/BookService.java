package com.example.service;

import com.example.entity.Book;
import com.example.entity.Customer;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public int count() {
        return bookRepository.count();
    }

    public void saveBooks(List<Book> books){
        books.forEach(book -> {
            bookRepository.save(book);
        });
    }

    public int deleteById(Long id){
        return bookRepository.deleteById(id);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public List<Book> findByNameAndPrice(String name, BigDecimal price){
        return bookRepository.findByNameAndPrice(name,price);
    }

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }
}
