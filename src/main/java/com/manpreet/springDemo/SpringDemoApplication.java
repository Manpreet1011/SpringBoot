package com.manpreet.springDemo;

import com.manpreet.springDemo.config.ApppConfig;
import com.manpreet.springDemo.config.UserConfig;
import com.manpreet.springDemo.domain.Car;
import com.manpreet.springDemo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@RestController
@Slf4j
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(ApppConfig.class);
		Car car1=context.getBean("car",Car.class);
	log.info("Car -{}", car1);
	ApplicationContext context1=new AnnotationConfigApplicationContext(UserConfig.class);
		User user=context1.getBean("user",User.class);
		log.info("user-{}",user);
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