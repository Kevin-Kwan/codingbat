public boolean makeBricks(int small, int big, int goal) {
  if (goal > small + (big * 5) ||goal%10 < 5 && small < goal%10||goal%10 > 5 && goal%10 > small + 5)
  return false;
  else
    return true;
}
