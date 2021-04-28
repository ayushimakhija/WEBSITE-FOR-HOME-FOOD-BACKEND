import React,{Component} from "react";
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import axios from "axios";

class FoodProviderRegister extends Component {
    constructor(props){
        super(props);
        this.state={
            emailId :'',
            password:'',
            location :'',
            contactNumber:'',
            companyName:''
        }
        this.EmailHandler = this.EmailHandler.bind(this);
        this.PasswordHandler = this.PasswordHandler.bind(this);
        this.LocationHandler = this.LocationHandler.bind(this);
        this.ContactNumberHandler = this.ContactNumberHandler.bind(this)
        this.CompanyNameHandler = this.CompanyNameHandler.bind(this);
        this.HandleClick = this.HandleClick.bind(this);
    }
    EmailHandler= (event) => {
        this.setState({emailId: event.target.value});
    }
    PasswordHandler= (event) => {
        this.setState({password: event.target.value});
    }
    LocationHandler= (event) => {
        this.setState({location: event.target.value});
    }
    ContactNumberHandler= (event) => {
        this.setState({contactNumber: event.target.value});
    }
    CompanyNameHandler= (event) => {
        this.setState({companyName: event.target.value});
    }
    HandleClick= (event) =>{
        event.preventDefault();
        let foodProvider = {
            emailId: this.state.emailId,
            password: this.state.password,
            location : this.state.location,
            contactNumber: this.state.contactNumber,
            companyName : this.state.companyName
        }
        axios.post('http://localhost:8082/api/createfoodprovider',foodProvider)
            .then(response =>{
                console.log(response);
                console.log(response.data);
                {this.props.history.push('/FoodProviderPage');
                    console.log("Account Created");
                }
            })
            .catch(error =>{
                console.log(error)
            })
        alert('Account Created ');
    }
    render(){
        return(
            <div>
            <Form>
                    <Form.Group  controlId="formGridEmail">
                        <Form.Label>Email</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" value={this.state.emailId}
                                      onChange={this.EmailHandler}/>
                    </Form.Group>
                    <Form.Group  controlId="formGridPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" value={this.state.password}
                                      onChange={this.PasswordHandler} />
                    </Form.Group>
                    <Form.Group controlId="formGridAddress1">
                         <Form.Label>Address</Form.Label>
                         <Form.Control placeholder="1234 Main St" value={this.state.location}
                                       onChange={this.LocationHandler}/>
                    </Form.Group>
                     <Form.Group controlId="formGridAddress1">
                       <Form.Label>Contact Number</Form.Label>
                       <Form.Control placeholder="7869" value={this.state.contactNumber}
                                  onChange={this.ContactNumberHandler}/>
                     </Form.Group>

                    <Form.Group controlId="formGridCompany">
                         <Form.Label>Company Name</Form.Label>
                         <Form.Control placeholder="ayushi" value={this.state.companyName}
                                       onChange={this.CompanyNameHandler}/>
                    </Form.Group>

                <Button variant="primary" type="submit" onClick={this.HandleClick}>
                    Register
                </Button>
            </Form>
            </div>
        )
    }
}
export default FoodProviderRegister;
