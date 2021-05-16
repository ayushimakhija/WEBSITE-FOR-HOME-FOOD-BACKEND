package com.fooddel.repository;

import com.fooddel.beans.Orderitems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersItemRepository extends JpaRepository<Orderitems,Integer> {
}
