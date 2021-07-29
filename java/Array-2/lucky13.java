public boolean lucky13(int[] nums) {
  boolean hi=true;
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]==1||nums[i]==3)
  {
    hi=false;
  }
  
  }
return hi;
  
}
