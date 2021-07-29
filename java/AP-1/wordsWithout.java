public String[] wordsWithout(String[] words, String target) {
  int i=0;
  for (String strings:words)
  {
  if (strings.equals(target))
  i++;
}
  String[] wordarray=new String[words.length-i];
  int j=0;
  for (String strings:words)
  {
  if (strings.equals(target)){
j=j;
}
else
{
wordarray[j]=strings;
  j++;
}

}
return wordarray;
  
}
