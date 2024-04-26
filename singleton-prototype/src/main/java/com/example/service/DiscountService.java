package com.example.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DiscountService implements IDiscountService{
    @Override
    public double discountGenerator(double price) {
        return ((price/100)*20);
    }
}
