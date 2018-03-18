import React, { Component } from "react";

class Veggproduksjon extends Component {
constructor(){
     super();
      this.handleClick = this.handleClick.bind(this);
      this.hentveggproduksjon = this.hentveggproduksjon.bind(this);
     this.state = {
        jsonReturnedValue: []
     }

   }
  componentDidMount() {
  console.log('test')
  this.hentveggproduksjon()
      console.log(this)
  }

  hentveggproduksjon(){
  fetch('http://localhost:8080/veggproduksjon')
        .then(response => response.json())
        .then(json => {
        console.log('json',json)
        this.setState({ jsonReturnedValue: json });
        });
  }


 handleClick(ordrenr,handling) {
    console.log(ordrenr);
    fetch('http://localhost:8080/veggproduksjon/'+ordrenr+'/'+handling, {
      method: 'post',
      headers: {'Content-Type':'application/json'},
      body: {
       "first_name": ordrenr
      }
     });

  };

  render() {
  const handleClick = this.handleClick;
    return (
     <div>
     <table>
     <thead>
     <tr>
     <th>Transport</th>
     <th>Ordrenr</th>
     <th>Kunde</th>
     <th>Adresse</th>
     <th>Prod.uke</th>
     <th>Opplasting</th>
     <th>Produsert</th>
     <th>Startet</th>
     <th>Tidsbruk</th>
     <th>Gjort av</th>
     </tr>
     </thead>
     <tbody>
     {this.state.jsonReturnedValue.map(function(d, idx){
        var bakgrunn="#FFFFFF"
        var knappetekst="Sett produsert"
        var handling="sett_produsert"
        if(d.startetTidspunkt!=null){
          bakgrunn="f0f525"
        }
        if(d.produksjonsdato!=null){
          bakgrunn="#71bd5e"
          knappetekst="Sett ikke produsert"
           handling="sett_ikke_produsert"
        }
                               return (

                               <tr key={d.ordrenr}>
                                 <td bgcolor={bakgrunn}>{d.transportdetaljer}</td>
                                 <td bgcolor={bakgrunn}>{d.ordrenr}</td>
                                 <td bgcolor={bakgrunn}>{d.kundedetaljer}</td>
                                 <td bgcolor={bakgrunn}>{d.adresse}</td>
                                 <td bgcolor={bakgrunn}>{d.produksjonsuke}</td>
                                 <td bgcolor={bakgrunn}width='100'>{d.opplastingsdato}</td>
                                 <td bgcolor={bakgrunn}width='100'>{d.produksjonsdato}</td>
                                 <td bgcolor={bakgrunn}>{d.startetTidspunkt}</td>
                                 <td bgcolor={bakgrunn}align='center'>{d.tidsforbruk}</td>
                                 <td bgcolor={bakgrunn}>{d.gjortAv}</td>
                                 <td bgcolor={bakgrunn}><button onClick={()=>handleClick(d.ordrenr,handling)}>{knappetekst}</button></td>
                               </tr>)
                             })}
                             </tbody>
                             </table>
           </div>
    );
  }
}

export default Veggproduksjon;