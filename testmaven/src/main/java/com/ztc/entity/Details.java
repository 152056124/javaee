package com.ztc.entity;

public class Details {
    private String detailsId;
    private String orderId;
    private Integer memberId;
    private Integer count;

    public Details() {
    }

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Details{" +
                "detailsId='" + detailsId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", memberId=" + memberId +
                ", count=" + count +
                '}';
    }
}
