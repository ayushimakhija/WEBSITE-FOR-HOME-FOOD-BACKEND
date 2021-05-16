package com.fooddel;
import com.fooddel.beans.Customer;
import com.fooddel.beans.Menu;
import com.fooddel.beans.foodprovider;
import com.fooddel.repository.CustomerRepository;
import com.fooddel.repository.FoodProviderRepository;
import com.fooddel.repository.MenuRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    @Autowired
    private  CustomerRepository customerRepository;
    @Autowired
    private FoodProviderRepository foodproviderRepository;
    @Autowired
    private MenuRepository menuRepository;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
    @Bean
    InitializingBean sendDatabase(){
        return ()->{
            customerRepository.save(new Customer("ayushi","makhija","7869054251","narsinghpur","ayushi9ym.19@gmail.com","ayushi",false));
            foodprovider f1   =  new foodprovider("ayushi9yb.19@gmail.com","ayushi","bangalore","7869054251","ayushiCafe");
            foodproviderRepository.save(f1);
            foodprovider f2 = new foodprovider("chirag16@gmail.com","chirag","bangalore","9875647839","chiragCafe");
            foodproviderRepository.save(f2);
            menuRepository.save(new Menu("pizza","my fav","chbhbd","230","Monday",f1));
            menuRepository.save(new Menu("pasta","my fav","chbhbck","200","sunday",f1));

        };
    }
}

