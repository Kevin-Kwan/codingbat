public boolean only14(int[] nums) {
  boolean a=true;;
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]==1||nums[i]==4)
  {
  a=true;
  continue;
  }
  else
  {
  a=false;
  }
  break;
  
}
  return a;
}
