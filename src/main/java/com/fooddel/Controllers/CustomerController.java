package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.beans.Customer;
import com.fooddel.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("api")
public class CustomerController {

    private static final Logger logger = LogManager.getLogger(CustomerController.class);
    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        logger.info("getting all customers details");
        return customerService.getCustomers();
    }



    @PostMapping("/createCustomer")
    public Customer createCustomer( @RequestBody Customer customer){  //mapping the JSON Body tot he object directly
        logger.info("customer created");
        return customerService.createCustomer(customer);
    }


   /* @GetMapping("getCustomerById/{id}")
    public ResponseEntity<Customer> getCustomersById(@PathVariable(value = "id") Integer Id)
            throws ResourceNotFoundException {
        Customer customer =
                customerService
                        .findById(Id)
                        .orElseThrow(() -> new ResourceNotFoundException("customer not found on :: " + Id));
        return ResponseEntity.ok().body(customer);
    }*/


    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<Customer> updateUser(
            @PathVariable(value = "id") Integer Id,  @RequestBody Customer customerDetails)
            throws ResourceNotFoundException {
        logger.info("updating customer details");
        Customer updatedCustomer= customerService.updateCustomer(Id,customerDetails);
        return ResponseEntity.ok(updatedCustomer);
    }

    @PostMapping("/customer/login")
    public ResponseEntity<Customer> login(@RequestBody Customer customer){
        logger.info("login successfull");
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
