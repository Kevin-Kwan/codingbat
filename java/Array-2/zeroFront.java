public int[] zeroFront(int[] nums) {
int what=0;
for (int i=0;i<nums.length;i++)
if (nums[i]==0){
nums[i] = nums[what];
nums[what] = 0;
what++;

}
  return nums;

}
