public int[] front11(int[] a, int[] b) {
  int ab=0;
  int bb=0;
  if (a.length==0&&b.length==0)
  {
  
  int[]one={};
  return one;
  }
  else if (a.length==0)
  {
  ab=b[0];
  int[]one={ab};
  return one;
  }
  else if (b.length==0)
  {
  ab=a[0];
  int[]one={ab};
  return one;
  }
  if (a.length>=1&&b.length>=1)
  {
  ab=a[0];
  bb=b[0];
  int[]two={ab,bb};
  return two;
  }
return a;
}
