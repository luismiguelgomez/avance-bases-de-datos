const PrimaryButton = (props: any) => {
  return (
    <button
      type="button"
      class="inline-flex w-auto cursor-pointer select-none appearance-none items-center justify-center space-x-1 rounded border border-[#6b337dff] bg-[#6b337dff] px-3 py-2 text-sm font-medium text-white transition hover:border-[#9d60c1ff] hover:bg-[#9d60c1ff] focus:border-[#cdb1f7ff] focus:outline-none focus:ring-2 focus:ring-[#cdb1f7ff]"
    >
      {props.children}
    </button>
  );
};

export default PrimaryButton;
