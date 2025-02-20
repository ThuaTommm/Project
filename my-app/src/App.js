import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';// Switch -> Routes 
import Home from './pages/Home';
import Falseposition from './pages/Falseposition';
import Bisection from './pages/Bisection';
import Newton from './pages/Newton';

function App() {
  return (
   <>
    <Router>
      <Navbar />
      <Routes>
        <Route path='/' element={<Home/>} />
        <Route path='/Falseposition' element={<Falseposition/>} />
        <Route path='/Bisection' element={<Bisection/>} />
        <Route path='/Newton_Raphson' element={<Newton/>} />
      </Routes>
    </Router>
   </>
  );
}

export default App;
