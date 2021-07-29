public int[] maxEnd3(int[] nums) {
  
if (nums[2]>=nums[0])
{
  nums[1]=nums[2];
  nums[0]=nums[2];
}
else if (nums[0]>=nums[2])
 {
  nums[1]=nums[0];
  nums[2]=nums[0];
 }
  else
 { return nums;
   
 }
 return nums;
}
