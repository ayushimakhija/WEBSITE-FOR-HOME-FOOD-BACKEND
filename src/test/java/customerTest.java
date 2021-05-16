import com.fooddel.beans.Customer;
import com.fooddel.repository.CustomerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static java.nio.file.Paths.get;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = customerTest.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class customerTest {

    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void findActivityTest(){
        List<Customer> CustomerList = customerRepository.findAll();
        Assert.assertTrue(customerRepository.findById(CustomerList.get(0).getId()).isPresent());
    }




}
