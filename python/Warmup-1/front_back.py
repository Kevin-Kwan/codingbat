def front_back(str):
  if len(str)!=1 and len(str)!=None:
    endIndex=len(str)
    firstLetter=str[0:1]
    lastLetter=str[endIndex-1:endIndex]
    return lastLetter+str[1:-1]+firstLetter
  else:
    return str

# if you see that -1, it means you can count backwards from the end of the array
# you could also for endIndex-1
