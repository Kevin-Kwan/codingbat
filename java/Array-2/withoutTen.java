public int[] withoutTen(int[] nums) {
  int[] hi=new int[nums.length];
  int ii=0;
  int j=1;
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]!=10){
      hi[ii]=nums[i];
      ii++;}
  if(nums[i]==10)
  {
  hi[nums.length-j]=0;
  j++;
  }}
  return hi;
}
