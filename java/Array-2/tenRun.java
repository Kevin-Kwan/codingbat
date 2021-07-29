public int[] tenRun(int[] nums) {
  boolean stop=false;
  int what=0;
for (int i=0;i<nums.length;i++)
{
    if (nums[i] % 10 == 0) {
      what = nums[i];
      stop = true;
    }
    else if (nums[i] % 10 != 0 && stop) {
      nums[i] = what;
    }
  }
  return nums;
}
