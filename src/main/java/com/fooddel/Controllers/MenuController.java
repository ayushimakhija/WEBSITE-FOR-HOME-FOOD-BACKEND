package com.fooddel.Controllers;
import com.fooddel.Services.MenuService;
import com.fooddel.beans.Menu;
import com.fooddel.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;


     private MenuService menuService;


    @PostMapping("/menu")
    public Menu createMenu(@RequestBody Menu menu)
    {
        return menuService.createMenu(menu);
    }


    @GetMapping("/menu/{dishName}")
    public ResponseEntity<List<Menu>> getMenuByDishName(@PathVariable String dishName) {
       // List<Menu> menu = menuService.getMenuByDishName(dishName);
        //if(menu!=null) {
           // return ResponseEntity.ok(menu);
       // }
        return null;
    }

    @PutMapping("menu/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Integer id, @RequestBody Menu menu) {
         menu= menuService.updateMenu(id, menu);
        return ResponseEntity.ok(menu);
    }
}
