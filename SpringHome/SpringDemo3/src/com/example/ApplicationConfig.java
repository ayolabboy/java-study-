package com.example;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

@Configuration 
public class ApplicationConfig {
	// Student student1 = new Student(); (제어가 우리한테 있을 때는 이렇게 쓰고, 저렇게 쓸 때는 제어가 컨테이너에 있을 때, 사용은 유사하다)
	@Bean
	public Student student1() { 
		ArrayList<String> hobbys = new ArrayList<String>(); 
		hobbys.add("독서");
		hobbys.add("영화감상");
		hobbys.add("요리");
		Student student = new Student("한지민", 25, hobbys);
		student.setHeight(165);
		student.setWeight(45);
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("노래부르기");
		hobbys.add("게임");
		Student student = new Student("설운도", 50, hobbys);
		student.setHeight(175);
		student.setWeight(75);
		return student;
	}	

}
