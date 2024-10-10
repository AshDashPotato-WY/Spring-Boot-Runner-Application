package com.spring.example.runner;

import com.spring.example.runner.run.Location;
import com.spring.example.runner.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class RunnerApplication {

	private static final Logger log = LoggerFactory.getLogger(Appendable.class);

	public static void main(String[] args) {

		SpringApplication.run(RunnerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
