public boolean modThree(int[] nums) {
  boolean a=false;
    for (int i=0;i<nums.length-2;i++)
    {
    if ((nums[i]%2==0&&nums[i+1]%2==0&&nums[i+2]%2==0)||(nums[i]%2==1&&nums[i+1]%2==1&&nums[i+2]%2==1))
a=true;
else
{
continue;
}
break;
}
return a;
    
}
