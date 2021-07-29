public String[] mergeTwo(String[] a, String[] b, int n) {
String fin[] = new String[n];
int aa=0;
int bb=0;
for(int i=0; i<n; i++)
{
int comp=a[aa].compareTo(b[bb]);
if(comp<=0)
{
fin[i] = a[aa];
aa++;
if(comp == 0)
bb++;
  
}
else
{
fin[i] = b[bb++];
}
}
return fin;
}


