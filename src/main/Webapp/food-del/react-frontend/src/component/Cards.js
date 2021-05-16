import React, {Component} from "react";
import Card from 'react-bootstrap/Card'
import 'bootstrap/dist/css/bootstrap.min.css';
import {withRouter} from "react-router";
import axios from "axios";


class Cards extends Component{
    constructor(props) {
        super(props);
        this.state = {
            userId:'',
            dishes:[]
        }
        this.Handler = this.Handler.bind(this);


    }


    Handler(event){
        event.preventDefault();
        for(var i=3;i<this.props.vendor.length;i++){
            console.log(this.props.vendor?.[i]);
            axios.get('http://localhost:8082/api/menu/' + this.props.vendor?.[i])
                .then(response => {
                    console.log(response.data);
                    this.state.dishes.push(response.data);
                })
                .catch(error => {
                    console.log(error)
                })
        };

        console.log("hi");
        console.log(this.state.dishes);
        this.props.history.push({
                            pathname: "/Render2",
                            dishes: this.state.dishes
                        })
        console.log(this.props.location.dishes);
    }
    render(){
        return(
            <div>
            <div className="Card" >
            <Card border="success" style={{ width: '18rem' }} >
                <Card.Img variant="top" src="" />
                <Card.Body>
                    <Card.Title><h1>{this.props.vendor?.[2]}</h1></Card.Title>
                    <Card.Text>
                        {this.props.vendor?.[0]}
                        <br/>
                        <button onClick={this.Handler}>Select</button>
                    </Card.Text>
                </Card.Body>
            </Card>
            </div>
                <br/>

            </div>
        )
    }
}
export default withRouter(Cards);
