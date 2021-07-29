public int makeChocolate(int small, int big, int goal) {
  if (goal>small+(big*5))
  {
    return -1;
  }
  else if (goal%10<5&&goal%10<=small)
  {
    if (goal-(big*5)<0)
    {
    return goal%5;
    }
    else
    {
      return goal-(big*5);
    }
  }
else if (goal%10>5&&goal%10<=small)
  {
    if (goal-(big*5)<0)
    {
    return goal%5;
    }
    else
    {
      return goal-(big*5);
    }  
  }
  else if (goal%5<5&&small<goal%5)
  {
    return -1;
  }
  else if (goal%10>=5&&goal%5<=small)
  return goal%5;
  else
  {
    return -1;
    }
  }
