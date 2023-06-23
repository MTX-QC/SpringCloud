package com.mtx.course.client;

import com.mtx.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 描述：  课程列表的Feign客户端
 * */
@FeignClient("course-list")
public interface CourseListClient {

    @GetMapping("/course")
    List<Course> courseList();

}
