import React, { useState } from 'react'

const Footer = () => {

/* Los functionalComponent generalmente tienen esta estructura */
/* Definimos una variable de estado y una de setteo de ese estado */
    const [clicks, setClicks] = useState(0); //useState es el hook entre 'clicks' y 'setClicks'

    const year = new Date().getFullYear();
    const name = "Peludo's Inc.";

    const handleClick = () => {
        setClicks(clicks + 1);
    };

    return (
        <div className="container">
            <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
                <div className="col-md-4 d-flex align-items-center">
                    <a href="/" className="mb-3 me-2 mb-md-0 text-body-secondary text-decoration-none lh-1">
                        <img className="border border-white rounded-circle" src="./assets/eu.png" width="40px" height="auto" alt="eu" />
                    </a>
                    <span className="mb-3 mb-md-0 text-body-secondary"
                        onClick={handleClick}
                    >&copy; {year} {name} =&gt; Clicks: {clicks}</span>
                </div>

                <ul className="nav col-md-4 justify-content-end list-unstyled d-flex">
                    <li className="ms-3"><a className="text-body-secondary" href="#"><img className="border border-white rounded-circle" src="./assets/eu.png" width="40px" height="auto" alt="eu" /></a></li>
                    <li className="ms-3"><a className="text-body-secondary" href="#"><img className="border border-white rounded-circle" src="./assets/eu.png" width="40px" height="auto" alt="eu" /></a></li>
                    <li className="ms-3"><a className="text-body-secondary" href="#"><img className="border border-white rounded-circle" src="./assets/eu.png" width="40px" height="auto" alt="eu" /></a></li>
                </ul>
            </footer>
        </div>
    )
}

export default Footer;
