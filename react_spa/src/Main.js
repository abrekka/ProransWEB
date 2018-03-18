import React, { Component } from "react";
import {
  Route,
  NavLink,
  HashRouter
} from "react-router-dom";
import Transport from "./Transport";
import Veggproduksjon from "./Veggproduksjon";

class Main extends Component {
  render() {
    return (
     <HashRouter>
        <div>
          <h1>Protrans WEB</h1>
          <ul className="header">
            <li><NavLink to="/transport">Transport</NavLink></li>
            <li><NavLink to="/veggproduksjon">Veggproduksjon</NavLink></li>
          </ul>
          <div className="content">
            <Route extact path="/transport" component={Transport}/>
            <Route path="/veggproduksjon" component={Veggproduksjon}/>
          </div>
        </div>
        </HashRouter>
    );
  }
}

export default Main;