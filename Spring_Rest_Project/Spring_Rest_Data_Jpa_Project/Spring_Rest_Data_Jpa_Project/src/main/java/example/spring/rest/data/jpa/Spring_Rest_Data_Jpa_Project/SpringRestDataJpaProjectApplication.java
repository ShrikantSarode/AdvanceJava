package example.spring.rest.data.jpa.Spring_Rest_Data_Jpa_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.sym.Name;

@SpringBootApplication(scanBasePackages = "book_library")
@EnableJpaRepositories(basePackages = "book_library")
@EntityScan(basePackages = "book_library")
public class SpringRestDataJpaProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataJpaProjectApplication.class, args);
	}

}
