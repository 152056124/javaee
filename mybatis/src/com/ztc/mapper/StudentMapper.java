package com.ztc.mapper;

import com.ztc.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudent(String id);
}
