public boolean twoTwo(int[] nums) {
  boolean a=false;
  for (int i=0; i<nums.length;i++)
  {
  if (nums[i]==2)
  {
  if (nums.length>1&&i<nums.length-1&&nums[i+1]==2)
  {
  a=true;
  }else if (nums.length>1&&i>0&&nums[i-1]==2)
  {a=true;
  }else
  {return false;
  }}}
  
  return true;
}
