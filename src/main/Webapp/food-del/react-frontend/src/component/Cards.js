import React, {Component} from "react";
import Card from 'react-bootstrap/Card'
import 'bootstrap/dist/css/bootstrap.min.css';
import Entry from "./Entry";
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
            // <div>
            // <div className="Card">
            // <Card border="success" style={{ width: '18rem' }} >
            //     <Card.Img variant="top" src="food.jpg" />
            //     <Card.Body>
            //         <Card.Title>{this.props.vendor?.contactNumber}</Card.Title>
            //
            //         <Card.Text>
            //             {this.props.vendor?.companyName}
            //         </Card.Text>
            //     </Card.Body>
            // </Card>
            // </div>
            // </div>


            <div>
                <dl className="dictionary">

                <Entry
                emo="🍱"
                term= {this.props.vendor?.companyName}
                des=  "“You can do that!” or “I feel strong!” Arm with tense biceps. Also used in connection with doing sports, e.g. at the gym."
               //  des={this.props.vendor?.contactNumber}
                />

                </dl>
            </div>
        )
    }
}
export default Cards;
