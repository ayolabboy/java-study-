package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/*
public class Employee implements InitializingBean, DisposableBean{
	private String name;
	private int age;
	
	// Constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// to String
	@Override
	public String toString() {
		return "Imployee [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("방금 빈이 소멸됨!");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("방금 빈이 생성됨!");
	}	
	
}
*/
public class Employee {
	private String name;
	private int age;
	
	// Constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// to String
	@Override
	public String toString() {
		return "Imployee [name=" + name + ", age=" + age + "]";
	}
	// 생성 후
	@PostConstruct
	public void initMEthod() {
		System.out.println("빈이 생성됨!");
	}
	// 소멸 전
	@PreDestroy
	public void destroyMethod() {
		System.out.println("빈이 소멸됨ㅠ");
	}
	
}
