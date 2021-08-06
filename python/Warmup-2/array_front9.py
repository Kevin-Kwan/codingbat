def array_front9(nums):
  if len(nums)==0:
    return False
  count=len(nums)
  if count>4:
    count=4
  for i in range(count):
    if nums[i]==9:
      return True
  return False
