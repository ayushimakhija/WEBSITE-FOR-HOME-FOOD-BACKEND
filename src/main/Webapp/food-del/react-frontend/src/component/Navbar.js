import React from "react"
import {Link} from 'react-router-dom'


function Navbar(){
    return(
        <div>
            <nav>
                <ul>
                    <li><Link to="/Welcome">Home</Link></li>
                    <li><Link to="/SignUp">sign up</Link></li>
                    <li><Link to="/SignIn">Sign in</Link></li>
                    <li><Link to="/Dashboard">Dashboard</Link></li>
                    <li><Link to="/AdminDashboard">food delivery</Link></li>
                </ul>
            </nav>
        </div>
    )
}

export default Navbar
