package com.example.mercado.order;

import com.example.mercado.AppConfig;
import com.example.mercado.member.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

//    MemberService memberService;
//    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        AppConfig appConfig = new AppConfig();
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
    }

    @Test
    void createOrder(){
        Long memberId= 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        AppConfig appConfig = new AppConfig();
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        memberService.join(member);
        Order order = orderService.createOrder(memberId,"itemA",10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}