package com.example.vo;

public class MemberVO {
	private String userid;
	private String name;
	private int age;
	
	// 생성자
	public MemberVO(String userid, String name, int age) {
		super();
		this.userid = userid;
		this.name = name;
		this.age = age;
	}
	// getter setter
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
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
	// to string
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", name=" + name + ", age=" + age + "]";
	}
	
}
