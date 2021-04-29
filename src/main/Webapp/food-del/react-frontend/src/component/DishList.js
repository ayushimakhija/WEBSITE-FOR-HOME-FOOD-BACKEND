import React from 'react';
import {Component} from 'react';
import axios from 'axios';
import Dish from "./Dish";
class DishList  extends Component{
    constructor(props) {
        super(props);
    }
    render(){
        return(
            <div>
                <Dish/>
                <br/>
                <Dish/>
                <br/>
                <Dish/>
                <br/>
                <Dish/>
                <br/>
                <Dish/>
                <br/>
                <Dish/>

            </div>
        )
    }
}
export default DishList;
