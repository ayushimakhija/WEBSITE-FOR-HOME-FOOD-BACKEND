package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.Services.MenuService;
import com.fooddel.beans.Customer;
import com.fooddel.beans.Menu;
import com.fooddel.repository.CustomerRepository;
import com.fooddel.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

     @Autowired
    private MenuService menuService;


    @PostMapping("/Menu")
    public Menu createMenu(@RequestBody Menu menu)
    {
        return menuService.createMenu(menu);
    }


    @GetMapping("/menu/{dishName}")
    public ResponseEntity<Menu> getMenuByDishName(@PathVariable String dishName) {
        Menu menu = menuService.getMenuByDishName(dishName);
        if(menu!=null) {
            return ResponseEntity.ok(menu);
        }
        return null;
    }

    @PutMapping("menu/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Integer id, @RequestBody Menu menu) {
        return menuService.updateMenu(id, menu);
    }
}