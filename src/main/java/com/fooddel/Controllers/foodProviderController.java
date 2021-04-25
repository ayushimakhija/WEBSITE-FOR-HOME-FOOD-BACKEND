package com.fooddel.Controllers;

import com.fooddel.Services.CustomerService;
import com.fooddel.Services.foodProviderService;
import com.fooddel.beans.Customer;
import com.fooddel.beans.Menu;
import com.fooddel.beans.foodprovider;
import com.fooddel.exceptions.ResourceNotFoundException;
import com.fooddel.repository.CustomerRepository;
import com.fooddel.repository.FoodProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api")
public class foodProviderController {
    @Autowired
    private FoodProviderRepository foodproviderRepository;

    private foodProviderService foodproviderService;

    @GetMapping("/foodprovider")
    public List<foodprovider> getfoodProviders() {
        return foodproviderRepository.findAll();
    }


    @PostMapping("/foodprovider")
    public foodprovider createFoodProvider(@RequestBody foodprovider fp)  //mapping the JSON Body tot he object directly
    {
        return foodproviderRepository.save(fp);
    }


   /* @GetMapping("/foodprovider/{id}")
    public ResponseEntity<foodprovider> getFoodProviderById(@PathVariable(value="id") Integer Id) throws ResourceNotFoundException {
            foodprovider fp =
                    foodproviderRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("customer not found on :: " + Id));
            return ResponseEntity.ok().body(fp);
    }*/

    @GetMapping("/foodprovider/{location}")
    public ResponseEntity<List<foodprovider>> getFoodProvidersByLocation(@PathVariable(value="location") String location) {
        List<foodprovider> list = foodproviderService.getFoodProvidersByLocation(location);
        return ResponseEntity.ok(list);
    }

    @PutMapping("foodpovider/{id}")
    public ResponseEntity<foodprovider> updateFoodProvider(@PathVariable Integer Id, @RequestBody foodprovider fp) {
        fp = foodproviderService.updateFoodProvider(Id, fp);
        return ResponseEntity.ok(fp);
    }



    /*@PostMapping("/login")
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
    }*/
}
