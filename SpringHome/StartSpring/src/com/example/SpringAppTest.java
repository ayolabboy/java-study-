package com.example;
import org.junit.After;
//import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "beans.xml")
public class SpringAppTest {
	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void init() {
		if(this.ctx == null) {
			System.out.println("null 임");
		}else {
			System.out.println("null 아님");
		}
	}

	@Ignore @Test
	public void testy() {
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
	}

	@After
	public void close() {
		//ctx.close();
	}
}
