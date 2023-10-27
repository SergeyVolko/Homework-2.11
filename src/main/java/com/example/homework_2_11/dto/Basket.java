package com.example.homework_2_11.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> items = new ArrayList<>();

    public void add(List<Integer> ids) {
        items.addAll(ids);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(items);
    }
}
