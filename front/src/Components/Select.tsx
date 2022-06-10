import { onMount, createSignal } from 'solid-js';

const Select = () => {
  const [getCategories, setCategories] = createSignal([]);

  const fetchCategories = async () => {
    await fetch('https://fakestoreapi.com/products/categories')
      .then((response) => response.json())
      .then((responseJSON) => {
        setCategories(responseJSON);
      });
  };

  onMount(() => {
    fetchCategories();
  });

  return (
    <div class="block space-y-0.5 text-left">
      <select
        id="basic"
        name="basic"
        class="w-44 truncate rounded-md border-gray-200 pr-8 text-sm transition focus:border-blue-600 focus:ring-blue-600 disabled:cursor-not-allowed disabled:bg-gray-200 disabled:opacity-75"
      >
        {getCategories().map((opt) => (
          <option>{opt}</option>
        ))}
      </select>
    </div>
  );
};

export default Select;
