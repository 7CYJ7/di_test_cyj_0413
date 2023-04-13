package com.yongjincompany.ditest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// 컨테이너 생성
		
		Student stu1 = ctx.getBean("student1", Student.class);
		System.out.println(stu1.getName());
		

	}

}
