package io.example.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).forEach(courses :: add);
		return courses;
	}

	public Course getCourses(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourses(Course courses) {

		courseRepository.save(courses);
	}

	public void updateCourses(Course courses) {
		courseRepository.save(courses);
	}

	public void deleteCourses(String id) {
		courseRepository.deleteById(id);
	}
}
