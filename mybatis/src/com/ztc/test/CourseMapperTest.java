package com.ztc.test;

import com.ztc.entity.Course;
import com.ztc.mapper.Coursemapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CourseMapperTest {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory  = new SqlSessionFactoryBuilder().build(
                CourseMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
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
