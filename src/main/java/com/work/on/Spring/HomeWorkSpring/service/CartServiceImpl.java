package com.work.on.Spring.HomeWorkSpring.service;

import com.work.on.Spring.HomeWorkSpring.cart.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    private final Basket basket;

    public CartServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return basket.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}
