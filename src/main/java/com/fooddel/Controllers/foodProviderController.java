package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.Services.foodProviderService;
import com.fooddel.beans.Customer;
import com.fooddel.beans.foodprovider;
import com.fooddel.repository.CustomerRepository;
import com.fooddel.repository.FoodProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class foodProviderController {
    @Autowired
    private FoodProviderRepository foodproviderRepository;

    private foodProviderService foodproviderService;



    @GetMapping("/foodprovider")
    public List<foodprovider> getAllFoodProvider(){
        return foodproviderRepository.findAll();
    }



    @GetMapping("/foodprovider")
    public List<foodprovider> getfoodProviders() {
        return foodproviderService.getfoodProviders();
    }


    @PostMapping("/foodprovider")
    public foodprovider createFoodProvider(@RequestBody foodprovider fp)  //mapping the JSON Body tot he object directly
    {
        return foodproviderService.createFoodProvider(fp);
    }


    @GetMapping("/foodprovider/{id}")
    public ResponseEntity<foodprovider> getFoodProviderById(@PathVariable Integer id) {
        foodprovider fp = foodproviderService.getFoodProviderById(id);
        if(fp!=null) {
            return ResponseEntity.ok(fp);
        }
        return null;
    }

    @PutMapping("user/{id}")
    public ResponseEntity<foodprovider> updateFoodProvider(@PathVariable Integer id, @RequestBody foodprovider fp) {
        return foodproviderService.updateFoodProvider(id, fp);
    }

    @PostMapping("/login")
    public ResponseEntity<foodprovider> login(@RequestBody foodprovider fp){
        String email = fp.getEmailId();
        String pass = fp.getPassword();
        System.out.println("email"+ email+" "+pass);
        foodprovider loggedIn = foodproviderService.getFoodProviderByEmail(email);
        //System.out.println("Size" + li.size());

        if(loggedIn.getEmailId().equals(email) && loggedIn.getPassword().equals(pass)){
            System.out.println("Password Matched");
//               System.out.println("flag after:"+ check.isLog_status());
            return ResponseEntity.ok(loggedIn);
        }

        return null;
    }
}
