import React, {Component} from "react";
import {BrowserRouter as Router, Route, Switch, useParams} from 'react-router-dom'
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
import Footer from "./component/Footer";
import  Signin from "./component/Signin"
import Entry from "./component/Entry";
import PostSearch from "./component/PostSearch";



function RenderVendor(props)
{

  let { city } = useParams();
  console.log("Rendering Vendors")
console.log({city});
  return(
      <div>
        <h1>Location : {city}</h1>

        {props.vendors.length>0?props.vendors.map(vendor =>{return <Cards vendor={vendor}/>}):"Data Not Found"}

      </div>
  );
}

class App extends Component{

  constructor() {
    super();
    this.state={
      Vendors:[]

    }
    this.setVendors=this.setVendors.bind(this)

  }
  setVendors(vendors)
  {
    this.setState({Vendors:vendors})
  }



  render(){
    console.log(this.state)
    return(
        <div>
          <Router>
            <div>
              <Header
              setVendors={this.setVendors}
              />
            </div>
            <div className="container">
              <Switch>

                <Route exact path='/' component={Welcome}/>
                {/*<Signin />*/}
                <Route exact path='/Signin' component={SignIn}/>
                <Route exact path='/SignUp' component={SignUp}/>
                <Route exact path='/FoodProviderList' component={FoodProviderList}/>
                <Route exact path='/Cards' component={Cards}/>
                <Route exact path='/FoodProviderPage' component={FoodProviderPage}/>
                <Route exact path='/FoodProviderLogin' component={FoodProviderLogin}/>
                <Route exact path='/FoodProviderRegister' component={FoodProviderRegister}/>
                <Route exact path='/PostSearch' component={PostSearch}/>
                <Route  path='/location/:city' >
                  <RenderVendor
                  vendors={this.state.Vendors}/>
                </Route>
              </Switch>
            </div>
          </Router>



        </div>
    )
  }

}

export default App;

