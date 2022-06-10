import { useParams } from 'solid-app-router';
import { createResource, createSignal } from 'solid-js';
import Spinner from './Spinner';
import PrimaryButton from './PrimaryButton';
import BreadCaret from '../Icoms/BreadCaret';
import '../App.css';

const ProductDetail = () => {
  const [getProduct, setProduct] = createSignal({title: '', category: '', image: '', price: 0, description: ''});

  const fetchProduct = async (id: any) => {
    await fetch(`https://fakestoreapi.com/products/${id}`)
      .then((response) => response.json())
      .then((responseJSON) => setProduct(responseJSON));
  };

  const params = useParams();
  //TODO: productData -> USELESS
  const [] = createResource(params.id, fetchProduct);

  //https://www.solidjs.com/docs/latest/api#createresource
  //https://github.com/solidjs/solid-app-router#dynamic-routes
  //https://fakestoreapi.com/products/1

  return (
    <div class="bg-white mx-3 py-6 px-5 rounded-md shadow-md">
      {getProduct().title ? (
        <div class="flex flex-col space-y-3">
          <div class="text-left text-xs md:text-sm flex flex-row space-x-1 items-center w-60 md:w-full h-4">
            <div>{getProduct().category}</div>
            <BreadCaret />
            <div class="truncate">{getProduct().title}</div>
          </div>
          <div class="text-xl break-words">{getProduct().title}</div>
          <div class="w-full flex flex-row justify-center">
            <img class="w-40 border rounded-md" src={getProduct().image} />
          </div>
          <div class="text-3xl break-words">{`$ ${getProduct().price}`}</div>
          <div></div>
          <div class="break-words">{getProduct().description}</div>
          <PrimaryButton>Comprar</PrimaryButton>
        </div>
      ) : (
        <div class="justify-center flex flex-row space-x-1">
          <Spinner />
          <div>Por favor, espere...</div>
        </div>
      )}
    </div>
  );
};

export default ProductDetail;
