package com.advanced.jpa;

import com.advanced.jpa.model.Author;
import com.advanced.jpa.model.Video;
import com.advanced.jpa.repository.AuthorRepository;
import com.advanced.jpa.repository.VideoRepository;
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

	//@Bean
	public CommandLineRunner commandLineRunner(
			VideoRepository repository
	){
		return args -> {
			var video = Video.builder()
					.name("abc.mp4")
					.length(5)
					.build();
			repository.save(video);
		};
	}
}
