package com.wee.projectc.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
public class MemberTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void save() {
        Member params = Member.builder()
                .name("멤버1")
                .build();

        memberRepository.save(params);

        Member member = memberRepository.findById(1L).get();
        Assertions.assertThat(member.getName()).isEqualTo("멤버1");
    }

    @Test
    void findAll() {
        Member params = Member.builder()
                .name("멤버1")
                .build();

        memberRepository.save(params);

        long count = memberRepository.count();
        List<Member> memberList = memberRepository.findAll();
        Assertions.assertThat(count).isEqualTo(1L);
        for(Member member : memberList) {
            System.out.println("member = " + member.getName());
        }
    }



}
