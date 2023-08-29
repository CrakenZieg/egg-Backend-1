import React, { useEffect, useState } from 'react';
import Elemento from './Elemento';
import BebidasService from '../services/BebidaService';

export default function Elementos() {

    const [items, setItems] = useState([]);
    const [lista, setLista] = useState([
        Math.floor(Math.random() * 5), Math.floor(Math.random() * 5) + 5, Math.floor(Math.random() * 5) + 10, Math.floor(Math.random() * 5) + 15,
        Math.floor(Math.random() * 5) + 20, Math.floor(Math.random() * 5) + 25, Math.floor(Math.random() * 5) + 30, Math.floor(Math.random() * 5) + 35,
        Math.floor(Math.random() * 5) + 40, Math.floor(Math.random() * 5) + 45, Math.floor(Math.random() * 5) + 50, Math.floor(Math.random() * 5) + 55,
        Math.floor(Math.random() * 5) + 60, Math.floor(Math.random() * 5) + 65, Math.floor(Math.random() * 5) + 70, Math.floor(Math.random() * 5) + 75,
        Math.floor(Math.random() * 5) + 80, Math.floor(Math.random() * 5) + 85, Math.floor(Math.random() * 5) + 90, Math.floor(Math.random() * 5) + 95,
    ])

    useEffect(() => {
        BebidasService.getBebida()
            .then((response) => {
                setItems(
                    lista.map((e) => { return response.drinks[e] })
                );
            })
            .catch((error) => { console.log(error) });
    }, []);

    const listaMain = items.filter((e)=>(e!=null&&e!==undefined)).map((e) => { return <Elemento elem={e.idDrink} key={e.idDrink} /> });

    return (
        <div className="row row-cols-2 row-cols-md-3 g-4">
            {listaMain}
        </div>
    )
}
