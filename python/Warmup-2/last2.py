def last2(str):
  if len(str)<2:
    return 0
  last2=str[len(str)-2:]
  endResult=0
  for i in range(len(str)-2):
    substringCheck=str[i:i+2]
    if substringCheck==last2:
      endResult+=1
  return endResult
  # start at 0, make it stop at len(str)-2
