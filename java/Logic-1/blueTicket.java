public int blueTicket(int a, int b, int c) {
  int ab=a+b;
  int ac=a+c;
  int bc=b+c;
  if (ab==10||ac==10||bc==10)
  return 10;
  else if (ab==10+bc||ab==10+ac)
  return 5;
  else
  return 0;
  
}
