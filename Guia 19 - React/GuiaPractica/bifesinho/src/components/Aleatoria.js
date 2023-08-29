import React, { useState, useEffect } from 'react';
import BebidasService from '../services/BebidaService';
import { Link } from 'react-router-dom';

export default function Aleatoria() {

    const [item, setItem] = useState({});
    const [links, setLinks] = useState([]);

    useEffect(() => {
        BebidasService.getBebidaAleatoria()
            .then((response) => { setItem(response.drinks[0]); })
            .catch((error) => { console.log(error) });
    }, []);

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
        <div className="container my-3">
            <div className="card">
                <div className="row g-0">
                    <div className="col-md-4">
                        <img src={item.strDrinkThumb} className="img-fluid rounded-start border-end border-secondary-subtle" alt={item.strDrink} />
                    </div>
                    <div className="col-md-8">
                        <div className="card-body">
                            <div className='d-flex flex-wrap justify-content-between'>
                                <h4 className="card-title">{item.strDrink}</h4>
                                <Link to={`/`} className="nav-link">
                                    <button type="button" className="btn btn-outline-dark me-2"><i className="fa fa-arrow-circle-left" aria-hidden="true"></i> Volver</button>
                                </Link>
                            </div>
                            <p className="card-text">{(item.strInstructionsES != null) ? item.strInstructionsES : item.strInstructions}</p>
                            <p className="card-text" hidden={item.strGlass == null}><small className="text-body-secondary">{item.strGlass}</small></p>
                        </div>
                        <div className="card-footer">
                            <h6>Ingredientes: </h6>
                            <ul>
                                {links}
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}