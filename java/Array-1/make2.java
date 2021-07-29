public int[] make2(int[] a, int[] b) {
  
  int ab=0;
  int bb=0;
  if (a.length<1)
  {
  ab=b[0];
  bb=b[1];
  }
  else if (a.length==1)
  {
  ab=a[0];
  bb=b[0];
  }
  else
  {
  ab=a[0];
  bb=a[1];
  }
  int[]two={ab,bb};
  return two;
}
