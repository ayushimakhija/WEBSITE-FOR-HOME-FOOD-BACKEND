package com.fooddel.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foodprovider")
public class foodprovider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer food_Id;
    @Column(nullable = false)
    private String emailId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String location;
    @Column(nullable=false)
    private String contactNumber;
    @Column(nullable=false)
    private String companyName;
    @OneToMany(mappedBy = "dishId")
    private List<Menu> dishLists;

    //default constructor
    public foodprovider(){

    }

    public foodprovider(String emailId, String password, String location,String companyName,String contactNumber) {
        this.emailId = emailId;
        this.password = password;
        this.location = location;
        this.companyName = companyName;
        this.contactNumber= contactNumber;

    }

    //getter and setter


    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Menu> getDishLists() {
        return dishLists;
    }

    public void setDishLists(List<Menu> dishLists) {
        this.dishLists = dishLists;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

