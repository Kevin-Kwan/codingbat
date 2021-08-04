def front3(str):
  if len(str)>=3:
    first3char=str[0:3]
    return first3char+first3char+first3char
  else:
    return str+str+str
