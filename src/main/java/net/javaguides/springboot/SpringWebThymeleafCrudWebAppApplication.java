package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

//@Configuration - Marks class as source of bean definition
//@EnableAutoConfiguration - Add dependency automatically
//@ComponentScan	- Scans for Configurations for as same package or below
//@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan

@SpringBootApplication
public class SpringWebThymeleafCrudWebAppApplication {
	
	public static void main(String[] args){
		SpringApplication.run(SpringWebThymeleafCrudWebAppApplication.class, args);
	}

}








	


