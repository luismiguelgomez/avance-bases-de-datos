import { createSignal, onMount } from 'solid-js';
import { useParams } from 'solid-app-router';

import ProductSimple from './ProductSimple';
import search from '../Handlers/searchHandler';

//Had to check out MDN docs to remember how fetch is used: https://developer.mozilla.org/es/docs/Web/API/Fetch_API/Using_Fetch

let loaded = false;

const ProductList = (props: any) => {
  const [getProducts, setProducts] = createSignal([]);
  const params = useParams();
  let query;
  params.query ? (query = params.query.split('&')) : (query = query);

  const fetchProducts = async () => {
    await fetch('https://fakestoreapi.com/products')
      .then((response) => response.json())
      .then((responseJSON) => setProducts(responseJSON))
      .then(() => console.log('NO HUBO QUERY JUEPUTA'));
  };

  const searchProducts = async () => {
    await fetch('https://fakestoreapi.com/products')
      .then((response) => response.json())
      .then((responseJSON) => {
        setProducts(
          search(responseJSON, ['title'], query[0]).map((result) => result.item)
        );
      });
  };

  onMount(() => {
    params.query ? searchProducts() : fetchProducts();
    loaded = true;
  });

  return (
    <div class="bg-gray-200 flex flex-col space-y-5 border-gray-400/40 rounded-md bg-white mx-8 p-5 h-full">
      {getProducts().map((product) => (
        <ProductSimple
          id={'product' + product.id}
          name={product.title}
          price={product.price}
          img={product.image}
          loaded={loaded}
        />
      ))}
    </div>
  );
};
export default ProductList;
