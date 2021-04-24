package com.fooddel.beans;
import javax.persistence.*;
@Entity
@Table(name="Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;

    @Column(nullable = false)
    public String dishName;
    @Column
    public String dishDescription;
    @Column(nullable = false)
    public String dishImage;
    @Column(nullable = false)
    public String dishPrice;
    @Column(nullable=false)
    public String day;

    @ManyToOne
    @JoinColumn(name = "dishId")
    private foodprovider dishId;

    public Menu() {
    }

    public Menu(String dishName, String dishDescription, String dishImage, String dishPrice,String day) {
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishImage = dishImage;
        this.dishPrice = dishPrice;
        this.day = day;
    }

    public foodprovider getDishId() {
        return dishId;
    }

    public void setDishId(foodprovider dishId) {
        this.dishId = dishId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public String getDishImage() {
        return dishImage;
    }

    public void setDishImage(String dishImage) {
        this.dishImage = dishImage;
    }

    public String getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(String dishPrice) {
        this.dishPrice = dishPrice;
    }
}
