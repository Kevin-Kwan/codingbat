public boolean tripleUp(int[] nums) {
  boolean what=false;
  for (int i=nums.length-1;i>=2;i--)
  if (nums[i]-1==nums[i-1]&&nums[i-2]==nums[i-1]-1)
  what=true;
  return what;
}
