import React from 'react';
import {Component} from 'react';
import {Link} from 'react-router-dom'


class Search extends Component{
    constructor(props){
        super(props);
        this.state = {
            Search: '',
        }
    }

    handleOnChange = (e) =>{
        <Link to="/FoodProviderList">something</Link>
        //this.setState({[e.target.name]:e.target.value})
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
                    <button>Search</button>
                </form>
            </div>
        );
    }
}
export default Search;

