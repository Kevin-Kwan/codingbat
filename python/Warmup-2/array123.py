def array123(nums):
  if len(nums)<3:
    return False
  length=len(nums)
  for i in range(length-2):
    if nums[i]==1:
      if nums[i+1]==2:
        if nums[i+2]==3:
          return True;
  return False;
