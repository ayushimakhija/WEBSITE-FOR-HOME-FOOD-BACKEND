import React, {Component} from "react";
import Alert from 'react-bootstrap/Alert';
import {Link} from "react-router-dom";
import axios from "axios";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";

class FoodProviderPage extends Component {
    constructor(props){
        super(props);
        this.state = {
            dishName:'',
            dishDescription:'',
            dishImage:'',
            dishPrice:'',
            day:'',
            dishId : this.props.location.dishId
        }

        this.update = this.update.bind(this);
        this.create = this.create.bind(this);
        this.DishName = this.DishName.bind(this);
        this.DishDescription = this.DishDescription.bind(this);
        this.Day = this.Day.bind(this);
        this.DishImage = this.DishImage.bind(this);
        this.DishPrice = this.DishPrice.bind(this);
    }
    DishName= (event) => {
        this.setState({dishName: event.target.value});
    }
    Day= (event) => {
        this.setState({day: event.target.value});
    }
    DishImage= (event) => {
        this.setState({dishImage: event.target.value});
    }
    DishDescription= (event) => {
        this.setState({dishDescription: event.target.value});
    }
    DishPrice= (event) => {
        this.setState({dishPrice: event.target.value});
    }


    update(event){
        if(this.state.dishId != null) {
            event.preventDefault();
            let Menu = {
                dishName: this.state.dishName,
                dishDescription: this.state.dishDescription,
                dishImage: this.state.dishImage,
                dishPrice: this.state.dishPrice,
                day: this.state.day,
                dishId: this.state.dishId
            }
            axios.put('http://localhost:8082/api/menu/1', Menu)
                .then(response => {
                    console.log(response);
                    console.log(response.data);
                    {
                        this.props.history.push('/FoodProviderPage');
                        alert("created succesfully");
                    }
                })
        }
        else{
            alert("login first")
        }
    }
    create(event){
        event.preventDefault();
        if(this.state.dishId != null) {
            let Menu = {
                dishName: this.state.dishName,
                dishDescription: this.state.dishDescription,
                dishImage: this.state.dishImage,
                dishPrice: this.state.dishPrice,
                day: this.state.day,
                dishId: this.state.dishId
            }
            axios.post('http://localhost:8082/api/createMenu', Menu)
                .then(response => {
                    console.log(response);
                    console.log(response.data);
                    {
                        this.props.history.push('/FoodProviderPage');
                        alert("created succesfully");
                    }
                })
        }
        else{
            alert("create Account or login first")
        }
    }
    render(){
        return (

            <div>
                <Alert variant="success">
                    <Alert.Heading>Hey, nice to see you</Alert.Heading>
                    <p>
                       Login As Vendor First to be able to Add , delete and modify Your own menu
                        <Link to="/FoodProviderLogin"> Login as Vendor</Link>

                    </p>
                    <hr />
                    <p className="mb-0">
                       First Time Access Create New Account to provide Home cook food
                        <Link to="/FoodProviderRegister"> Create an Account</Link>
                    </p>
                </Alert>
                <div>
                    <Form>
                        <Form.Group  controlId="formGridEmail">
                            <Form.Label>Dish Name</Form.Label>
                            <Form.Control type="Dish Name" placeholder="Enter dish Name" value={this.state.dishName}
                                          onChange={this.DishName}/>
                        </Form.Group>
                        <Form.Group  controlId="formGridPassword">
                            <Form.Label>Dish Price</Form.Label>
                            <Form.Control type="dish price" placeholder="enter price" value={this.state.dishPrice}
                                          onChange={this.DishPrice} />
                        </Form.Group>
                        <Form.Group controlId="formGridAddress1">
                            <Form.Label>Dish Description</Form.Label>
                            <Form.Control placeholder="my favourite" value={this.state.dishDescription}
                                          onChange={this.DishDescription}/>
                        </Form.Group>
                        <Form.Group controlId="formGridAddress1">
                            <Form.Label>Day</Form.Label>
                            <Form.Control placeholder="Monday" value={this.state.day}
                                          onChange={this.Day}/>
                        </Form.Group>

                        <Form.Group controlId="formGridCompany">
                            <Form.Label>Dish Image</Form.Label>
                            <Form.Control placeholder="Image" value={this.state.dishImage}
                                          onChange={this.DishImage}/>
                        </Form.Group>


                        <br/>
                        <Button variant="primary" type="submit" onClick={this.update}>
                            update
                        </Button>
                        <br/>
                        <br/>
                        <Button variant="primary" type="submit" onClick={this.create}>
                            Create
                        </Button>
                    </Form>
                </div>

            </div>


        )
    }
}
export default FoodProviderPage;
