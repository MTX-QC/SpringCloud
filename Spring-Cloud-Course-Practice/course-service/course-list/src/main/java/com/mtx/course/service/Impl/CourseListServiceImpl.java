package com.mtx.course.service.Impl;

import com.mtx.course.dao.CourseMapper;
import com.mtx.course.entity.Course;
import com.mtx.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：  课程服务实现类
 */
@Service
public class CourseListServiceImpl implements CourseListService {
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        return courseMapper.findValidCourses();
    }
}
