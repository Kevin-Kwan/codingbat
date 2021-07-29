public boolean haveThree(int[] nums) {
  int three=0;
  boolean what=true;
  
  for (int i=0;i<nums.length;i++)
  {
  if (nums[i]==3)
  three++;
}
for (int i=0;i<nums.length-1;i++)
  {
  if (nums[i]==3 &&nums[i+1]==3)
  what=false;
}
if (three==3&&what)
return true;
else
return false;
}
