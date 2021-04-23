package com.fooddel.Services;
import com.fooddel.beans.Customer;
import com.fooddel.beans.Menu;
import com.fooddel.exceptions.ResourceNotFoundException;
import com.fooddel.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }


    public Menu createMenu( Menu menu)
    {
        System.out.println(menu.toString());
        return menuRepository.save(menu);
    }

    public ResponseEntity<Menu> updateMenu(Integer id, Menu menuDetails )
    {
        Menu menu = menuRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("dish not exists with id:"+id));

        menu.setDishName(menuDetails.getDishName());
        menu.setDishImage(menu.getDishImage());
        menu.setDishPrice(menu.getDishPrice());
        menu.setDishDescription(menu.getDishDescription());



        Menu updatedmenu = menuRepository.save(menu);
        return ResponseEntity.ok(updatedmenu);
    }
    public Menu getMenuByDishName(String dishName){

        Menu menu= menuRepository.findByDishName(dishName);

        return menu;  //entity is returned along with the status
    }



}
