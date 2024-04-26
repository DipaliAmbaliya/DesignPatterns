package com.example.service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void saveCustomer(List<Customer> customers) {
        customers.forEach(x -> {
            customerRepository.save(x);
        });
    }

    public Customer findByCustomerId (Long id){
        return customerRepository.findByCustomerId(id);
    }
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public String findCustomerNameById(Long id) {
        return customerRepository.findCustomerNameById(id);
    }

    public int countCustomers() {
        return customerRepository.count();
    }
}
