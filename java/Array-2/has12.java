public boolean has12(int[] nums) {
  boolean one=false;
  boolean two=false;
  for (int i=0;i<nums.length;i++)
  {
if (nums[i]==1)
{
one=true;
}
if (one)
{
for (int j=nums.length-1;j>i;j--)
{
  if (nums[j]==2)
  {
two=true;
}}}}
if (one&&two)
return true;
else
return false;
  
}
