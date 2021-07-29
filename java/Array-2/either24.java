public boolean either24(int[] nums) {
  boolean four=false;
  boolean two=false;
  for (int i=0;i<nums.length-1;i++)
  {
  if (nums[i]==2&&nums[i+1]==2)
  two=true;
  if (nums[i]==4&&nums[i+1]==4)
  four=true;
  }
  if (two && four)
  return false;
  else if (two || four)
  return true;
  else
  return false;
}

