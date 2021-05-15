package com.fooddel;
import com.fooddel.beans.Customer;
import com.fooddel.beans.Menu;
import com.fooddel.beans.foodprovider;
import com.fooddel.repository.CustomerRepository;
import com.fooddel.repository.FoodProviderRepository;
import com.fooddel.repository.MenuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Autowired
    private  CustomerRepository customerRepository;
    @Autowired
    private FoodProviderRepository foodproviderRepository;
    @Autowired
    private MenuRepository menuRepository;
    public static void main(String[] args) {
        logger.info("just a test info log");
        SpringApplication.run(Main.class, args);

    }
    @Bean
    InitializingBean sendDatabase(){
        return ()->{
            customerRepository.save(new Customer("ayushi","makhija","7869054251","narsinghpur","ayushi9ym.19@gmail.com","ayushi",false));
            foodproviderRepository.save(new foodprovider("ayushi9yb.19@gmail.com","ayushi","bangalore","7869054251","ayushiCafe"));
            foodproviderRepository.save(new foodprovider("chirag16@gmail.com","chirag","jabalpur","9875647839","chiragCafe"));
            menuRepository.save(new Menu("pizza","my fav","chbhbd","230","Monday"));
            menuRepository.save(new Menu("pasta","my fav","chbhbck","200","sunday"));

        };
    }
}

