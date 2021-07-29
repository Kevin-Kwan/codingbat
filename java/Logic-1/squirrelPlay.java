public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer && temp <= 100 && temp >= 60)
    return true;
  if (isSummer==false && temp <= 90 && temp >=60)
    return true;
  else
    return false;

}
