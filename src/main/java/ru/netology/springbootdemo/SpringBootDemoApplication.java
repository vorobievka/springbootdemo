package ru.netology.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.springbootdemo.controller.ProfileController;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringBootDemoApplication.class, args);
		ProfileController profileController = (ProfileController) context.getBean("profileController");
		System.out.println(profileController.getProfile());

	}

}
