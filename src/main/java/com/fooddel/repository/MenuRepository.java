package com.fooddel.repository;

import com.fooddel.beans.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Integer > {

    @Query(value = "SELECT * FROM Menu m WHERE m.dishName like %:dishName%", nativeQuery = true)
    public Menu findByDishName(@Param("dishName") String dishName);

    @Query(value = "SELECT * FROM Menu b WHERE b.dishId like %:dishId%", nativeQuery = true)
    public List<Menu> findByDishId(@Param("dishId") String dishId);
}
