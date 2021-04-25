import React from 'react';
import {Component} from 'react';
import {Link} from 'react-router-dom'
import foodproviderService from '../Services/foodproviderService'


class Search extends Component{
    constructor(props){
        super(props);
        this.state = {
            Search: '',
        }
        this.handleOnChange= this.handleOnChange.bind(this);
        this.handleClick= this.handleClick.bind(this);
    }

    handleOnChange = (event) => {
            const {name, value} = event.target
            this.setState({
                [name]: value
            })
        }

    handleClick(e){
        e.preventDefault();

        let location = {
            search: this.state.search
        }
        console.log("HandleClick")
        console.log(location);
        foodproviderService.getAllFoodproviderByLocation(location).then(res => {


            console.log("list of food provider", res.data);
            this.props.history.push({
                pathname: "/FoodProviderList",

            })
            console.log("Search Successfull");
        })
            .catch(err =>{
                console.log(err.response.data);
                alert("No such location");
                window.location.reload(true);
            });

    }

    render(){

        return (
            <div className="Search">
                <form>
                    <input
                    type="text"
                    name="Search"
                    className="Search"
                    placeholder="Search"
                    value={this.state.Search}
                    onChange={this.handleOnChange}/>
                    <button className="Search" onClick={this.handleClick}>Search</button>
                </form>
            </div>
        );
    }
}
export default Search;

