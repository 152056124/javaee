package com.ztc.test;

import com.ztc.entity.Details;
import com.ztc.mapper.DetailsMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.ArrayList;
import java.util.List;

public class DetailsMapperTest {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
                DetailsMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        DetailsMapper mapper = sqlSession.getMapper(DetailsMapper.class);

        Details details = new Details();

//        details.setDetailsId("12");
//        details.setOrderId("51fe9af220b74189818e94cc4c8b920154005");
//        details.setMemberId(1);
//        details.setCount(10);
//        mapper.insertDetails(details);
//        sqlSession.commit();

//        for (Details selectDetail : mapper.selectDetails("12")) {
//            System.out.println(selectDetail);
//        }

//        details.setCount(50);
//        details.setDetailsId("12");
//        int i = mapper.updateDetails(details);
//        sqlSession.commit();

//        int i = mapper.deleteDetails("12");

//        details.setOrderId("51fe9af220b74189818e94cc4c8b920154005");
//        details.setDetailsId("11");
//        List<Details> detailsList = mapper.selectAll(details);
//        for (Details details1 : detailsList) {
//            System.out.println(details1);
//        }

//        details.setCount(100);
//        details.setMemberId(3);
//        mapper.updateAll(details);
//        sqlSession.commit();

        List<String> id = new ArrayList<>();
        id.add("11");
        id.add("15");
        id.add("7");
        List<Details> selectIn = mapper.selectIn(id);
        for (Details details1 : selectIn) {
            System.out.println(details1);
        }
    }
}
