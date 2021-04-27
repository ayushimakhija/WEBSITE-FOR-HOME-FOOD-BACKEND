import React, {Component} from "react"
import {Link} from "react-router-dom";
import customerService from "../Services/customerService";
import Cards from "./Cards";


class SignUp extends Component {
    constructor(props) {
        super(props);

        this.state = {
            firstName: "",
            lastName: "",
            email: "",
            contactNumber: "",
            password: "",
            address: "",
            subscribe:"false"
        }
        this.handleChange = this.handleChange.bind(this)
        this.saveCustomer = this.saveCustomer.bind(this);
    }

    handleChange(event) {
        const {name, value} = event.target;
        this.setState({
            [name]: value
        })
    }

    saveCustomer = (e) => {
        e.preventDefault();
        let customer = {
            firstName: this.state.firstName, lastName: this.state.lastName, email: this.state.email,
            contactNumber: this.state.contactNumber, password: this.state.password, address: this.state.address,
            subscribe:this.state.subscribe
        }

        console.log('User =>' + JSON.stringify(customer));

        customerService.createCustomer(customer).then(res => {
            this.props.history.push('/Signin');
        });
    }

    render() {
        return (
            <div className="SignUpPage">
            <div className="SignUp">
                <div className="register">
                    <h1>Create an account</h1>
                    <p><h5>Already have an account?</h5><Link to="/Signin"> Sign in</Link></p>
                    <br/><br/><br/>
                </div>
                <div className="main">
                    <form onSubmit={this.handleSubmit}>

                        <br/><br/>
                        <div>
                            <input
                                type="text"
                                name="address"
                                className="address"
                                placeholder="address"
                                value={this.state.address}
                                onChange={this.handleChange}
                            />
                            {/*<br/><br/>*/}
                        </div>
                        <div>


                            <input
                                type="text"
                                name="firstName"
                                className="firstName"
                                placeholder="First Name"
                                value={this.state.firstName}
                                onChange={this.handleChange}
                            />
                            <br/>

                            <input
                                type="text"
                                name="lastName"
                                className="lastName"
                                placeholder="Last Name"
                                value={this.state.lastName}
                                onChange={this.handleChange}
                            />
                        </div>
                        {/*<h2 className="name">Email Address</h2>*/}
                        <input
                            type="email"
                            name="email"
                            required="True"
                            className="email"
                            placeholder="Email address"
                            value={this.state.email}
                            onChange={this.handleChange}
                        />
                    <br/>
                        {/*<br/>*/}
                        {/*<h2 className="name">Phone</h2>*/}
                        <input
                            type="number"
                            name="contactNumber"
                            required="True"
                            className="contactNumber"
                            placeholder="Contact Number"
                            value={this.state.contactNumber}
                            onChange={this.handleChange}
                        />
                        <br/>

                        {/*<br/>*/}
                        {/*<h2 className="name">Password</h2>*/}
                        <input
                            type="password"
                            name="password"
                            required="True"
                            className="password"
                            placeholder="Password"
                            value={this.state.password}
                            onChange={this.handleChange}
                        />
                        <br/><br/>
                        <button className="registerButton" onClick={this.saveCustomer}>Register</button>
                    </form>
                </div>
            </div>
                <div className="Cards">
                <Cards/><br/>
                </div>
            </div>
        )
    }
}

export default SignUp
