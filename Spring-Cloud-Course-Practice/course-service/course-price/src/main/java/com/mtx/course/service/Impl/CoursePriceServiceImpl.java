package com.mtx.course.service.Impl;

import com.mtx.course.dao.CoursePriceMapper;
import com.mtx.course.entity.CoursePrice;
import com.mtx.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述 ：课程价格的服务实现类
 */
@Service
public class CoursePriceServiceImpl implements CoursePriceService {
    @Autowired
    CoursePriceMapper coursePriceMapper;
    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }
}
