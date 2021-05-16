package com.fooddel;
import com.fooddel.beans.*;
import com.fooddel.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
  //  private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Autowired
    private  CustomerRepository customerRepository;
    @Autowired
    private FoodProviderRepository foodproviderRepository;
    @Autowired
    private MenuRepository menuRepository;
    public static void main(String[] args) {
       // logger.info("just a test info log");
       // logger.info("just a codeinfo log");
        SpringApplication.run(Main.class, args);

    }
    @Bean
    InitializingBean sendDatabase(){
        return ()->{
            customerRepository.save(new Customer("ayushi","makhija","7869054251","narsinghpur","ayushi9ym.19@gmail.com","ayushi",false));
            customerRepository.save(new Customer("pavan","singh","8686886135","shamshabad","pavan@gmail.com","pavan",false));
            customerRepository.save(new Customer("shabbir","sidhpurwala","1234567890","bangalore","shabbir@gmail.com","shabbir",true));
            customerRepository.save(new Customer("mehak","dogra","2345678901","bangalore","mehak@gmail.com","mehak",false));
            customerRepository.save(new Customer("divyansha","agarwal","3456789012","indore","divyansha@gmail.com","divyansha",false));



            foodproviderRepository.save(new foodprovider("ayushi9yb.19@gmail.com","ayushi","bangalore","ayushi Cafe","7869054251"));
            foodproviderRepository.save(new foodprovider("pavan@gmail.com","pavan","bangalore","Pavan Tifffins","8686886135"));
            foodproviderRepository.save(new foodprovider("shabbir@gmail.com","shabbir","bangalore","SS Chicken Biryani","7823456789"));
            foodproviderRepository.save(new foodprovider("mehak@gmail.com","mehak","hyderabad","Mehak Sweets","9269054251"));
            foodproviderRepository.save(new foodprovider("chirag16@gmail.com","chirag","jabalpur","chirag Cafe","9875647839"));
            menuRepository.save(new Menu("pizza","Delicious fresh pan Pizza","chbhbd","230","sunday"));
            menuRepository.save(new Menu("pasta","Italian pasta","chbhbck","200","monday"));
            menuRepository.save(new Menu("Veg Dum Biryani","Hyderabadi dum biryani","chbhbd","300","tuesday"));
            menuRepository.save(new Menu("Butter paneer","Delicious  butter paneer","chbhbck","250","wednesday"));
            menuRepository.save(new Menu("Aloo Gobi","Delicious aloo gobi","chbhbd","200","thursday"));
            menuRepository.save(new Menu("Matar Paneer","Delicious matar paneer","chbhbck","250","friday"));
            menuRepository.save(new Menu("Chole Bature","Delicious chole bature","chbhbck","230","saturday"));

          //  OrdersItemRepository.save(new Orderitems(order_item_id:1,order_iteam_name:"",order_item_price:120,order_id:12 ));

            //OrdersRepository.save(new Orders(totalprice:320));





        };
    }
}

