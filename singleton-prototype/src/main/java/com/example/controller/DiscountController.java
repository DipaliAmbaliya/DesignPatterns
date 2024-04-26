package com.example.controller;

import com.example.service.IDiscountService;
import com.example.service.IProductService;
import com.example.model.Product;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DiscountController {
    @Autowired
    private IProductService productService;

    @Autowired
    private IDiscountService discountService;

    @GetMapping(value = "/discountOnAllProduct", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getProduct() throws JSONException {
        System.out.println(productService);
        System.out.println(discountService);
        List<JSONObject> entities = new ArrayList<JSONObject>();
        for (Product product : productService.findAll()) {
            JSONObject entity = new JSONObject();
            entity.put("id", product.getId());
            entity.put("pname", product.getPname());
            entity.put("batchno", product.getBatchno());
            entity.put("price", product.getPrice());
            entity.put("noofproduct", product.getNoofproduct());
            entity.put("discount", discountService.discountGenerator(product.getPrice())*product.getNoofproduct());
            entities.add(entity);
        }
        return new ResponseEntity<Object>(entities.toString(), HttpStatus.OK);
    }
}