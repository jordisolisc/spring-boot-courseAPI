package org.njesoft.course.service;

import org.njesoft.course.model.Course;
import org.njesoft.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(Integer topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId);
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Course getCourseById(Integer id) {
        return courseRepository.findById(id).get();
        }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }
}
