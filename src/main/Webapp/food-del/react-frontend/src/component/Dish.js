import React, {Component} from "react";
import Card from 'react-bootstrap/Card'
import 'bootstrap/dist/css/bootstrap.min.css';
class Dish extends Component{
    constructor(props) {
        super(props);
        this.state={
            CardTitle:'',
            CardImg:'',
            CardText:''
        }
    }
    render(){
        return(
            <div>
                <div className="Card">
                    <Card border="success" style={{ width: '18rem' }} >
                        <Card.Img variant="top" src="" />
                        <Card.Body>
                            <Card.Title>pizza</Card.Title>
                            <Card.Text>
                                Pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot.
                            </Card.Text>
                            <button>Subscribe</button>
                        </Card.Body>
                    </Card>
                </div>
            </div>
        )
    }
}
export default Dish;
