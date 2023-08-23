import './App.css';
import Main from './components/public/Main';
import Detail from './components/public/Detail';
import UserForm from './components/public/UserForm';
import NavBar from './components/public/NavBar';
import Footer from './components/public/footer.js';
import { Routes, Route, Router } from 'react-router-dom';

function App() {
    return (
        <>
            <NavBar></NavBar>
            {/*-------------------------------------------*/}
            
                <Routes>
                    <Route exact path={'/'} element={<Main/>} />
                    <Route exact path={'/details/:id'} element={<Detail/>} />
                    <Route exact path={'/user-form'} element={<UserForm/>} />
                </Routes>
            
            {/*-------------------------------------------*/}
            <Footer></Footer>
        </>
    );
}

export default App;
