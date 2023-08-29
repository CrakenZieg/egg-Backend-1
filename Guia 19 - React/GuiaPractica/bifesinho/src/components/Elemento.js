import React, { useState, useEffect } from 'react';
import BebidasService from '../services/BebidaService';
import { Link } from 'react-router-dom';

const Elemento = ({ elem }) => {

    const [item, setItem] = useState({});
    const [links, setLinks] = useState([]);

    useEffect(() => {
        BebidasService.getBebidaPorId(elem)
            .then((response) => { setItem(response.drinks[0]); })
            .catch((error) => { console.log(error) });
    }, [elem]);

    useEffect(() => {
        let i = 1;
        let strng = []
        while (item[`strIngredient${i}`] != null) {
            let nombre = item[`strIngredient${i}`];
            let cant = (item[`strMeasure${i}`] != null) ? item[`strMeasure${i}`] : "-";
            let link = `/ingrediente/${nombre}`;
            strng.push(<li key={nombre + i}><Link to={link} className="dropdown-item">{nombre}: {cant}</Link></li>);
            i++;
        }
        setLinks(strng);
    }, [item]);

    return (
        <div className="col">
            <div className="card">
                <Link to={`/bebida/${item.idDrink}`}>
                    <img src={item.strDrinkThumb} className="card-img-top" alt={item.strDrink} />
                </Link>
                <div className="card-body">
                    <h4 className="card-title">{item.strDrink}</h4>
                </div>
                <div className="card-footer">
                    <div className="dropdown">
                        <button className="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Ingredientes
                        </button>
                        <ul className="dropdown-menu">
                            {links}
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Elemento;
