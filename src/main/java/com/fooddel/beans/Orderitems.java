package com.fooddel.beans;

import javax.persistence.*;

@Entity
@Table(name="Orderitems")
public class Orderitems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer orderItemId;
    @Column(nullable = false)
    public String orderIteamName;
    @Column(nullable = false)
    public float orderItemPrice;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders orderId;

    public Orderitems(String orderIteamName, float orderItemPrice, Orders orderId) {
        this.orderIteamName = orderIteamName;
        this.orderItemPrice = orderItemPrice;

    }

    public Orderitems() {
    }

    public String getOrderIteamName() {
        return orderIteamName;
    }

    public void setOrderIteamName(String orderIteamName) {
        this.orderIteamName = orderIteamName;
    }

    public float getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(float orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }
}
