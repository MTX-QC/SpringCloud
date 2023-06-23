package com.mtx.course.controller;

import com.mtx.course.entity.Course;
import com.mtx.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseListController {
    @Autowired
    CourseListService courseListService;

    @GetMapping("/course")
    public List<Course> courseList() {
        return courseListService.getCourseList();
    }
}
