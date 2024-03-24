package com.work.on.Spring.HomeWorkSpring.controller;

import com.work.on.Spring.HomeWorkSpring.service.CartService;
import org.springframework.web.bind.annotation.*;
import com.work.on.Spring.HomeWorkSpring.service.CartServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids) {
        return cartService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
