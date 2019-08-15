package com.ztc.mapper;

import com.ztc.entity.Course;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperTest {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory  = new SqlSessionFactoryBuilder().build(
                MapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession session = sessionFactory.openSession();
        Coursemapper mapper = session.getMapper(Coursemapper.class);
//        mapper.selectCourse("C005");
//        mapper.insertCourse("C013","英语课",1,2);

//        Map<String,Object> insertMap =  new HashMap<>();
//        insertMap.put("cno","C013");
//        insertMap.put("cname","英语课");
//        insertMap.put("credit",1);
//        insertMap.put("semester",2);
//        mapper.insertCourse(insertMap);
//        session.commit();

        Course course = new Course();
        course.setCno("C014");
        course.setCname("测试课");
        course.setCredit(5);
        course.setSemester(1);
          mapper.insertCourse(course);

//        List<Course> courseList = session.selectList("selectCourse");
//        session.insert("insertCourse");
//        session.commit();
//        session.delete("deleteCourse");
//        session.commit();
//        session.update("updateCourse");
//        session.commit();
    }
}
