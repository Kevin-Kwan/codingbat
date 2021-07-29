public String[] fizzBuzz(int start, int end) {
  String[] what=new String[end-start];
  for (int i=0;i<what.length&&start!=end;i++)
  {
  if (start%3==0&&start%5==0)
  {
  what[i]="FizzBuzz";
  start++;
  }
  else if (start%3==0)
  {
  what[i]="Fizz";
  start++;
  }
  else if (start%5==0)
  {
  what[i]="Buzz";
  start++;
  }
  else
  {
  what[i]=String.valueOf(start);
  start++;
  }
  }
  return what;
}
