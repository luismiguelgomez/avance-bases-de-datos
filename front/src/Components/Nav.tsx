import logo from '../logo.svg';
import BurgerMenu from '../Icoms/BurgerMenu';
import SearchBar from './SearchBar';
import Select from './Select';

const Nav = (props: any) => {
  return (
    <header>
      <div class="mx-auto flex max-w-7xl items-center justify-between p-4">
        <nav
          id="routes"
          class="hidden items-center space-x-1 text-sm font-medium text-gray-800 md:flex"
        >
          <SearchBar />
          <Select />
        </nav>
        <button class="flex appearance-none p-1 text-gray-500 md:hidden">
          <BurgerMenu />
        </button>
        <div id="Logo" class="flex flex-row space-x-4 items-center">
          <img src={logo} class="w-10 hue-rotate-60" alt="logo" />
          Solid Store
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

export default Nav;
