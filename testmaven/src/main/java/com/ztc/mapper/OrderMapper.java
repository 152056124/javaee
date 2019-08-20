package com.ztc.mapper;

import com.ztc.entity.Order;

import java.util.List;

public interface OrderMapper {
    int insertOrder(Order order);

    List<Order> selectOrder(String memberId);

    int deleteOrder(String orderId);

    int updateOrder(Order order);
}
