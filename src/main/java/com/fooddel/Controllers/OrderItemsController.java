package com.fooddel.Controllers;

import com.fooddel.Services.MenuService;
import com.fooddel.Services.OrdersItemsService;
import com.fooddel.beans.Menu;
import com.fooddel.beans.Orderitems;
import com.fooddel.repository.MenuRepository;
import com.fooddel.repository.OrdersItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class OrderItemsController {
    @Autowired
    private OrdersItemRepository orderitemsRepository;

    private OrdersItemsService orderItemsService;


    @PutMapping("Orderitems/{id}")
    public ResponseEntity<Orderitems> updateOrderItems(@PathVariable Integer id, @RequestBody Orderitems op) {
        return orderItemsService.updateOrderItems(id, op);
    }
}
