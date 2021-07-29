public int matchUp(String[] a, String[] b) {
  int i=0;
  for (int j=0;j<a.length;j++)
  {
  if (a[j].length()==0 ||  b[j].length()==0)
  {
  if (a[j].equals(b[j]))
  i=i;
  }
  else
  {
    if (a[j].charAt(0)==b[j].charAt(0))
    i++;
  }
  
  }
  return i;
}
