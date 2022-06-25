package com.example.mercado.order;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

//    private int count;

    public float calculatePrice(){
        return itemPrice - discountPrice;
    }

}
