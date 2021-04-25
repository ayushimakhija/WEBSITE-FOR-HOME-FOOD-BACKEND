import React, {Component} from "react";
import {BrowserRouter as Router, Route,Switch} from 'react-router-dom'
import './App.css';
import Welcome from "./component/Welcome"
import Navbar from './component/Navbar'
import SignIn from "./component/Signin";
import SignUp from "./component/SignUp";
import Search from "./component/Search";
import FoodProviderList from "./component/FoodProviderList";
import FoodProviderPage from "./component/FoodProviderPage";
import FoodProviderMenu from "./component/FoodProviderMenu";




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

                <Route exact path='/' component={Welcome}/>
                <Route exact path='/Signin' component={SignIn}/>
                <Route exact path='/SignUp' component={SignUp}/>
                <Route exact path='/Search' component={Search}/>
                <Route exact path='/FoodProviderList' component={FoodProviderList}/>
                <Route exact path='/FoodProviderPage' component={FoodProviderPage}/>
                <Route exact path='/FoodProviderMenu' component={FoodProviderMenu}/>
              </Switch>
            </div>
          </Router>
        </div>
    )
  }

}

export default App;

