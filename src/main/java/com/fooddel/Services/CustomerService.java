package com.fooddel.Services;
import com.fooddel.beans.Customer;
import com.fooddel.exceptions.ResourceNotFoundException;
import com.fooddel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;    //convert iterable class to List collection and return
    }

    public Customer createCustomer(Customer customer)
    {
        System.out.println(customer.toString());
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Integer id){

        Customer customer= customerRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Customer not exists with id:"+id));

        return customer;  //entity is returned along with the status
    }

    public Customer updateCustomer(Integer id, Customer customerDetails)
    {
        Customer customer= customerRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Customer not exists with id:"+id));

        customer.setFirstName(customer.getFirstName());
        customer.setLastName(customer.getLastName());
        customer.setContactNumber(customer.getContactNumber());
        customer.setEmailId(customer.getEmailId());
        customer.setPassword(customer.getPassword());
        customer.setAddress(customer.getAddress());
        customer.setSubscribe(customerDetails.isSubscribe());


        Customer updatedCustomer= customerRepository.save(customer);
        return updatedCustomer;
    }
    public Customer getCustomerByEmail(String emailId){

        Customer customer= customerRepository.findByEmail(emailId);

        return customer;
    }



}
