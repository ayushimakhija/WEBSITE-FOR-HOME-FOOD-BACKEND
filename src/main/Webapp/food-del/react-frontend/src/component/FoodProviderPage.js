import React, {Component} from "react";
import Alert from 'react-bootstrap/Alert';
import {Link} from "react-router-dom";

class FoodProviderPage extends Component {
    render(){
        return (
                    <div>
                        <Link to="/FoodProviderLogin"> Login as Vendor</Link>
                        <Link to="/FoodProviderRegister"> Create an Account</Link>
                     </div>




        )
    }
}
export default FoodProviderPage
