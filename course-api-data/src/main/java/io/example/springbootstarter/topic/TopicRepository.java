package io.example.springbootstarter.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.example.springbootstarter.course.Course;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
}
