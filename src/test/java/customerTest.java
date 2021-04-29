//import com.fooddel.beans.Customer;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
////@RunWith(SpringRunner.class)
////@SpringBootTest(classes = customerTest.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@SpringBootTest
//public class customerTest {
////
////    @Autowired
////    private TestRestTemplate restTemplate;
////
////    @LocalServerPort
////    private int port;
////
////    private String getRootUrl() {
////        return "http://localhost:" + port;
////    }
//
//    @Test
//    public void contextLoads() {
//    }
////
////    @Test
////    public void testCreateCustomer() {
////        Customer customer = new Customer();
////        customer.setEmailId("admin@gmail.com");
////        customer.setFirstName("admin");
////        customer.setLastName("admin");
////        customer.setPassword("admin");
////        customer.setContactNumber("7869054251");
////        customer.setAddress("ayushi");
////
////        ResponseEntity<Customer> postResponse = restTemplate.postForEntity(getRootUrl() + "/Customer", customer, Customer.class);
////        Assert.assertNotNull(postResponse);
////        Assert.assertNotNull(postResponse.getBody());
////    }
//}
//
