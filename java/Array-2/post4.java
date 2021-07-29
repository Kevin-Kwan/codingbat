public int[] post4(int[] nums) {
for (int i=nums.length-1;i>=0;i--)
{
if (nums[i]==4)
{
int[] what=new int[nums.length-i-1];
for (int j=0;j<what.length;j++)
{
what[j] = nums[i+j+1];
}
return what;
}
}
int[] lol=new int[0];
return lol;
}
