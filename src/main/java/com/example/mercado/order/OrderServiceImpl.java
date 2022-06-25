package com.example.mercado.order;

import com.example.mercado.benefit.Benefit;
import com.example.mercado.benefit.BenefitPolicy;
import com.example.mercado.member.Member;
import com.example.mercado.member.MemberRepository;
import com.example.mercado.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private final Benefit benefit;

    public OrderServiceImpl(MemberRepository memberRepository, Benefit benefit) {
        this.memberRepository = memberRepository;
        this.benefit = benefit;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);

        int discountPrice = benefit.discount(member, itemPrice);
//        String checking = benefit.countOrder(member, count);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
