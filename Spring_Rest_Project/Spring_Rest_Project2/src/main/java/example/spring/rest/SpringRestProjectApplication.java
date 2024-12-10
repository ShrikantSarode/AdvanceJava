package example.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"book_library","example"} )
public class SpringRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProjectApplication.class, args);
	}

}
