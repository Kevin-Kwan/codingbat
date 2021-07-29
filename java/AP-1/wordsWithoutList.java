public List wordsWithoutList(String[] words, int len) {
  int start=0;
  ArrayList<String> it=new ArrayList<>(); 
  for (String string: words)
  {
    if (string.length()!=len)
    it.add(string);
  }
  return it;
}
