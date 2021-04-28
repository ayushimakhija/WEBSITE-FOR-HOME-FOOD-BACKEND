import React, {Component} from "react";
import Alert from 'react-bootstrap/Alert';
import {Link} from "react-router-dom";

class FoodProviderPage extends Component {
    render(){
        return (

            <div>
                <Alert variant="success">
                    <Alert.Heading>Hey, nice to see you</Alert.Heading>
                    <p>
                        Aww yeah, you successfully read this important alert message. This example
                        text is going to run a bit longer so that you can see how spacing within an
                        alert works with this kind of content.
                        <Link to="/FoodProviderLogin"> Login as Vendor</Link>

                    </p>
                    <hr />
                    <p className="mb-0">
                        Whenever you need to, be sure to use margin utilities to keep things nice
                        and tidy.
                        <Link to="/FoodProviderRegister"> Create an Account</Link>
                    </p>
                </Alert>
            </div>


        )
    }
}
export default FoodProviderPage;
