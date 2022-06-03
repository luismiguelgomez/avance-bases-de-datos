import { useParams } from 'solid-app-router';
import { createResource } from 'solid-js/types/reactive/signal';
import '../App.css';
import Nav from '../Components/Nav';

const Product = () => {
  const params = useParams();

  const [productData] = createResource(
    () => params.id,
    () => {}
  );

  //https://www.solidjs.com/docs/latest/api#createresource
  //https://github.com/solidjs/solid-app-router#dynamic-routes
  //https://fakestoreapi.com/products/1

  return (
    <div>
      <div>Este es el producto #{params.id}</div>;
    </div>
  );
};

export default Product;
