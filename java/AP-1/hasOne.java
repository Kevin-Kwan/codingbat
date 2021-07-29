public boolean hasOne(int n) {
  boolean  digit=false;
  boolean checked=false;
  int i=0;
  while (i<=Integer.toString(n).length())
  {if (n%10==1)
  {
  return true;
  }
  n=n/10;
  i++;
  }
  return checked;
}
