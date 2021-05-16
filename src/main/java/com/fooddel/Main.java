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
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


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
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        String url = System.getenv("DATABASE_HOST");
        if(url !=null){
            dataSourceBuilder.url("jdbc:mysql://spe-mysql:3306/food?createDatabaseIfNotExist=true");
        }else{
            dataSourceBuilder.url("jdbc:mysql://localhost:3306/food");
        }
        dataSourceBuilder.username("spe");
        dataSourceBuilder.password("A123456789a@#");
        return dataSourceBuilder.build();
    }

    @Bean
    InitializingBean sendDatabase(){
        return ()->{

            customerRepository.save(new Customer("ayushi","makhija","7869054251","narsinghpur","ayushi9ym.19@gmail.com","ayushi",false));
            customerRepository.save(new Customer("pavan","singh","8686886135","shamshabad","pavan@gmail.com","pavan",false));
            customerRepository.save(new Customer("shabbir","sidhpurwala","1234567890","bangalore","shabbir@gmail.com","shabbir",true));
            customerRepository.save(new Customer("mehak","dogra","2345678901","bangalore","mehak@gmail.com","mehak",false));
            customerRepository.save(new Customer("divyansha","agarwal","3456789012","indore","divyansha@gmail.com","divyansha",false));




            foodprovider f1 = new foodprovider("ayushi9yb.19@gmail.com","ayushi","bangalore","ayushi Cafe","7869054251");
            foodproviderRepository.save(f1);
            foodprovider f2 = new foodprovider("pavan@gmail.com","pavan","bangalore","Pavan Tifffins","8686886135");
            foodproviderRepository.save(f2);
            foodprovider f3 = new foodprovider("shabbir@gmail.com","shabbir","bangalore","SS Chicken Biryani","7823456789");
            foodproviderRepository.save(f3);
            foodprovider f4  = new foodprovider("mehak@gmail.com","mehak","hyderabad","Mehak Sweets","9269054251");
            foodproviderRepository.save(f4);
            foodprovider f5   = new foodprovider("chirag16@gmail.com","chirag","jabalpur","chirag Cafe","9875647839");
            foodproviderRepository.save(f5);
            menuRepository.save(new Menu("pizza","Delicious fresh pan Pizza","chbhbd","230","sunday",f1));
            menuRepository.save(new Menu("pasta","Italian pasta","chbhbck","200","monday",f1));
            menuRepository.save(new Menu("Veg Dum Biryani","Hyderabadi dum biryani","chbhbd","300","tuesday",f2));
            menuRepository.save(new Menu("Butter paneer","Delicious  butter paneer","chbhbck","250","wednesday",f2));
            menuRepository.save(new Menu("Aloo Gobi","Delicious aloo gobi","chbhbd","200","thursday",f3));
            menuRepository.save(new Menu("Matar Paneer","Delicious matar paneer","chbhbck","250","friday",f3));
            menuRepository.save(new Menu("Chole Bature","Delicious chole bature","chbhbck","230","saturday",f4));

        };
    }
}

