public String noX(String str) {
  String it="";
  if (str.length()<1)
  return "";
  if (str.charAt(0)=='x')
  {
  it+=noX(str.substring(1));
  }
  else
  {
  it+=str.charAt(0)+noX(str.substring(1));}

  return it;
}
