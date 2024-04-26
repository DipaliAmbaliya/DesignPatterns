package com.example.controller;

import java.util.List;

import com.example.service.IDiscountService;
import com.example.service.IProductService;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private IDiscountService discountService;

    @GetMapping(value = "/product")
    public List<Product> getProduct() {
        System.out.println(productService);
        List<Product> products = productService.findAll();
        System.out.println(discountService);
        for(Product product : products) {
            product.setDiscount(discountService.discountGenerator(product.getPrice()));
        }
        return products;
    }
}
