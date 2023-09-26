import React, { useEffect, useState } from 'react';
import { useParams, Link } from 'react-router-dom';
import Elemento from './Elemento';
import BebidaService from '../services/BebidaService';

export default function Ingrediente() {

    const [items, setItems] = useState([]);
    const { ing } = useParams();
    /* const [imag, setImag] = useState([]); */
    const [lista, setLista] = useState([
        Math.floor(Math.random() * 5), Math.floor(Math.random() * 5) + 5, Math.floor(Math.random() * 5) + 10, Math.floor(Math.random() * 5) + 15,
        Math.floor(Math.random() * 5) + 20, Math.floor(Math.random() * 5) + 25, Math.floor(Math.random() * 5) + 30, Math.floor(Math.random() * 5) + 35,
        Math.floor(Math.random() * 5) + 40, Math.floor(Math.random() * 5) + 45, Math.floor(Math.random() * 5) + 50, Math.floor(Math.random() * 5) + 55,
        Math.floor(Math.random() * 5) + 60, Math.floor(Math.random() * 5) + 65, Math.floor(Math.random() * 5) + 70, Math.floor(Math.random() * 5) + 75,
        Math.floor(Math.random() * 5) + 80, Math.floor(Math.random() * 5) + 85, Math.floor(Math.random() * 5) + 90, Math.floor(Math.random() * 5) + 95,
    ])

    useEffect(() => {
        BebidaService.getBebidaPorIngrediente(ing)
            .then((response) => {
                setItems(
                    lista.map((e) => { return response.drinks[e] })
                );
            })
            .catch((error) => { console.log(error) })
    }, [ing, lista])

    const listaIngredientes = items.filter((e) => (e != null && e !== undefined)).map((e) => { return <Elemento elem={e.idDrink} key={e.idDrink} /> });
    /* let limpio = ing.toString().replaceAll(' ', '%20');
    setImag(<img src={'www.thecocktaildb.com/images/ingredients/'+limpio+'-Medium.png'} alt={ing} className="img-fluid rounded"/>) */
    return (
        <section className="py-5 text-center container">
            <div className="row py-lg-3">
                <div className="col-lg-6 col-md-8 mx-auto">
                    <h1 className="fw-light">{ing}</h1>
                    {/* <img src={'www.thecocktaildb.com/images/ingredients/'+limpio+'-Medium.png'} alt={ing} className="img-fluid rounded"/> */}

                </div>
            </div>
            <div className="row py-lg-3 mb-2" >                
                <Link to={`/`} className="nav-link">
                    <button type="button" className="btn btn-outline-dark me-2"><i className="fa fa-arrow-circle-left" aria-hidden="true"></i> Volver</button>
                </Link>
            </div>
            <div className="row py-lg-3 row-cols-2 row-cols-md-4 g-4">
                {listaIngredientes}
            </div>
        </section>
    )
}
