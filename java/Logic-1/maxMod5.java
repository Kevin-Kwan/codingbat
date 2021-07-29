public int maxMod5(int a, int b) {

  if (a==b)
  return 0;
  else if (b<a&&a%5==b%5)
  return b;
  else if (a<b&&a%5==b%5)
  return a;
  else if (a<b)
  return b;
  else
  return a;
}
