package com.work.on.Spring.HomeWorkSpring.service;

import java.util.List;

public interface CartService {
    List<Integer> addItems(List<Integer> ids);
    List<Integer> getItems();
}
