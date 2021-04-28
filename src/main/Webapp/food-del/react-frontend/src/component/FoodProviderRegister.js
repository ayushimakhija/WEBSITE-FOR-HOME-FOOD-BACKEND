import React,{Component} from "react";
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

class FoodProviderRegister extends Component {
    render(){
        return(
            <div>
            <Form>
                    <Form.Group  controlId="formGridEmail">
                        <Form.Label>Email</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" />
                    </Form.Group>
                    <Form.Group  controlId="formGridPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                    <Form.Group controlId="formGridAddress1">
                         <Form.Label>Address</Form.Label>
                         <Form.Control placeholder="1234 Main St" />
                    </Form.Group>

                    <Form.Group controlId="formGridCompany">
                         <Form.Label>Company Name</Form.Label>
                         <Form.Control placeholder="ayushi" />
                    </Form.Group>

                <Button variant="primary" type="submit">
                    Register
                </Button>
            </Form>
            </div>
        )
    }
}
export default FoodProviderRegister;
