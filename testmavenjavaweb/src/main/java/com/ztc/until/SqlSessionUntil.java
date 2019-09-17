package com.ztc.until;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUntil {
    private static final SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(SqlSessionUntil.class.getClassLoader().getResourceAsStream("mybatis.xml"));
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = sessionFactory.openSession(true);
        return sqlSession;
    }
}
