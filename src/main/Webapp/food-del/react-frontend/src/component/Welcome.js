import React, {Component} from "react";
import {Link} from 'react-router-dom';
import Footer from './Footer'
import Cards from "./Cards";
import 'bootstrap/dist/css/bootstrap.min.css';
import Card from "react-bootstrap/Card";

class Welcome extends Component {
    constructor(props) {
        super(props);

    }
    render() {
        return (
            <div className="Welcome">
                <div className="content">
                    <label className="logo"> Home delivery </label>
                    <h4>"This is website for Students who lives away from their home and are always craving for home food "</h4>
                    <h5>“Food for us comes from our relatives, whether they have wings or fins or roots. That is how we consider food. Food has a culture. It has a history. It has a story. It has relationships.”

                        – Winona LaDuke</h5>
                </div>
            <div className="Search">
                <div className="Card" >
                    <Card border="success" style={{ width: '18rem' }} >
                        <Card.Img variant="top" src="" />
                        <Card.Body>
                            <Card.Title><h1>Pizza</h1></Card.Title>
                            <Card.Text>
                                230
                                <br/>
                            </Card.Text>
                        </Card.Body>
                    </Card>
                </div>
                <br/>
            </div>


            </div>
        );
    }
}

export default Welcome
