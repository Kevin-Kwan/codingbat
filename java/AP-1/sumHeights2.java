public int sumHeights2(int[] heights, int start, int end) {
  int a=0;
  for (int i=start;i<end;i++)
  if(heights[i + 1] > heights[i])
  a+=(Math.abs(heights[i]-heights[i+1])*2);
  else
  a+=(Math.abs(heights[i]-heights[i+1]));
  return a;
}
