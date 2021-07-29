public int[] notAlone(int[] nums, int val) {
  boolean alone=false;
  boolean alone1=false;
  int max=0;
  for (int i=1;i<nums.length-1;i++)
  {
   if (nums[nums.length-1]==val)
   nums[nums.length-1]=val;
   if (nums[0]==val)
   nums[0]=val;
  if (nums[i]==val)
  {
  if (nums[i-1]!=val)
  alone=true;
  if (nums[i+1]!=val)
  alone1=true;
   }
   if (alone&&alone1)
   {
   max=Math.max(nums[i-1],nums[i+1]);
      nums[i]=max;
   }
      if (alone==false&&alone1==false)
  {
      nums[i]=nums[i];
  }
  }
  return nums;
}
