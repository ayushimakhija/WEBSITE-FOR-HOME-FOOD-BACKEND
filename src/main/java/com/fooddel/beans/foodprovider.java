package com.fooddel.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foodprovider")
public class foodprovider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String foodProviderId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String emailId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String location;
    @OneToMany(mappedBy = "dishId")
    private List<Menu> dishLists;

    //default constructor
    public foodprovider(){

    }

    public foodprovider(String firstName, String lastName, String emailId, String password,String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
        this.location = location;
    }

    //getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

