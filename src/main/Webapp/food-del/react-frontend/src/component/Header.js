import React, {Component} from "react"
import {Link} from 'react-router-dom'
import {Navbar,NavbarBrand,Nav,NavLink,Button,Form} from "reactstrap";


class Header extends Component{
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
                                    <input className="form-control me-2" type="search" placeholder="Enter location" aria-label="Search"/>
                                    <button className="btn btn-outline-success" type="submit">Search</button>
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
