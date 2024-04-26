package com.example.builder.service;

import com.example.builder.entity.Customer;
import com.example.builder.repository.CustomerRepository;
import com.example.builder.util.model.ApiResponse;
import com.example.builder.util.model.ResponseBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    private CustomerRepository customerRepository;
    private ResponseBuilder responseBuilder;

    public CustomerService(CustomerRepository customerRepository,ResponseBuilder responseBuilder){
        this.customerRepository = customerRepository;
        this.responseBuilder = responseBuilder;
    }

    public ResponseEntity<ApiResponse> findAll() {
        List<Customer> customers = customerRepository.findAll();
        return responseBuilder.buildResponse(HttpStatus.OK.value(),"Customer details",customers);
    }
}
