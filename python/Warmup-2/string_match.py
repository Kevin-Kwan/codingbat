def string_match(a, b):
  count=0
  for i in range(len(a)-1):
    subA=a[i:i+2]
    subB=b[i:i+2]
    if subB==subA:
      count+=1
  return count
