import React, {useState, useEffect} from 'react';
import BebidasService from '../services/BebidaService';

const Elemento = ({ elem }) => {

    const [item, setItem] = useState({});

    useEffect(() => {
        BebidasService.getBebidaPorId(elem)
            .then((response) => { setItem(response.drinks[0]); })
            .catch((error) => { console.log(error) });                    
        }, [elem]);

    return (
        <div className="col">
            <div className="card">
                <img src={item.strDrinkThumb} className="card-img-top" alt="..." />
                <div className="card-body">
                    <h4 className="card-title">{item.strDrink}</h4>
                    <p className="card-text">{item.idDrink}</p>
                </div>               
            </div>
        </div>
    )
}

export default Elemento;

/* BebidasService.getBebidaPorId(e.idDrink) */