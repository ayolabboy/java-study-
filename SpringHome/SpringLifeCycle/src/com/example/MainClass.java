package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		// way 1		
		// 컨테이너 생성
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();		
		// 컨테이너 설정
		context.load("classpath:beans.xml");
		context.refresh();
		// 컨테이너 사용
		Student student5 = context.getBean("student5", Student.class);
		System.out.println(student5);
		// 컨테이너 소멸
		context.close();	
		
		// way 2
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Student jimin = ctx.getBean("student2", Student.class);
		//System.out.println(jimin);
		
		// way 3
//		// 컨테이너 생성
//		GenericXmlApplicationContext context = new GenericXmlApplicationContext();		
//		// 컨테이너 설정
//		context.load("classpath:beans.xml");
//		context.refresh();
//		// 컨테이너 사용
//		Employee employee1 = context.getBean("emp1", Employee.class);
//		System.out.println(employee1);
//		// 컨테이너 소멸
//		context.close();	

	}

}
