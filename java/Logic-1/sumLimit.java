public int sumLimit(int a, int b) {
  String ay = String.valueOf(a);
  int ayy = ay.length();
  String ab = String.valueOf(a+b);
  int abl = ab.length();
  if (abl == ayy)
    return a + b;
  else
    return a;

}
