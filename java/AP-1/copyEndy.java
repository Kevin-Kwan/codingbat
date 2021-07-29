public int[] copyEndy(int[] nums, int count) {
  int[] array=new int[count];
  int start =0;
  for(int i=0;i<nums.length;i++){
  if(((nums[i]>=0&&nums[i]<=10)||(nums[i]>=90&&nums[i]<=100))&&start<count)
  {
  array[start]=(nums[i]);
  start++;}
  }
  return array;
}
