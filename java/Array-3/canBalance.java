public boolean canBalance(int[] nums) {
  int sum=0;
  int sum2=0;
  for (int i=0;i<nums.length;i++)
  {
  sum+=nums[i];
  for (int j=nums.length-1;j>i;j--){
  sum2+=nums[j];}
  if (sum==sum2)
  {
  return true;}
  sum2=0;
}

  return false;
}
