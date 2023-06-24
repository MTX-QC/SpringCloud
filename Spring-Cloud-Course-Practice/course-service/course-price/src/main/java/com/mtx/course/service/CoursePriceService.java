package com.mtx.course.service;

import com.mtx.course.entity.CourseAndPrice;
import com.mtx.course.entity.CoursePrice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *描述：  课程价格服务
 * */

public interface CoursePriceService {

    CoursePrice getCoursePrice(Integer courseId);
    List<CourseAndPrice> getCoursesAndPrice();
}
