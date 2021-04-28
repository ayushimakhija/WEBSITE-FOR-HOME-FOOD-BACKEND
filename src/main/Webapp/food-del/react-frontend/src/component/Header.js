import React, {Component} from "react"
import {Link} from 'react-router-dom'
import {Navbar,NavbarBrand,Nav,NavLink,Button,Form} from "reactstrap";
import axios from "axios";


class Header extends Component{
    constructor(props){
        super(props)
        this.state = {
            location :''
        }
        this.LocationHandler=  this.LocationHandler.bind(this)
        this.HandleClick =  this.HandleClick.bind(this)
    }
    LocationHandler(event){
        this.setState({location: event.target.value});
    }
    HandleClick(event){
        event.preventDefault();
        let foodprovider = {
            location: this.state.location,
        }
        axios.post('http://localhost:8081/api/foodprovider/location',foodprovider)
            .then(response =>{
                console.log(response);
                console.log(response.data);
                {this.props.history.push('/');
                    console.log("Search succesufully");
                }
            })
            .catch(error =>{
                console.log(error)
            })
    }
    render() {
        return (
            <div>
                    <header>
                <nav className="navbar navbar-expand-md navbar-dark bg-dark" >
                    <div className="collapse navbar-collapse justify-content-between" id="navbarTogglerDemo01">
                    <ul className="navbar-nav ml-auto me-auto mb-2 mb-lg-0">
                            <li className="nav-item" >
                                <Link to="/">
                                    <a className="nav-link " aria-current="page" href="">Home</a>
                                </Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/Signin">
                                    <a className="nav-link " href="">Sign In</a>
                                </Link>
                            </li>

                            <li className="nav-item">
                                <Link to="/SignUp">
                                    <a className="nav-link " href="" tabindex="-1" aria-disabled="true">Sign Up</a>
                                </Link>
                            </li>

                        <li className="nav-item">
                            <Link to="/FoodProviderPage">
                                <a className="nav-link " href="" tabIndex="-1" aria-disabled="true">Vendors</a>
                            </Link>
                        </li>
                        </ul>
                    </div>
                    <div className="collapse navbar-collapse justify-content-between" id="navbarTogglerDemo02">
                        <ul className="navbar-nav ml-auto me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <form className="d-flex">
                                    <input className="form-control me-2" type="search" placeholder="Enter location" value={this.state.location}
                                           onChange={this.LocationHandler}aria-label="Search"/>
                                    <button className="btn btn-outline-success" type="submit" onClick={this.HandleClick}>Search</button>
                                </form>
                            </li>
                        </ul>
                    </div>

                </nav>
            </header>
    </div>
        )
    }
}

export default Header
