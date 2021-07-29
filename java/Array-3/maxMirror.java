public int maxMirror(int[] nums) {
int max = 0;
for (int i=0;i<nums.length;i++)
for (int j=max+1;j<nums.length-i+1;j++)
for (int k=i;k<nums.length-j+1;k++)
{
  boolean what= true;
for (int idk = 0; what && idk < j; idk++)
what=nums[i+idk]==nums[k+j-idk-1];
if (what)
max=j;
}
return max;
}
