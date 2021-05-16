//import com.fooddel.beans.Customer;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import com.fooddel.beans.Customer;
import com.fooddel.repository.CustomerRepository;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = customerTest.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class customerTest {

    /*@Autowired
    private CustomerRepository customerRepository;
    @Test
    public void findActivityTest(){
        List<Customer> CustomerList = customerRepository.findAll();
        Assert.assertTrue(customerRepository.findById(CustomerList.get(0).getId()).isPresent());
    }
    @Test
    public void saveUserTest(){
        List<Customer> customerList = customerRepository.findAll();
        Customer customer = new Customer("Corona","Virus","7686789456","covid@gmail.com","password","hello",false);
        Customer savedCustomer= customerRepository.save(customer);
        Assert.assertTrue(customerRepository.findById(savedCustomer.getId()).isPresent());
        customerRepository.deleteById(savedCustomer.getId());
    }*/
}
