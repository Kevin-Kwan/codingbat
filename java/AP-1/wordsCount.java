public int wordsCount(String[] words, int len) {
  int wordcount=0;
  for(String word: words){
  if (word.length()==len)
    wordcount++;
  }
  return wordcount;
}
