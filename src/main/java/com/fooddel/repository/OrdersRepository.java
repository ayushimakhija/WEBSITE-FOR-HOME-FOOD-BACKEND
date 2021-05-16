package com.fooddel.repository;

import com.fooddel.beans.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
