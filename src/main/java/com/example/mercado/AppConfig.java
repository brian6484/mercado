package com.example.mercado;

import com.example.mercado.benefit.Benefit;
import com.example.mercado.benefit.TrashBenefit;
import com.example.mercado.member.MemberRepository;
import com.example.mercado.member.MemberService;
import com.example.mercado.member.MemberServiceImpl;
import com.example.mercado.member.MemoryMemberRepository;
import com.example.mercado.order.OrderService;
import com.example.mercado.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                benefit());
    }

//  refactoring
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public Benefit benefit(){
        return new TrashBenefit();
    }
}
