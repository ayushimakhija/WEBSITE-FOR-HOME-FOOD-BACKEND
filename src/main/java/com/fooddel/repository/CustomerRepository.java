package com.fooddel.repository;

import com.fooddel.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "SELECT * FROM Customer u WHERE u.emailId =:emailId", nativeQuery = true)
    public Customer findByEmail(@Param("emailId") String emailId);

}
