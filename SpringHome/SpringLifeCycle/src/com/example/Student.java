// right click >> source >> generate,,,

// project right click >> build path >> add folder >> resources
// new >> other >> spring beans sth >> beans.xml
// convert to maven
// spring >> add spring nature sth 
// pom.xml >> run maven install

package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student5")
public class Student {
	@Value("${user1.name}")
	private String name;
	@Value("${user1.age}")	
	private int age;
	@Value("${user1.hobby1},${user1.hobby2},${user1.hobby3}")	
	private List<String> hobbies;
	@Value("${user1.height}")		
	private double height;
	@Value("${user1.weight}")
	private double weight;

//	// Construct using field
//	public Student(String name, int age, ArrayList<String> hobbies) {
//		this.name = name;
//		this.age = age;
//		this.hobbies = hobbies;
//	}
//
	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", hobbies=" + hobbies + ", height=" + height + ", weight="
				+ weight + "]";
	}
//
//	// getter setter
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public ArrayList<String> getHobbies() {
//		return hobbies;
//	}
//
//	public void setHobbies(ArrayList<String> hobbies) {
//		this.hobbies = hobbies;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}

}
