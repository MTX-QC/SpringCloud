package com.mtx.course.entity;

import java.io.Serializable;

/**
 * 描述：课程与价格的融合类
 */
public class CourseAndPrice implements Serializable {
    Integer id;
    Integer courseId;
    String name;
    Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CourseAndPrice{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
