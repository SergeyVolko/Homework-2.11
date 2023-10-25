package com.example.homework_2_11.controller;

import com.example.homework_2_11.service.ServiceBasket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final ServiceBasket serviceBasket;
    @Autowired
    public BasketController(ServiceBasket serviceBasket) {
        this.serviceBasket = serviceBasket;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id")List<Integer> ids) {
        serviceBasket.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return serviceBasket.get();
    }
    @GetMapping
    public String test() {
        return "TEST";
    }
}
