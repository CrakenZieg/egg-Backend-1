import React, { Component } from 'react'
import Cards from './Cards';
/* import RickAndMortyService from './../../services/R&MService'; */

export class Main extends Component {
    /* necesito pasar las 'propiedades' del constructor de Main al de Component */
    /* constructor(props) {
        super(props);
        this.state = { items: [] };
        //console.log('Mensaje desde constructor de main'); Primero construye
    }
 */
    componentDidMount() {
        /* 
        En vez de pasar la lista como atributo hacemos que la pida cartas directamente como hook
        RickAndMortyService.getAllCharacters()
            .then((response) => { this.setState({ items: response.results }) })
            .catch((error) => { console.log(error) }); */
        //console.log('Mensaje desde mount de main'); Por ultimo monta
    }

    render() {
        //console.log('Mensaje desde render de main'); Despues renderiza
        return (
            <main>
                <section className="py-5 text-center container">
                    <div className="row py-lg-5">
                        <div className="col-lg-6 col-md-8 mx-auto">
                            <h1 className="fw-light">Album example</h1>
                            <p className="lead text-body-secondary">Something short and leading about the collection below—its contents, the creator, etc. Make it short and sweet, but not too short so folks don't simply skip over it entirely.</p>
                            <p>
                                <a href="#" className="btn btn-primary my-2">Main call to action</a>
                                <a href="#" className="btn btn-secondary my-2">Secondary action</a>
                            </p>
                        </div>
                    </div>
                </section>
                <Cards /* items={this.state.items} */></Cards>
            </main>
        )
    }
}

export default Main
