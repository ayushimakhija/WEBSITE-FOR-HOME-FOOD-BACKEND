package com.fooddel.repository;

import com.fooddel.beans.Customer;
import com.fooddel.beans.foodprovider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodProviderRepository extends JpaRepository<foodprovider,Integer> {
    @Query(value = "SELECT * FROM foodprovider fp WHERE fp.emailId =:emailId", nativeQuery = true)
    public foodprovider findByEmailId(@Param("emailId") String emailId);
}

