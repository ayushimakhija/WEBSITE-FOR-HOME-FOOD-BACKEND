package com.fooddel.beans;
import javax.persistence.*;
import java.util.List;

@Table(name="orders")
public class Orders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String Id;
    @Column(nullable = false)
    public int totalprice;
    @OneToMany(mappedBy = "orderId")
    private List<Orderitems> orderItemList;

    public Orders(int totalprice, List<Orderitems> orderItemList) {
        this.totalprice = totalprice;
        this.orderItemList = orderItemList;
    }

    public Orders() {
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public List<Orderitems> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<Orderitems> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
