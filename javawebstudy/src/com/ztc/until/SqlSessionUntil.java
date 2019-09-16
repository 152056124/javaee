package com.ztc.until;

import com.ztc.entry.Course;
import com.ztc.servlet.SelectStudentServlet;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUntil {
    public static SqlSession getSqlSession() {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Course.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sessionFactory.openSession(true);
        return sqlSession;
    }
}
