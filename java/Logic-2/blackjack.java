public int blackjack(int a, int b) {
  if (a<=21&&b<=21)
  if (a<b)
  return b;
  else
  return a;
  else if (b>21 &&a<=21)
  return a;
  else if (a>21&&b<=21)
  return b;
  else
  return 0;
}
