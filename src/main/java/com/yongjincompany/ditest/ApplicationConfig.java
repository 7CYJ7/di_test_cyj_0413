package com.yongjincompany.ditest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		Student student = new Student("홍길동", 17, 168, 85);
		
		return student;
	}
	@Bean
	public Student student2() {
		Student student = new Student("이순신", 32, 185, 90);
		
		return student;
	}

}
