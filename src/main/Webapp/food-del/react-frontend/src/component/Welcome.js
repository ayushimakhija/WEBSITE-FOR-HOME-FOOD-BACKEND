import React, {Component} from "react";
import {Link} from 'react-router-dom';

class Welcome extends Component {
    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    handleSubmit() {
        alert("create account")
        //this.props.history.push('/SignUp')
    }


    render() {
        return (
            <div className="Welcome">
                <div className="content">
                    <label className="logo">Home delivery </label>
                    <h4>This is website for Students who lived away from there home and are always craving for home food </h4>
                    {/*<div className="Button">*/}
                    {/*    <button className="createAccount" onSubmit={this.handleSubmit}>Create Account</button>*/}
                    {/*</div>*/}
                </div>
                <div className="login">

                </div>

            </div>
        );
    }
}

export default Welcome
