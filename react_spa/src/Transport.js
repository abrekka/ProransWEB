import React, { Component } from "react";
import CurrentWeekNumber from 'current-week-number';

 class Transport extends Component {
         constructor(props) {
         super(props);

         this.handleChange = this.handleChange.bind(this);
         this.handleChangeUke = this.handleChangeUke.bind(this);
         this.hentTransport=this.hentTransport.bind(this);
          this.state = {
                 jsonReturnedValue: [],
                 aar:(new Date()).getFullYear(),
                 uke: CurrentWeekNumber(new Date())
              };


        }
        componentDidMount() {
            this.hentTransport(this.state.aar,this.state.uke)
          }

        handleChange(event) {

        this.setState({aar: event.target.value});
        console.log(this.state.aar,this.state.uke)
        this.hentTransport(event.target.value,this.state.uke)
        }

         handleChangeUke(event) {

                this.setState({uke: event.target.value});
                this.hentTransport(this.state.aar,event.target.value)
                }


        hentTransport(aar,uke){
        console.log(aar+' '+uke)
          fetch('http://localhost:8080/transport?aar='+aar+'&uke='+uke)
                .then(response => response.json())
                .then(json => {

                console.log('json',json)
                this.setState({ jsonReturnedValue: json });
                });

          }

        render() {
         return (

         <div>
            <label>
             År:
             <select value={this.state.aar} onChange={this.handleChange}>
             <option value="2016">2016</option>
             <option value="2017">2017</option>
             <option value="2018">2018</option>
           </select>
           </label>
           <label>
                        Uke:
                        <select value={this.state.uke} onChange={this.handleChangeUke}>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                        <option value="13">13</option>
                        <option value="14">14</option>
                        <option value="15">15</option>
                        <option value="16">16</option>
                        <option value="17">17</option>
                        <option value="18">18</option>
                        <option value="19">19</option>
                        <option value="20">20</option>
                        <option value="21">21</option>
                        <option value="22">22</option>
                        <option value="23">23</option>
                        <option value="24">24</option>
                        <option value="25">25</option>
                        <option value="26">26</option>

                      </select>
                      </label>
<table>
<thead>
<tr>
<th>Transport</th>
<th>Firma</th>
<th>Sjåfør</th>
<th>Ordrenr</th>
<th>Kunde</th>
<th>Adresse</th>
<th>Type</th>
</tr>
</thead>
<tbody>
         {this.state.jsonReturnedValue.map(function(d, idx){
                          return (
                          <tr key={d.id}>
                            <td >{d.transportinfo}</td>
                            <td >{d.firma}</td>
                            <td >{d.sjaafoer}</td>
                            <td >{d.ordrenr}</td>
                            <td >{d.kunde}</td>
                            <td >{d.adresse}</td>
                            <td >{d.transportType}</td>
                          </tr>)
                        })}
                        </tbody>
                        </table>
                        </div>
       );
       }
       }

export default Transport;