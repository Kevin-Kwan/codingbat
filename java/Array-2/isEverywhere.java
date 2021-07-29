public boolean isEverywhere(int[] nums, int val) {
  boolean yes=true;
for (int i = 0; i <nums.length-1;i++)
{
if ( nums[i] != val && nums[i+1] != val)
yes = false;
}
  return yes;
}
