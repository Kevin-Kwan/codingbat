def string_splosion(str):
  i=0
  endString=""
  for i in range(0,len(str)+1,1):
    endString+=str[0:i]
  return endString
