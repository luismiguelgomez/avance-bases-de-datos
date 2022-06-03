import { createSignal, onMount } from 'solid-js';

import ProductSimple from './ProductSimple';

//Had to check out MDN docs to remember how fetch is used: https://developer.mozilla.org/es/docs/Web/API/Fetch_API/Using_Fetch

let loaded = false;

const ProductList = (props: any) => {
  const [getProducts, setProducts] = createSignal([]);

  const getAllProducts = async () => {
    await fetch('https://fakestoreapi.com/products')
      .then((response) => response.json())
      .then((responseJSON) => setProducts(responseJSON));
  };

  onMount(() => {
    getAllProducts();
    loaded = true;
  });

  //https://www.solidjs.com/docs/latest/api#createresource

  return (
    <div class="bg-gray-200 flex flex-col space-y-5 border-2border-dashed border-gray-400/40 rounded-md bg-white mx-8 p-5 h-full">
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
