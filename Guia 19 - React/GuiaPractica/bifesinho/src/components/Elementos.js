import React, { useEffect, useState } from 'react';
import Elemento from './Elemento';
import BebidasService from '../services/BebidaService';

export default function Elementos() {

    const [items, setItems] = useState([]);
    const [alea, setAlea] = useState(Math.floor(Math.random()*10));

    useEffect(() => {
        BebidasService.getBebida()
            .then((response) => { setItems(response.drinks); })            
            .catch((error) => { console.log(error) });                    
        }, []);   
        
    /* 
    setItems(items.concat(response.drinks)) 
    
    .then(()=>{
        for(let i=0; i<15;i++){
        seleccion.push(items[Math.floor(Math.random()*100)]);
        console.log(seleccion)
    }})
    */

    const listaMain = items.filter(elem=>(elem.idDrink%alea===0)).map((e)=>{return <Elemento elem={e.idDrink} key={e.id}/>}); 
    
    return (
        <div className="row row-cols-2 row-cols-md-3 g-4">
           {listaMain}
        </div>
    )
}
