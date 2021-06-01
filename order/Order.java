package com.happyman.order;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 订单对象
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-06-01 14:55
 * @since 0.1.0
 **/
public class Order {
    private Long ID;
    private String orderTime;
    private BigDecimal amount;

    public Order(Long ID, String orderTime, BigDecimal amount) {
        this.ID = ID;
        this.orderTime = orderTime;
        this.amount = amount;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", orderTime=" + orderTime +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        // 需求: 按照金额排序,如果金额相同,按照时间排序
        SimpleDateFormat spl = new SimpleDateFormat("yyyy-MM-dd HH:dd:ss");
        Order order = new Order(1L, spl.format(new Date("2020-09-03 15:08:07")) , BigDecimal.valueOf(50));
        Order order2 = new Order(2L, spl.format(new Date("2020-09-03 15:06:07")), BigDecimal.valueOf(50));
        Order order3 = new Order(3L, spl.format(new Date("2020-09-03 14:06:07")), BigDecimal.valueOf(30));
        Order order4 = new Order(4L, spl.format(new Date("2020-09-04 15:06:07")), BigDecimal.valueOf(60));
        // 方式1: 先按照金额排序
    }
}
