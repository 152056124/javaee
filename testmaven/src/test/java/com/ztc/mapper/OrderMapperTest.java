package com.ztc.mapper;

import com.ztc.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.Random;
import java.util.UUID;

public class OrderMapperTest {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(OrderMapperTest.
                class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sessionFactory.openSession();

        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        int random = new Random().nextInt(89999) + 10000;
        String uuid2 = uuid + random;

        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);

        Order order  = new Order();

//        order.setOrderId(uuid2);
//        order.setMemerId(1);
//        order.setStateus(1);
//        int i = mapper.insertOrder(order);
//        sqlSession.commit();
//        System.out.println(1);

//        List<Order> orders = mapper.selectOrder("1");
//        for (Order orderss : orders) {
//            System.out.println(orderss);
//        }

//        order.setOrderId("51fe9af220b74189818e94cc4c8b920154005");
//        order.setMemerId(10);
//        order.setStateus(3);
//        int i = mapper.updateOrder(order);
//        sqlSession.commit();

        int i = mapper.deleteOrder("9c7907c8c65147fbb466c92f21c02f3f85596");
        sqlSession.commit();
    }
}
