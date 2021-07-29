
  // tbh i give up
  //int[] array=new int[n*n];
  //for (int i=n;i>=0;i--)
  //for (int j=n-1;j>=0;j--)
 // for (int k=0;k<=n;k++)
 // array[i*j+k-1]=i;
 // return array;
  //comments above were made in 2019 lol
// 2021: back then, i dont think i really understood the question and just gave up and copied/pasted the code below lol
  
  public int[] squareUp(int n) {
  int[] result = new int[n * n];
  int x = n-1, pass = 1, index = 0;
  if(n == 0) { return result; }
  for(int i = n-1; i < result.length; i+=n) {
     index = i;
     for(int k = 1; k <= pass; k++) {
       if(k == 0) { break; }
       result[index] = k;
       index--;
     }
     pass++;
  }
  return result;
}
