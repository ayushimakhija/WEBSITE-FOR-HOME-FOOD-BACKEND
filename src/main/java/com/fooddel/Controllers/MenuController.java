package com.fooddel.Controllers;
import com.fooddel.Services.MenuService;
import com.fooddel.Services.foodProviderService;
import com.fooddel.beans.Menu;
import com.fooddel.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api")
public class MenuController {

    private static final Logger logger = LogManager.getLogger(MenuController .class);
    private MenuService menuService;
    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }


    @PostMapping("/createMenu")
    public Menu createMenu(@RequestBody Menu menu)
    {
        return menuService.createMenu(menu);
    }


    @GetMapping("/menu/{dishName}")
    public List<Menu> getMenuByDishName(@PathVariable String dishName) {
        List<Menu> menu = menuService.getMenuByDishName(dishName);
        return menu;
    }

    @PutMapping("updateMenu/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Integer id, @RequestBody Menu menu) {
         menu= menuService.updateMenu(id, menu);
        return ResponseEntity.ok(menu);
    }
}
