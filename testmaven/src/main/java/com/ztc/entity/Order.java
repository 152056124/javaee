package com.ztc.entity;

import java.util.Date;

public class Order {
    private String orderId;
    private Integer memberId;
    private Integer stateus;
    private Date creatTime;
    private Date updateTime;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getMemerId() {
        return memberId;
    }

    public void setMemerId(Integer memerId) {
        this.memberId = memerId;
    }

    public Integer getStateus() {
        return stateus;
    }

    public void setStateus(Integer stateus) {
        this.stateus = stateus;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", memerId=" + memberId +
                ", stateus=" + stateus +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
