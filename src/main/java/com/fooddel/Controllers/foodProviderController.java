package com.fooddel.Controllers;

import com.fooddel.Services.MenuService;
import com.fooddel.Services.foodProviderService;
import com.fooddel.beans.Menu;
import com.fooddel.beans.foodprovider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("api")
public class foodProviderController {
    private static final Logger logger = LogManager.getLogger(foodProviderController.class);
    private foodProviderService foodproviderService;
    @Autowired
    public foodProviderController(foodProviderService foodproviderService) {

        this.foodproviderService = foodproviderService;
    }

    @GetMapping("/getAllFoodprovider")
    public List<foodprovider> getfoodProviders() {

        logger.info("Getting all Food Provider Details");
        return foodproviderService.getfoodProviders();
    }


    @PostMapping("/createfoodprovider")
    public foodprovider createFoodProvider(@RequestBody foodprovider fp)  //mapping the JSON Body tot he object directly
    {
        logger.info("Food Provider Created");
        return foodproviderService.createFoodProvider(fp);
    }


    @PostMapping("/foodprovider/location")
    public List<List<String>> getFoodProvidersByLocation(@RequestBody foodprovider fp) {
        logger.info("Vendors as per location Searched");
        String location = fp.getLocation();
        List<foodprovider> list = foodproviderService.getFoodProvidersByLocation(location);
        List<List<String>> list1 = new ArrayList<>();
        for(foodprovider f : list){
            List<String> list2 = new ArrayList<>();
            list2.add(Integer.toString(f.getFood_Id());
            list2.add(f.getCompanyName());
            list2.add(f.getLocation());
            list2.add(f.getContactNumber());
            List<Menu> m = f.getDishLists();
            for(Menu m2 : m){
                String dish = Integer.toString(m2.getId());
                list2.add(dish);

            }
            list1.add(list2);
        }
        System.out.println(list);
        return list1;
    }

    @PutMapping("updatefoodpovider/{id}")
    public ResponseEntity<foodprovider> updateFoodProvider(@PathVariable Integer Id, @RequestBody foodprovider fp) {
        logger.info("Food Provider Updated");
        fp = foodproviderService.updateFoodProvider(Id, fp);
        return ResponseEntity.ok(fp);
    }



    @PostMapping("/foodprovider/login")
    public ResponseEntity<foodprovider> login(@RequestBody foodprovider fp){
        logger.info("Vendor Login Successfull");
        String email = fp.getEmailId();
        String pass = fp.getPassword();
        System.out.println("email"+ email+" "+pass);
        foodprovider loggedIn = foodproviderService.getFoodProviderByEmail(email);
        //System.out.println("Size" + li.size());

        if(loggedIn.getEmailId().equals(email) && loggedIn.getPassword().equals(pass)){
            System.out.println("Password Matched");
            return ResponseEntity.ok(loggedIn);
        }

        return null;
    }
}
