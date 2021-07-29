public int sum13(int[] nums) {
int sum=0;
  if (nums.length==0)
  return 0;
  else
  for (int i=0;i<nums.length;i++)
{sum+=nums[i];
if (nums[i]==13)
{sum-=13;
i++;
}}
  if (nums.length==0)
  return 0;
 return sum; 
}
