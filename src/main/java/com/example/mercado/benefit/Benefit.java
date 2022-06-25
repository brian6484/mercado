package com.example.mercado.benefit;

import com.example.mercado.member.Member;
import com.example.mercado.order.Order;

public interface Benefit {
    int discount(Member member, int price);

//    String countOrder(Member member, int count);
}
