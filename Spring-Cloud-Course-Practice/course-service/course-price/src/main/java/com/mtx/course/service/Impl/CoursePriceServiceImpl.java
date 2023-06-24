package com.mtx.course.service.Impl;

import com.mtx.course.client.CourseListClient;
import com.mtx.course.dao.CoursePriceMapper;
import com.mtx.course.entity.Course;
import com.mtx.course.entity.CourseAndPrice;
import com.mtx.course.entity.CoursePrice;
import com.mtx.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述 ：课程价格的服务实现类
 */
@Service
public class CoursePriceServiceImpl implements CoursePriceService {
    @Autowired
    CoursePriceMapper coursePriceMapper;

    @Autowired
    CourseListClient courseListClient;
    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }

    @Override
    public List<CourseAndPrice> getCoursesAndPrice() {
        ArrayList<CourseAndPrice> courseAndPriceList = new ArrayList<>();
        List<Course> courses = courseListClient.courseList();
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course != null){
                CoursePrice coursePrice = getCoursePrice(course.getCourseId());
                CourseAndPrice courseAndPrice = new CourseAndPrice();
                courseAndPrice.setPrice(coursePrice.getPrice());
                courseAndPrice.setName(course.getCourseName());
                courseAndPrice.setId(course.getId());
                courseAndPrice.setCourseId(course.getCourseId());
                courseAndPriceList.add(courseAndPrice);
            }
        }
        return courseAndPriceList;
    }
}
