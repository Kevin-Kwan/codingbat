public boolean lessBy10(int a, int b, int c) {
  if (a-10>=b||b-10>=a||c-10>=a||a-10>=c||b-10>=c||c-10>=b)
  return true;
  else
  return false;
}
