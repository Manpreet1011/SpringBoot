package com.manpreet.springDemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class SpringDemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringDemoApplication.class, args);
		//Car car=new Car("Honda","Civic",()->"Petrol Engine");
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:beans.xml");
		Car car=context.getBean(Car.class);
		System.out.println(car);
		System.out.println(context.getBean(User.class));
		((FileSystemXmlApplicationContext) context).registerShutdownHook();

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