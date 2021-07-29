public int teaParty(int tea, int candy) {
  if (tea>=5 && candy>=5 && (tea>=2*candy||candy>=2*tea))
  return 2;
  else if (tea>=5 && candy>=5)
  return 1;
  else
  return 0;
}
