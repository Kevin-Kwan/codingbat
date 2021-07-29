public int countClumps(int[] nums) {
  boolean clump=false;
  int clumps=0;
  for (int i=0;i<nums.length-1;i++)
  {
  if (nums[i] == nums[i+1] && clump==false)
  {
  clump = true;
  clumps++;
  }
  else if (nums[i] != nums[i+1])
  {
  clump = false;
}}
  return clumps;
}
