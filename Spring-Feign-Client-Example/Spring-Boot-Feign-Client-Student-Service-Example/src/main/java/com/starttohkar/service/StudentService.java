package com.starttohkar.service;

import com.starttohkar.client.CourseClient;
import com.starttohkar.dto.Course;
import com.starttohkar.dto.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

//    @Autowired
//    private CourseRestClientService courseClient;

    @Autowired
    private CourseClient courseClient;

    public Course searchCourse(int courseId) {
        return courseClient.course(courseId);
    }

    public List<Course> getAllCourses() {
        return courseClient.courses();
    }

    public String submitRating(int courseId, Rating rating) {
        return courseClient.submitRating(courseId, rating);
    }
}