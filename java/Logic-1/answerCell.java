public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep)
  return false;
  if (isMorning && isMom)
  return true;
  else if (isMorning==false&&isAsleep==false)
  return true;
  else
  return false;
}
