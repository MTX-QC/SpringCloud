package com.mtx.course.dao;

import com.mtx.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 描述： 课程价格Mapper类
 * */
@Mapper
@Repository
public interface CoursePriceMapper {
    @Select("SELECT * FROM course_price WHERE course_id = #{courseId}")
    CoursePrice findCoursePrice(Integer courseId);
}
