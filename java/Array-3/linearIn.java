public boolean linearIn(int[] outer, int[] inner) {
  if (inner.length==0)
  {
  return true;
  }
   int k = 0;
  for(int i = 0; i < outer.length; i++) 
  {
  if(outer[i] == inner[k]) {
  k++;}
 else if(outer[i] > inner[k]) {
        return false;
     }
    
     if(k == inner.length)
        return true;
  }
     
  return false;
}
