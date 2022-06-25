package com.example.mercado.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
