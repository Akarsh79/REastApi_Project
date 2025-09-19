package com.springrest.springrest;

import com.springrest.springrest.entities.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
	// Get the Courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
        return null;
	}

}
