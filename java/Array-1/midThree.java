public int[] midThree(int[] nums) {
  int b=nums[nums.length/2];
  int a=nums[nums.length/2-1];
  int c=nums[nums.length/2+1];
  int[]thisArray={a, b, c};
  return thisArray;
}
