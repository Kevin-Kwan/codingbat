public int bigDiff(int[] nums) {
  Arrays.sort(nums);
  int a=nums[nums.length-1]-nums[0];
  return a;
}
