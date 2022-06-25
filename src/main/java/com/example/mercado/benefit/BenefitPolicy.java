package com.example.mercado.benefit;

import com.example.mercado.member.Grade;
import com.example.mercado.member.Member;
import com.example.mercado.order.Order;

public class BenefitPolicy implements Benefit {
    private int discountFixAmount = 1;
//    private int count =0;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;
        }
    }

//    @Override
//    public String countOrder(Member member, int count) {
//        if(count>5){
//            if(member.getGrade()!=Grade.VIP){
//                return "not allowed";
//            }
//            else{
//                return "vip allowed to post more than 5";
//            }
//        }
//        else{
//            return "post allowed";
//        }
//    }
}
