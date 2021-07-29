public boolean no14(int[] nums) {
  boolean what=false;
  boolean what2=false;

  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]==1)
  what=true;
  }
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]==4)
  what2=true;
  }
  if (what2&&what)
  return false;
  else
  return true;
}
