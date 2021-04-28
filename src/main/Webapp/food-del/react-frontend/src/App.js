import React, {Component} from "react";
import {BrowserRouter as Router, Route,Switch} from 'react-router-dom'
import './App.css';
import Welcome from "./component/Welcome"
import Header from './component/Header'
import SignIn from "./component/Signin";
import SignUp from "./component/SignUp";
import 'bootstrap/dist/css/bootstrap.min.css';
import FoodProviderList from "./component/FoodProviderList";
import Cards from "./component/Cards";
import FoodProviderPage from "./component/FoodProviderPage";
import FoodProviderLogin from "./component/FoodProviderLogin";
import FoodProviderRegister from "./component/FoodProviderRegister"


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
                <Route exact path='/FoodProviderList' component={FoodProviderList}/>
                <Route exact path='/Cards' component={Cards}/>
                <Route exact path='/FoodProviderPage' component={FoodProviderPage}/>
                <Route exact path='/FoodProviderLogin' component={FoodProviderLogin}/>
                <Route exact path='/FoodProviderRegister' component={FoodProviderRegister}/>
              </Switch>
            </div>
          </Router>


        </div>
    )
  }

}

export default App;

