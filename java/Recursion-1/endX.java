public String endX(String str) {
  String i="";
  if (str.length()==0)
  return "";
  if (str.charAt(0)=='x')
  
  return endX(str.substring(1))+"x";
  return str.charAt(0)+endX(str.substring(1));
}
