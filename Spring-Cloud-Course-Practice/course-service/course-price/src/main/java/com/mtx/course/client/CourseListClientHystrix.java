package com.mtx.course.client;

import com.mtx.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：   断路器实现类
 * */
@Component
public class CourseListClientHystrix implements CourseListClient{
    @Override
    public List<Course> courseList() {
        ArrayList<Course> defaultCourse = new ArrayList<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseId(1);
        course.setCourseName("默认课程");
        course.setValid(1);
        defaultCourse.add(course);
        return defaultCourse;
    }

}
