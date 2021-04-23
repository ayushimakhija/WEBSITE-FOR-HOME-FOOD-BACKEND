package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.beans.Customer;
import com.fooddel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService customerService;



    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }



    @GetMapping("/Customer")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }


    @PostMapping("/Customer")
    public Customer createCustomer(@RequestBody Customer customer)  //mapping the JSON Body tot he object directly
    {
        return customerService.createCustomer(customer);
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
        Customer customer = customerService.getCustomerById(id);
        if(customer!=null) {
            return ResponseEntity.ok(customer);
        }
        return null;
    }

    @PutMapping("user/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @PostMapping("/login")
    public ResponseEntity<Customer> login(@RequestBody Customer customer){
        String email = customer.getEmailId();
        String pass = customer.getPassword();
        System.out.println("email"+ email+" "+pass);
        Customer loggedIn = customerService.getCustomerByEmail(email);
        //System.out.println("Size" + li.size());

        if(loggedIn.getEmailId().equals(email) && loggedIn.getPassword().equals(pass)){
            System.out.println("Password Matched");
//               System.out.println("flag after:"+ check.isLog_status());
            return ResponseEntity.ok(loggedIn);
        }

        return null;
    }
}