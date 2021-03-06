package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Imployee  implements InitializingBean, DisposableBean{
	private String name;
	private int age;
	
	// Constructor
	public Imployee(String name, int age) {
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
