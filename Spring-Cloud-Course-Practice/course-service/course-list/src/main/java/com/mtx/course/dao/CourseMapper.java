package com.mtx.course.dao;

import com.mtx.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：  课程的Mapper类
 * */

@Mapper
@Repository
public interface CourseMapper {
    @Select("SELECT * FROM course WHERE valid = 1")
    List<Course> findValidCourses();
}
