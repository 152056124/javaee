package dao;

import pojo.Course;

import java.util.List;

public interface DruidCourseDao {
    int insertCourse(Course course);

    int deleteCourse(String c);

    int updateCourseByCno(Course course);

    List<Course> selectCourseByCno(String c);
}
