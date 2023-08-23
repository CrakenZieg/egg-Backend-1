import React, {useState, useEffect} from 'react'
import { Link } from 'react-router-dom'
import { useUserForm } from '../../hooks/Customs.hooks'
import UserService  from './../../services/UserService'

const UserForm = () => {
    /* recupera la informacion del formulario */
    const{ form, setForm, handleChanges } = useUserForm();
    /* mira que las contraseñas sean iguales */ 
    const [areEquals, setAreEquals] = useState(true);
    /* confirmacion del usuario */
    const [passwordConfirmation, setPasswordConfirmation] = useState('');
    /* maneja el submit */
    const handleSubmit = (event) => {
        event.preventDefault();
        UserService.save(form);
    }
    /* control de los passwords */
    const handlePasswordConfirmation = (input) => {
        setPasswordConfirmation(input.target.value);
    }
    /* cada vez que cambia passwordConfirmation lo compara con el valor password de form y settea sin son iguales */
    useEffect(() => {
        const { password } = form;
        setAreEquals(password === passwordConfirmation && passwordConfirmation.lenght!==0)        
    }, [passwordConfirmation, form]);

    return (
        <div className='w-25 mx-auto mt-5'>
            <h4 className='mb-3'>Registrate:</h4>
            <form className='needs-validation' noValidate>
                <div className='row g-3'>
                    <div className='col-12'>
                        <label htmlFor="email" className='form-label'>
                            Email:
                        </label>
                        <input
                            type="email"
                            className='form-control'
                            name="email"
                            placeholder='email'
                            onChange={handleChanges}
                        />
                    </div>
                    <div className='col-12'>
                        <label htmlFor="password" className='form-label'>
                            Constraseña:
                        </label>
                        <input
                            type="password"
                            className='form-control'
                            name="password"
                            placeholder='Constraseña'
                            onChange={handleChanges}
                        />
                    </div>
                    <div className='col-12'>
                        <label htmlFor="password2" className='form-label'>
                            Repetir constraseña:
                        </label>
                        <input
                            type="password"
                            className='form-control'
                            placeholder='Repetir constraseña'
                            onChange={handlePasswordConfirmation}
                        />
                    </div>
                    { !areEquals && (
                        <div className='form-text list-group-item-danger'>
                            Las contraseñas deben ser iguales!
                        </div>
                    )}
                    <hr className='my-3' />
                    <div className="btn-group">
                        <button type="button" className="w-100 btn btn-secondary btn-lg">
                            <Link to={`/`} className="nav-link">
                                <i className="fa fa-arrow-left" aria-hidden="true"></i> Volver
                            </Link>
                        </button>
                        <button
                            className='w-100 btn btn-primary btn-lg'
                            type="submit"
                            disabled={!areEquals}
                            onClick={handleSubmit}
                        >
                            <i className="fa fa-save" aria-hidden="true"></i> Guardar
                        </button>
                    </div>
                </div>
            </form>
        </div>
    )
}

export default UserForm
