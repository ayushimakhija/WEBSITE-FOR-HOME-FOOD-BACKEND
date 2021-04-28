package com.fooddel.repository;

import com.fooddel.beans.Customer;
import com.fooddel.beans.foodprovider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodProviderRepository extends JpaRepository<foodprovider,Integer> {
    @Query(value = "SELECT * FROM foodprovider fp WHERE fp.email_id =:emailId", nativeQuery = true)
    public foodprovider findByEmailId(@Param("emailId") String emailId);

    @Query(value = "SELECT * FROM foodprovider fp WHERE fp.location = :location" , nativeQuery = true)
    public List<foodprovider> findByLocation(@Param("location") String location);
}

