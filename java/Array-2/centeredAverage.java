public int centeredAverage(int[] nums) {
  int max=nums[0];
  int min=nums[0];
  int sum=0;
  for (int i=0;i<nums.length;i++)
  {
  sum+=nums[i];
  min=Math.min(min,nums[i]);
  max=Math.max(max,nums[i]);
}
  sum=sum-max-min;
  return sum/(nums.length-2);
}
