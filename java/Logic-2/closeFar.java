public boolean closeFar(int a, int b, int c) {
   if (Math.abs(c-a)>=2&&Math.abs(c-b)>=2||Math.abs(b-a)>=2&&Math.abs(b-c)>=2||Math.abs(a-b)>=2&&Math.abs(a-c)>=2)
return true;
else
return false;
  
}
