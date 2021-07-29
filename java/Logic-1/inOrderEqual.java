public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (a<b&&b<c)
  return true;
  else if (equalOk && (a<=b&&b<=c))
return true;  
  else
  return false;
}
