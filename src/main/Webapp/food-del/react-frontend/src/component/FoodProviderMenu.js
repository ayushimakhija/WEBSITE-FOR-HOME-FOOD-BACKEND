import React from 'react';
import {Component} from 'react';
import axios from "axios";

class FoodProviderMenu extends Component{
    constructor(props) {
        super(props);
        this.state = {
            foodproviderMenu :[]
        }
    }
    componentDidMount() {
        axios.get('https://jsonplaceholder.typicode.com/posts')
            .then(response=>{
                this.setState({foodproviderMenu:response.data})
                console.log(response);
            })
            .catch(error=>{
                console.log(error);
            })
    }

    render(){
        const { foodproviderMenu } = this.state
        return(
            <div className='FPM'><h1>List of dishs available</h1>{
                foodproviderMenu.length?
                    foodproviderMenu.map(dish=><div key={dish.id}>{dish.title}
                    <button>Subscribe</button></div>):null
            }</div>
        )
    }
}
export default FoodProviderMenu;
