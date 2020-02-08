package com.example.test;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Employee;

public class BeanTest {
	ApplicationContext ctx;
	
	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:beans.xml");
	}
	
	@Test
	public void test1() {
//		Employee jimin = this.ctx.getBean("emp1",Employee.class);
//		Employee jimin2 = this.ctx.getBean("emp1",Employee.class);
	}
	
	
}
