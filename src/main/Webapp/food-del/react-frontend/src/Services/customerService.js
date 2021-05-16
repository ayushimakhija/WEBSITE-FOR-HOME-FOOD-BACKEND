import axios from "axios";

class customerService {
    getAllCustomers() {
        return axios.get("http://localhost:8080/api/getAllCustomers");
    }
    getCustomerById(){
        return axios.get("http://localhost:8080/api/getCustomerById")
    }
    createCustomer(customer)
    {
        return axios.post("http://localhost:8080/api/createCustomer",customer);
    }
    updateCustomer(customer){
        return axios.put("http://localhost:8080/api/updateCustomer",customer);
    }

}
export default customerService
