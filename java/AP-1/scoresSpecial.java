public int scoresSpecial(int[] a, int[] b) {
int ascore=0;
int bscore=0;
for (int i=0;i<a.length;i++) {
if (a[i]%10==0&&a[i]>ascore)
ascore=a[i];
}
for (int i=0;i<b.length;i++) {
if (b[i]%10==0&&b[i]>bscore)
bscore=b[i];
}
return ascore+bscore;
}


