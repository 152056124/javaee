package com.ztc.mapper;

import com.ztc.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudent();
    int deleteStudentById(String sid);
    int insertStudent(Student student);
    int updateStudentById(Student student);
}
