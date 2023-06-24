package com.mtx.course.client;

import com.mtx.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 描述：  课程列表的Feign客户端
 * */
@FeignClient(value = "course-list",fallback = CourseListClientHystrix.class)
@Primary
public interface CourseListClient {

    @GetMapping("/course")
    List<Course> courseList();

}
