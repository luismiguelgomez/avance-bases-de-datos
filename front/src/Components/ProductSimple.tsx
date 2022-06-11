const ProductSimple = (props: any) => {
  return (
    <div class="ProductSimple bg-white flex flex-row rounded-md md:mx-8 md:max-h-44 max-h-24 shadow-sm">
      <img class="md:w-40 w-20 object-cover rounded-md" src={props.img} />
      <div class="flex flex-row w-full px-5 py-1 truncate">
        <div class="text-xl w-full text-left truncate md:text-2xl">
          {props.name}
        </div>
        <div class="md:text-3xl text-xl w-48 text-right">$ {props.price}</div>
      </div>
    </div>
  );
};

export default ProductSimple;
