import './App.css';
import { lazy } from 'solid-js';
import { Routes, Route, Navigate } from 'solid-app-router';
const Search = lazy(() => import('./Routes/Search'));
const Product = lazy(() => import('./Routes/Product'));

/* import Search from './Routes/Search';
import Product from './Routes/Product'; */

const App = () => {
  return (
    <Routes>
      <Route path="/search" element={<Search />} />
      <Route path="/search/:query" element={<Search />} />
      <Route path="/product/:id" element={<Product />} />
    </Routes>
  );
};

export default App;
