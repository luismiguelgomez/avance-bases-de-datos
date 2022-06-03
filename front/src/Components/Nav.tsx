import logo from '../logo.svg';
import BurgerIcom from '../Icoms/BurgerIcom';

const ProductSimple = (props: any) => {
  return (
    <header>
      <div class="mx-auto flex max-w-7xl items-center justify-between p-4">
        <nav
          id="routes"
          class="hidden items-center space-x-1 text-sm font-medium text-gray-800 md:flex"
        >
          <a
            href="#"
            class="rounded bg-white px-3 py-2 transition hover:bg-gray-100"
          >
            Home
          </a>
          <input
            type="text"
            class="block w-full rounded-md border-gray-200 text-md transition focus:border-blue-600 focus:ring-blue-600 disabled:cursor-not-allowed disabled:bg-gray-200 disabled:opacity-75"
          ></input>
        </nav>
        <button class="flex appearance-none p-1 text-gray-500 md:hidden">
          <BurgerIcom />
        </button>
        <div id="Logo" class="flex flex-row space-x-4 items-center">
          <img src={logo} class="w-10" alt="logo" />
          Samurai Buy
        </div>
        <nav
          id="account"
          class="flex items-center space-x-1 text-sm font-medium text-gray-800"
        >
          <a
            href="#"
            class="hidden rounded bg-white px-3 py-2 transition hover:bg-gray-100 sm:inline"
          >
            Login
          </a>
          <a
            href="#"
            class="rounded bg-rose-600 px-3 py-2 text-white transition hover:bg-rose-700"
          >
            Sign Up
          </a>
        </nav>
      </div>
    </header>
  );
};

export default ProductSimple;
