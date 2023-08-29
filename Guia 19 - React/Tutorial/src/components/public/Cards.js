import React, { useEffect, useState } from 'react';
import Card from './Card';
import RickAndMortyService from './../../services/R&MService';

/* podemos usar 'props' en los parametros y acceder a props.items o directamente asi */
const Cards = (/* { items } */) => {
    /*De nuevo, en vez de recibir un parametro, ahora vamos a pedir la lista usando un hook*/

    const [items, setItems] = useState([]);

    /* useEffect escucha el cambio en 'items' y corre de nuevo, basicamente se suscribe a cambios en 'items' 
        elimine items del [] de useEffect ya que hacia getAllCharacters constantemente
    */
    useEffect(() => {
        RickAndMortyService.getAllCharacters()
            .then((response) => { setItems( response.results ) })
            .catch((error) => { console.log(error) });
    }, [])

    const cardList = items.map((e) => <Card item={e} key={e.id} />);
    
    return (
        <div className="album py-5 bg-body-tertiary">
            <div className="container">
                <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    {cardList}
                </div>
            </div>
        </div>
    )
}

export default Cards
