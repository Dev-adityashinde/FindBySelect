package nit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class FindBySelectApplication {
	public static void main(String[] args) {
		SpringApplication.run(FindBySelectApplication.class, args);
	}

}
