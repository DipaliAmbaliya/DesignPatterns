package com.example.controller;

import com.example.entity.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/saveCustomers")
    public String saveCustomers() {
        List<Customer> list = Arrays.asList(
                new Customer("Customer A", 19),
                new Customer("Customer B", 20),
                new Customer("Customer C", 21),
                new Customer("Customer D", 22)
        );
        customerService.saveCustomer(list);
        return "success";
    }

    @GetMapping(value = "/findByCustomerId")
    public Customer findByCustomerId(@RequestParam Long id){
        return customerService.findByCustomerId(id);
    }

    @GetMapping(value = "/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping(value = "/findCustomerNameById")
    public String findCustomerNameById(@RequestParam Long id){
        return customerService.findCustomerNameById(id);
    }

    @GetMapping(value = "/count")
    public int countCustomers(){
        return customerService.countCustomers();
    }
}
