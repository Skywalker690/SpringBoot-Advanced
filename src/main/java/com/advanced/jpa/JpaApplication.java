package com.advanced.jpa;

import com.advanced.jpa.model.Author;
import com.advanced.jpa.model.Video;
import com.advanced.jpa.repository.AuthorRepository;
import com.advanced.jpa.repository.VideoRepository;
import com.advanced.jpa.specification.AuthorSpecification;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

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
				//repository.save(author);
			}
			//Update author with ID 1
			var me = Author.builder()
					.id(1)
					.firstName("Sanjo")
					.lastName("Siby")
					.age(19)
					.email("sanjoksiby0@gmail.com")
					.build();
			//repository.save(me);

			//repository.UpdateAuthor(20,1);
			//repository.UpdateAllAuthors("main");

			//repository.findByNamedQuery(30)
			//		.forEach(System.out::println);

			Specification<Author> spec =Specification
					.where(AuthorSpecification.hasAge(34))
					.and(AuthorSpecification.firstNameLike("Sa"));
			repository.findAll(spec).forEach(System.out::println);

		};
	}
}
