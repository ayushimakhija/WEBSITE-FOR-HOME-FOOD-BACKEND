package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.beans.Customer;
import com.fooddel.exceptions.ResourceNotFoundException;
import com.fooddel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }



    @PostMapping("/Customer")
    public Customer createCustomer( @RequestBody Customer customer)  //mapping the JSON Body tot he object directly
    {   /*if(customer!=null){
        customer = customerService.createCustomer(customer);
        return new ResponseEntity(customer, HttpStatus.CREATED);
    }
        return null;*/
        return customerRepository.save(customer);
    }


    @GetMapping("Customer/{id}")
    public ResponseEntity<Customer> getCustomersById(@PathVariable(value = "id") Integer Id)
            throws ResourceNotFoundException {
        Customer customer =
                customerRepository
                        .findById(Id)
                        .orElseThrow(() -> new ResourceNotFoundException("customer not found on :: " + Id));
        return ResponseEntity.ok().body(customer);
    }


    @PutMapping("/Customer/{id}")
    public ResponseEntity<Customer> updateUser(
            @PathVariable(value = "id") Integer Id,  @RequestBody Customer customerDetails)
            throws ResourceNotFoundException {

        Customer customer =
                customerRepository
                        .findById(Id)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + Id));

        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        customer.setContactNumber(customerDetails.getContactNumber());
        customer.setEmailId(customerDetails.getEmailId());
        customer.setPassword(customerDetails.getPassword());
        customer.setAddress(customerDetails.getAddress());


        Customer updatedCustomer= customerRepository.save(customer);
        return ResponseEntity.ok(updatedCustomer);
    }

    /*@PostMapping("/login")
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
    }*/
}
