package com.evandocarmo.meetingplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MeetingPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingPlannerApplication.class, args);
	}
}