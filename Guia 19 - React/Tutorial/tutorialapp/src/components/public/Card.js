import React from 'react';
import { Link } from 'react-router-dom';

const Card = ({ item }) => {
    return (
        <div className="col">
            <div className="card shadow-sm">
                <img className="bd-placeholder-img card-img-top" src={item.image} width="100%" height="auto" alt="personaje" />
                <div className="card-body">
                    <strong className="d-inline-block mb-2 text-success">{item.species} - {item.origin.name}</strong>
                    <h3 className='ml-3 text-dark'>{item.name}</h3>
                    <p className="card-text">Cantidad de episodios: {item.episode.length}</p>
                    <p className="card-text">Primer episodio: <a href={item.episode[0]} className="text-danger">{item.episode[0]}</a></p>
                    <p className="card-text">Ultimo episodio: <a href={item.episode[item.episode.length-1]} className="text-danger">{item.episode[item.episode.length-1]}</a></p>
                    <div className="d-flex justify-content-between align-items-center">
                        <div className="btn-group">
                            <button type="button" className="btn btn-sm btn-outline-secondary">
                                <Link to={`/details/${item.id}`} className="nav-link">
                                    Detalles
                                </Link>
                            </button>
                        </div>
                        <small className="text-body-secondary">9 mins</small>                        
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Card
