def string_bits(str):
  i=0
  endString=""
  for i in range(0,len(str),2):
    endString+=str[i]
  return endString
