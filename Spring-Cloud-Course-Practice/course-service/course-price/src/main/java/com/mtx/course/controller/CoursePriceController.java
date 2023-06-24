package com.mtx.course.controller;

import com.mtx.course.client.CourseListClient;
import com.mtx.course.entity.Course;
import com.mtx.course.entity.CourseAndPrice;
import com.mtx.course.entity.CoursePrice;
import com.mtx.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：  课程价格控制器
 */
@RestController
public class CoursePriceController {

    @Autowired
    CoursePriceService coursePriceService;

    @Autowired
    CourseListClient courseListClient;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId){
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }

    @GetMapping("/coursesInPrice")
    public List<Course> getCourseListInPrice(){
        List<Course> courses = courseListClient.courseList();
        return courses;
    }

    @GetMapping("/coursesAndPrice")
    public List<CourseAndPrice> getCoursesAndPrice() {
        List<CourseAndPrice> coursesAndPrice = coursePriceService.getCoursesAndPrice();
        return coursesAndPrice;
    }

}
