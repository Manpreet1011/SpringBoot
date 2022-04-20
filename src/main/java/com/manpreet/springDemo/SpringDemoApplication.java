package com.manpreet.springDemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
@Slf4j
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class, User.class);
		Car car1=context.getBean(Car.class);
		log.info("Car -{}", car1);
	}
	//@GetMapping("/student")
//	public User getUser()
//	{
//		return User.builder().Fname("Manpreet")
//				.Lname("Khangura")
//				.course("Java")
//				.build();
//	}

}
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//class User{
//	private String Fname;
//	private String Lname;
//	private String course;
//}