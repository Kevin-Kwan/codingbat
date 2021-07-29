public int[] evenOdd(int[] nums) {
    int k=0;
    int j=nums.length-1;
  int[] num=new int[nums.length];
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]%2==0)
  {
num[k]=nums[i];
k++;
  
}
  else
{
  num[j]=nums[i];
  j--;
}}
  return num;
}
