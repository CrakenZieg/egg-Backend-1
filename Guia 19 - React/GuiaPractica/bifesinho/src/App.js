import './App.css';
import Main from './components/Main';
import Ingrediente from './components/Ingrediente';
import Aleatoria from './components/Aleatoria';
import Bebida from './components/Bebida';
import UserForm from './components/UserForm';
import Header from './components/Header';
import Footer from './components/Footer.js';
import { Routes, Route} from 'react-router-dom';

function App() {
  return (
    <>
            <Header></Header>
            {/*-------------------------------------------*/}
            
                <Routes>
                    <Route exact path={'/'} element={<Main/>} />
                    <Route exact path={'/bebida/:id'} element={<Bebida/>} />
                    <Route exact path={'/aleatoria'} element={<Aleatoria/>} />
                    <Route exact path={'/ingrediente/:ing'} element={<Ingrediente/>} /> 
                    <Route exact path={'/user-form'} element={<UserForm/>} />
                </Routes>
        
            {/*-------------------------------------------*/}
            <Footer></Footer>
        </>
  );
}

export default App;
