import React from 'react';
import {Component} from 'react';
import axios from 'axios';

class FoodProviderList extends Component{
   constructor(props) {
       super(props);
       this.state = {
           foodproviderList :[]
       }
   }
   componentDidMount() {
       axios.get('https://jsonplaceholder.typicode.com/posts')
       .then(response=>{
           this.setState({foodproviderList:response.data})
           console.log(response);
       })
       .catch(error=>{
           console.log(error);
       })
   }

    render(){
       const { foodproviderList } = this.state
       return(
           <div>List of Food Provider{
               foodproviderList.length?
               foodproviderList.map(foodprovider=><div key={foodprovider.id}>{foodprovider.title}</div>):null
           }</div>
       )
   }
}
export default FoodProviderList
