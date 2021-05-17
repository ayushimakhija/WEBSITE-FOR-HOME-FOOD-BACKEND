package com.fooddel;
import com.fooddel.Controllers.CustomerController;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    @Autowired
    private  CustomerRepository customerRepository;
    @Autowired
    private FoodProviderRepository foodproviderRepository;
    @Autowired
    private MenuRepository menuRepository;
    public static void main(String[] args) {
        logger.info("Backend Logs Generation started");
        SpringApplication.run(Main.class, args);

    }
    @Bean
    InitializingBean sendDatabase(){
        return ()->{
//            customerRepository.save(new Customer("ayushi","makhija","7869054251","narsinghpur","ayushi9ym.19@gmail.com","ayushi",false));
//            foodprovider f1   =  new foodprovider("ayushi9yb.19@gmail.com","ayushi","bangalore","7869054251","ayushiCafe");
//            foodproviderRepository.save(f1);
//            foodprovider f2 = new foodprovider("chirag16@gmail.com","chirag","bangalore","9875647839","chiragCafe");
//            foodproviderRepository.save(f2);
//            menuRepository.save(new Menu("pizza","my fav","chbhbd","230","Monday",f1));
//            menuRepository.save(new Menu("pasta","my fav","chbhbck","200","sunday",f1));
            customerRepository.save(new Customer("ayushi","makhija","7869054251","narsinghpur","ayushi9ym.19@gmail.com","ayushi",false));
            customerRepository.save(new Customer("pavan","singh","8686886135","shamshabad","pavan@gmail.com","pavan",false));
            customerRepository.save(new Customer("shabbir","sidhpurwala","1234567890","bangalore","shabbir@gmail.com","shabbir",true));
            customerRepository.save(new Customer("mehak","dogra","2345678901","bangalore","mehak@gmail.com","mehak",false));
            customerRepository.save(new Customer("divyansha","agarwal","3456789012","indore","divyansha@gmail.com","divyansha",false));



            foodprovider f1 =  new foodprovider("ayushi9yb.19@gmail.com","ayushi","bangalore","ayushi Cafe","7869054251");
            foodproviderRepository.save(f1);

            foodprovider f2 = new foodprovider("pavan@gmail.com","pavan","bangalore","Pavan Tifffins","8686886135");
            foodproviderRepository.save(f2);

            foodprovider f3 =  new foodprovider("shabbir@gmail.com","shabbir","bangalore","SS Chicken Biryani","7823456789");

            foodproviderRepository.save(f3);

            foodprovider f4 =  new foodprovider("mehak@gmail.com","mehak","hyderabad","Mehak Sweets","9269054251");
            foodproviderRepository.save(f4);

            foodprovider f5 =  new foodprovider("chirag16@gmail.com","chirag","jabalpur","chirag Cafe","9875647839");
            foodproviderRepository.save(f5);
            menuRepository.save(new Menu("pizza","Delicious fresh pan Pizza","chbhbd","230","sunday",f1));
            menuRepository.save(new Menu("pasta","Italian pasta","chbhbck","200","monday",f1));
            menuRepository.save(new Menu("Veg Dum Biryani","Hyderabadi dum biryani","chbhbd","300","tuesday",f1));
            menuRepository.save(new Menu("Butter paneer","Delicious  butter paneer","chbhbck","250","wednesday",f1));
            menuRepository.save(new Menu("Aloo Gobi","Delicious aloo gobi","chbhbd","200","thursday",f2));
            menuRepository.save(new Menu("Matar Paneer","Delicious matar paneer","chbhbck","250","friday",f3));
            menuRepository.save(new Menu("Chole Bature","Delicious chole bature","chbhbck","230","saturday",f4));
        };
    }
}

