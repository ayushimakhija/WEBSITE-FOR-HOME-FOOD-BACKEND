import React from 'react';
import {Component} from 'react';
import axios from "axios";

class FoodProviderPage extends Component{
    constructor(props) {
        super(props);
        this.state = {
            foodproviderMenu: []
        }
    }
    componentDidMount() {
        axios.get('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                this.setState({foodproviderMenu: response.data})
                console.log(response);
            })
            .catch(error => {
                console.log(error);
            })
    }

    render(){
        const { foodproviderMenu } = this.state
        return(
            <div>List of dishs available{
                foodproviderMenu.length?
                    foodproviderMenu.map(dish=><div key={dish.id}>{dish.title}
                        <button>Update</button>
                        <button>delete</button>
                    </div>):null
            }
            <button>Add Dish</button></div>
        )
    }
}
export default FoodProviderPage
