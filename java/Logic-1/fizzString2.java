public String fizzString2(int n) {
  String en=""+n;
  
  if (n%3==0)
  en="Fizz";
  if (n%5==0)
  en="Buzz";
  if (n%3==0 &&n%5==0)
  en="FizzBuzz";
  return en+"!";

  
}
