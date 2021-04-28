package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.beans.Customer;
import com.fooddel.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CustomerController {


    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getCustomers();
    }



    @PostMapping("/createCustomer")
    public Customer createCustomer( @RequestBody Customer customer){  //mapping the JSON Body tot he object directly
        return customerService.createCustomer(customer);
    }


    /*@GetMapping("getCustomerById/{id}")
    public ResponseEntity<Customer> getCustomersById(@PathVariable(value = "id") Integer Id)
            throws ResourceNotFoundException {
        Customer customer =
                customerRepository
                        .findById(Id)
                        .orElseThrow(() -> new ResourceNotFoundException("customer not found on :: " + Id));
        return ResponseEntity.ok().body(customer);
    }*/


    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<Customer> updateUser(
            @PathVariable(value = "id") Integer Id,  @RequestBody Customer customerDetails)
            throws ResourceNotFoundException {

        Customer updatedCustomer= customerService.updateCustomer(Id,customerDetails);
        return ResponseEntity.ok(updatedCustomer);
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
            return ResponseEntity.ok(loggedIn);
        }

        return null;
    }
}
