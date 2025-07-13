package com.advanced.jpa;

import com.advanced.jpa.model.Author;
import com.advanced.jpa.model.Video;
import com.advanced.jpa.repository.AuthorRepository;
import com.advanced.jpa.repository.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
		return args -> {
			for (int i=0;i<50;i++) {
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(10,60))
						.email(faker.name().username()+"@gmail.com")
						.build();
				repository.save(author);
			}
		};
	}
}
