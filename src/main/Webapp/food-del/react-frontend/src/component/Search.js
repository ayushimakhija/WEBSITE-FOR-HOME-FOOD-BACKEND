import React from 'react';
import {Component} from 'react';


class Search extends Component{
    constructor(props){
        super(props);
        this.state = {
            Search: 'search for a location',
        }
    }

    handleOnChange = (e) =>{
        this.setState({[e.target.name]:e.target.value})
    }


    render(){

        return (
            <div className="Search">
                <form>
                    <input type = 'text' name = 'search' value = {this.state.Search} onChange = {this.handleOnChange}/> <br></br>
                    <button>Search</button>
                </form>
            </div>
        );
    }
}
export default Search;

