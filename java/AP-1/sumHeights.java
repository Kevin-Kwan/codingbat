public int sumHeights(int[] heights, int start, int end) {
  int a=0;
  for (int i=start;i<end;i++) {
  a+=Math.abs(heights[i]-heights[i+1]);}
  return a;
}
