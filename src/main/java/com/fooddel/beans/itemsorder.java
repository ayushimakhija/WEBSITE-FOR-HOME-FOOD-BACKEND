package com.fooddel.beans;



import javax.persistence.*;

@Entity
@Table
public class itemsorder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    @Column(nullable = false)
    private String itemName;
    @Column(nullable = false)
    private Float price;
    @Column
    public String image;

    public itemsorder(){

    }

    public itemsorder(String itemName, Float price, String image) {
        this.itemName = itemName;
        this.price = price;
        this.image = image;
    }

    //getter and setter
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}

