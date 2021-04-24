package com.fooddel.beans;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;
    @Column(nullable = false)
    public int totalprice;
    @OneToMany(mappedBy = "orderId")
    private List<Orderitems> orderItemList;

    public Orders(int totalprice) {
        this.totalprice = totalprice;
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
