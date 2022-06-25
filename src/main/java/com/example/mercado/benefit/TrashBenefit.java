package com.example.mercado.benefit;

import com.example.mercado.member.Grade;
import com.example.mercado.member.Member;

public class TrashBenefit implements Benefit{
    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price * discountPercent/100;
        } else {
            return 0;
        }
    }

//    @Override
//    public String countOrder(Member member, int count) {
//        return null;
//    }
}
