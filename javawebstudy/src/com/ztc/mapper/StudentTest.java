package com.ztc.mapper;


import com.ztc.entry.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(StudentTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = studentMapper.selectStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        int i = studentMapper.deleteStudentById("09");

    }
}
