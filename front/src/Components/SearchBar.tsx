import SearchGlass from '../Icoms/SearchGlass'

const SearchBar = () => {

  let searchBar;

  return (
    <div class="relative z-0 flex w-full -space-x-px">
      <div class="relative w-full">
        <SearchGlass/>
        <label for="search-button" class="sr-only"></label>
        <input
          ref={searchBar}
          id="search-button"
          type="search"
          placeholder="Guaro.."
          class="block w-full rounded-l-md border-gray-200 pl-10 text-sm transition focus:border-blue-600 focus:ring-blue-600 disabled:cursor-not-allowed disabled:bg-gray-200 disabled:opacity-75"
        />
      </div>
      <button
        type="submit"
        onClick ={()=>{location.href = `/search?q=${searchBar.value}`;}}
        class="inline-flex w-auto cursor-pointer select-none appearance-none items-center justify-center space-x-1 rounded-r border border-gray-200 bg-white px-3 py-2 text-sm font-medium text-gray-800 transition hover:border-gray-300 hover:bg-gray-100 focus:z-10 focus:border-gray-300 focus:outline-none focus:ring-2 focus:ring-gray-300"
      >
        Search
      </button>
    </div>
  );
};

export default SearchBar;
