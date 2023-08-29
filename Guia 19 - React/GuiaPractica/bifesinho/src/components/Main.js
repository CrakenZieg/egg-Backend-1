import React, { Component } from 'react'
import Elementos from './Elementos';
import { Link } from 'react-router-dom';

export class Main extends Component {

    render() {
        return (
            <main>
                <section className="py-5 text-center container">
                    <div className="row py-lg-5">
                        <div className="col-lg-6 col-md-8 mx-auto">
                            <h1 className="fw-light">Tomate algo</h1>
                            <img src="https://media.giphy.com/media/TcdpZwYDPlWXC/giphy.gif" alt="Gandalf" />
                            <p className="lead text-body-secondary"><i>"A drink is never late nor is it early, it arrives precisely when it needs to"</i><br />Gandalf the Grey</p>
                            <p className="btn btn-success my-2">
                                <Link to={`/aleatoria`} className="nav-link">
                                    Bebida Aleatoria
                                </Link>
                            </p>
                        </div>
                    </div>
                </section>
                <Elementos></Elementos>
            </main>
        )
    }
}

export default Main
