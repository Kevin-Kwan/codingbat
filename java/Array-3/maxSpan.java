public int maxSpan(int[] nums) {
  int what=0;
  int amount=0;
  int count=0;
  int span=0;
  int number=0;
  int start=0;
  for (int i=0;i<nums.length;i++)
  {
  for (int j=0;j<nums.length;j++)
  {
  {
  if (nums[j]==nums[i])
  what=j-i+1;
  span=Math.max(what,span);
}
}
}
  return span;
}
