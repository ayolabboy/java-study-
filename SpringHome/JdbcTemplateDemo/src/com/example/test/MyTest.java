package com.example.test;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.MemberService;
import com.example.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class MyTest {
	@Autowired
	MemberService memberService;

	@Test
	public void test() {
		MemberVO member = new MemberVO("지민","지민이",24);
		int row = memberService.insertMember(member);
		assertSame(row,1);
	}
}