package com.example.mercado.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
