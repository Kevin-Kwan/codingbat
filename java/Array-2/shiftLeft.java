public int[] shiftLeft(int[] nums) {
  int size=nums.length;
  int[] what=new int[size];
  if (size!=0)
  what[size-1]=nums[0];
  for (int i=1;i<what.length;i++)
  what[i-1]=nums[i];
  return what;
}
