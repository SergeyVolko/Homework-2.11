package com.example.homework_2_11.service;

import com.example.homework_2_11.dto.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class ServiceBasketImpl implements ServiceBasket {

    private final Basket basket;
    @Autowired
    public ServiceBasketImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Integer> ids) {
        basket.add(ids);
    }

    @Override
    public List<Integer> get() {
        return basket.get();
    }
}
