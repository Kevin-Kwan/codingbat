public int[] pre4(int[] nums) {
  int position=0;
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]==4)
  {
  position=i;
  break;
  }
}
  int[] array=new int[position];
for (int j=0;j<position;j++)
array[j]=nums[j];
return array;
}
