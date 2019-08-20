package com.ztc.mapper;

import com.ztc.entity.Details;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DetailsMapperTest {
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
            DetailsMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
    SqlSession sqlSession = sessionFactory.openSession();
    DetailsMapper mapper = sqlSession.getMapper(DetailsMapper.class);

    @Test
    public void test01(){
        Details details = new Details();
        List<Details> details1 = mapper.selectDetails("11");
        for (Details details2 : details1) {
            System.out.println(details2);
        }
    }

}
