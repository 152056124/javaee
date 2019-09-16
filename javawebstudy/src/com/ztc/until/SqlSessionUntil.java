package com.ztc.until;

import com.ztc.servlet.SelectStudentServlet;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUntil {
    public static SqlSession getSqlSession() {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(SelectStudentServlet.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sessionFactory.openSession(true);
        return sqlSession;
    }
}
