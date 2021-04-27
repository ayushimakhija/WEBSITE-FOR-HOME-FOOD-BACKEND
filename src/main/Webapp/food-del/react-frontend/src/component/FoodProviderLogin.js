import Form from 'react-bootstrap/Form';
import React ,{Component} from "react";
import Button from 'react-bootstrap/Button';
class FoodProviderLogin extends Component{
    render(){
        return(
            <div>
            <Form>

                    <Form.Group controlId="formGridEmail">
                        <Form.Label>Email</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" />
                    </Form.Group>

                    <Form.Group  controlId="formGridPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>

                <Button variant="primary" type="submit">
                    Login
                </Button>
            </Form>
            </div>
        )
    }

}
export default FoodProviderLogin;
