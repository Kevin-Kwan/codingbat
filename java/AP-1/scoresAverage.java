public int scoresAverage(int[] scores) {
  int first=0;
  int second=0;
  for (int i=0;i<scores.length/2;i++)
  {
  first+=scores[i];  
  }
  for (int j=scores.length/2;j<scores.length;j++)
  {
  second+=scores[j];  
  }
  int number=scores.length/2;
  int numbers=scores.length-scores.length/2;
  int firstavg=first/number;
  int secondavg=second/numbers;
  if (firstavg>=secondavg)
  return firstavg;
  else
  return secondavg;
}
