import React, {Component} from "react";
import Card from 'react-bootstrap/Card'
import 'bootstrap/dist/css/bootstrap.min.css';
class Cards extends Component{
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
                <Card.Img variant="top" src="./food.jpg" />
                <Card.Body>
                    <Card.Title>{this.props.vendor?.contactNumber}</Card.Title>

                    <Card.Text>
                        {this.props.vendor?.companyName}
                    </Card.Text>
                </Card.Body>
            </Card>
            </div>
            </div>
        )
    }
}
export default Cards;
