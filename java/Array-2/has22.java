public boolean has22(int[] nums) {
  boolean yes=false;
  for (int i=0;i<nums.length-1;i++)
  {
  if (nums[i]==2&&nums[i+1]==2)
  {
  yes=true;
  break;
  }
  }
  return yes;
}
