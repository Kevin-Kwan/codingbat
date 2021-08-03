def near_hundred(n):
  firstcheck=abs(100-n)
  secondcheck=abs(200-n)
  if firstcheck<=10 or secondcheck <=10:
    return True
  else:
    return False
