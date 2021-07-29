public int[] seriesUp(int n) {
  int start=0;
  int[] array = new int[n*(n + 1)/2];
  for (int i=1;i<=n;i++)
  {
    for (int k=1; k<= i;k++)
{array[start]=k;
start++;
}}
return array;
  
}
