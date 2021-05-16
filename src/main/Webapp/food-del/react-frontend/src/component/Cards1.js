import React, {Component} from "react";
import Card from "react-bootstrap/Card";
import axios from "axios";


class Cards1 extends Component{
    constructor(props) {
        super(props);
        this.state = {
            userId:'',
            subscribe:true
        }
        this.HandleClick =  this.HandleClick.bind(this);


    }
    HandleClick (event){
      event.preventDefault();
      this.setState({
              subscribe : true
          })
        this.setState({
            userId : localStorage.getItem("userId")
        })
        let customer = {
          subscribe: this.state.subscribe
        }
        if(this.state.userId === undefined) {
            alert("please login first")
        }
        else{
            console.log(this.state.userId);
            axios.put('http://localhost:8082/api/updateCustomer/' + this.state.userId, customer)
                .then(response => {
                    console.log(response.data);
                    alert("subscribe sucessully");
                })
                .catch(error => {
                    console.log(error)
                })
            alert("please login first");
        }
    }
    render(){
        console.log("dishes");
        console.log(this.props.dish);
        return(
            <div>
                <div className="Card">
                    <Card border="success" style={{ width: '18rem' }} >
                        <Card.Img variant="top" src={this.props.dish?.dishImage} />
                        <Card.Body>
                            <Card.Title><h3>{this.props.dish?.dishName}</h3></Card.Title>
                            <Card.Text>
                                {this.props.dish?.dishDescription}
                                <br/>
                                {this.props.dish?.day}
                                <br/>
                                {this.props.dish?.dishPrice}
                                <br/>
                                <button onClick={this.HandleClick}>Subscribe</button>
                            </Card.Text>
                        </Card.Body>
                    </Card>
                </div>

                <br/>

            </div>
        )
    }
}
export default Cards1;
