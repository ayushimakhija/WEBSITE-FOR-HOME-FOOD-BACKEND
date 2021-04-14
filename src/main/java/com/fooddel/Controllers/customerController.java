package com.fooddel.Controllers;

import com.fooddel.beans.customer;
import com.fooddel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class customerController {
    @Autowired
    private CustomerRepository customerrepository;

    @GetMapping("/customer")
    public List<customer> getAllCustomer(){
        return customerrepository.findAll();
    }
}
