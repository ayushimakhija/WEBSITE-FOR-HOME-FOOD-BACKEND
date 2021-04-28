import React,{Component} from "react"
import {Link} from 'react-router-dom';
import axios from "axios";
class SignIn extends Component{
    constructor(props) {
        super(props);
        this.state = {
            emailId: "",
            password: "",
            errorMessage : false
        }
        this.EmailHandler=this.EmailHandler.bind(this)
        this.PasswordHandler=this.PasswordHandler.bind(this)
        this.handleClick= this.handleClick.bind(this)
    }

    EmailHandler= (event) => {
        this.setState({emailId: event.target.value});
    }
    PasswordHandler= (event) => {
        this.setState({password: event.target.value});
    }
    handleClick= (event) =>{
        event.preventDefault();
        let customer = {
            emailId: this.state.emailId,
            password: this.state.password
        }
        axios.post('http://localhost:8081/api/login',customer)
            .then(response =>{
                console.log(response);
                console.log(response.data);
                {this.props.history.push('/');
                    console.log("login");
                }
            })
            .catch(error =>{
                console.log(error)
            })
        alert('login');
    }
    render() {
        return (
            <div>
            <div className="SignIn">
                <div className="register">
                    <h1>Sign In</h1>
                </div>
                <div className="main">
                    <form>
                        <input
                            type="emailId"
                            name="emailId"
                            required="True"
                            className="email"
                            placeholder="Email address"
                            value={this.state.emailId}
                            onChange={this.EmailHandler}
                        />
                        <br/>

                        <input
                            type="password"
                            name="password"
                            required="True"
                            className="password"
                            placeholder="Password"
                            value={this.state.password}
                            onChange={this.PasswordHandler}
                        />
                        <h3 style={{display: this.state.errorMessage ? "block" : "none"}}>Incorrect
                            Username/Password</h3>
                        <br/>
                        <button className="registerButton" onClick={this.handleClick} >Login</button>
                        <p>New at the portal?<Link to="/SignUp"> Sign Up</Link></p>

                    </form>
                </div>
            </div>
                <div className="Welcome">
                    <div className="content">
                        <label className="logo"> Home delivery </label>
                        <h4>"This is website for Students who lives away from their home and are always craving for home food "</h4>
                        <h5>“Food for us comes from our relatives, whether they have wings or fins or roots. That is how we consider food. Food has a culture. It has a history. It has a story. It has relationships.”

                            – Winona LaDuke</h5>
                    </div>
                </div>
            </div>
        );
    }

}

export default SignIn;

