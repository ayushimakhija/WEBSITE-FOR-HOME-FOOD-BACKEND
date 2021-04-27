import React, {Component} from "react";
import {BrowserRouter as Router, Route,Switch} from 'react-router-dom'
import './App.css';
import Welcome from "./component/Welcome"
import Header from './component/Header'
import SignIn from "./component/Signin";
import SignUp from "./component/SignUp";
import Search from "./component/Search";
import 'bootstrap/dist/css/bootstrap.min.css';
import FoodProviderList from "./component/FoodProviderList";
import Cards from "./component/Cards";


class App extends Component{
  render(){
    return(
        <div>
          <Router>
            <div>
              <Header/>
            </div>
            <div className="container">
              <Switch>

                <Route exact path='/' component={Welcome}/>
                <Route exact path='/Signin' component={SignIn}/>
                <Route exact path='/SignUp' component={SignUp}/>
                <Route exact path='/Search' component={Search}/>
                <Route exact path='/FoodProviderList' component={FoodProviderList}/>
                <Route>exact path='/Cards' component={Cards}</Route>
              </Switch>
            </div>
          </Router>
          {/* <dl className="dictionary"></dl> */}

        </div>
    )
  }

}

export default App;

