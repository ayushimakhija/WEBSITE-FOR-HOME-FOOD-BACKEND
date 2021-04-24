package com.fooddel.Services;

import com.fooddel.beans.Customer;
import com.fooddel.beans.foodprovider;
import com.fooddel.exceptions.ResourceNotFoundException;
import com.fooddel.repository.FoodProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class foodProviderService {
    private final FoodProviderRepository foodproviderRepository;

    @Autowired
    public foodProviderService(FoodProviderRepository foodproviderRepository) {
        this.foodproviderRepository = foodproviderRepository;
    }

    public List<foodprovider> getfoodProviders() {
        List<foodprovider> foodProviderList = new ArrayList<>();
        foodproviderRepository.findAll().forEach(foodProviderList::add);
        return foodProviderList;    //convert iterable class to List collection and return
    }

    public foodprovider createFoodProvider(foodprovider fp)
    {
        System.out.println(fp.toString());
        return foodproviderRepository.save(fp);
    }

    public foodprovider getFoodProviderById(Integer id){

        foodprovider fp= foodproviderRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("food provider does not exists with id:"+id));

        return fp;
    }

    public foodprovider updateFoodProvider(Integer id, foodprovider fp)
    {
        foodprovider foodp= foodproviderRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("food provider does not exists with id:"+id));

        fp.setEmailId(fp.getEmailId());
        fp.setLocation(fp.getLocation());
        fp.setPassword(fp.getPassword());
        fp.setDishLists(fp.getDishLists());



        foodprovider updatedFoodProvider= foodproviderRepository.save(fp);
        return updatedFoodProvider;
    }
    public foodprovider getFoodProviderByEmail(String emailId){

        foodprovider fp= foodproviderRepository.findByEmailId(emailId);

        return fp;
    }
    public List<foodprovider> getFoodProvidersByLocation(String location){

        List<foodprovider> fp= foodproviderRepository.findByLocation(location);

        return fp;
    }


}
