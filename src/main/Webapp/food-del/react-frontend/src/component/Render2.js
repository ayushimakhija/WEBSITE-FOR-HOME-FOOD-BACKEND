import {useParams} from "react-router-dom";
import Cards1 from "./Cards1";
import React from "react";
import {Component} from "react";

 function RenderMenu(props)
{
    console.log(props.dishes);
    return (
        <div>
            <div>
                <h1>Dishes</h1>
                {props.dishes?.map(dish => {
                    return <Cards1 dish={dish}/>
                }) }


            </div>
        </div>
    )
}

class Render2 extends Component{
  constructor(props) {
      super(props);
      this.state = {
          dishes : this.props.location.dishes
      }
      this.HandleClick = this.HandleClick.bind(this);
      this.setDishes = this.setDishes.bind(this);
      this.setDishes(this.props.location.dishes);
      console.log("constructor");
  }
  HandleClick(event){
      event.preventDefault();

  }
    setDishes(dishes)
    {
        this.setState({dishes:dishes})
    }

    render() {
        console.log("hello");
        console.log(this.props.location.dishes);
        console.log(this.state.dishes);

        return(
            <div>
                <RenderMenu
                        dishes={this.state.dishes}/>

            </div>
        )
    }
}
export default Render2;
