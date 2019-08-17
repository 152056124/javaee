package com.ztc.test;

import com.ztc.entity.Student;
import com.ztc.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class StudentMapperTest {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
                StudentMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession session = sessionFactory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectStudent("01");
        System.out.println(students);
    }
}
