import React, {Component} from "react";
import {BrowserRouter as Router, Route,Switch} from 'react-router-dom'
import './App.css';
import Welcome from "./component/Welcome"
import Navbar from './component/Navbar'
import SignIn from "./component/Signin";



class App extends Component{
  render(){
    return(
        <div>
          <Router>
            <div>
              <Navbar/>
            </div>
            <div className="container">
              <Switch>

                <Route exact path='/Welcome' component={Welcome}/>
                <Route exact path='/Signin' component={SignIn}/>
                <Route exact path='/Navbar' component={Navbar}/>
              </Switch>
            </div>
          </Router>
        </div>
    )
  }

}

export default App;

