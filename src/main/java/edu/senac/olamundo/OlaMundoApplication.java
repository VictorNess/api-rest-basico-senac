package edu.senac.olamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class OlaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
	}

}
