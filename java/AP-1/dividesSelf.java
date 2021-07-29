public boolean dividesSelf(int n) {
String str= Integer.toString(n);
for (int i =0; i< str.length(); i++)
{
char a= str.charAt(i);
int c = Character.getNumericValue(a); 
if (c ==0)
return false;
 
if (n%c !=0)
return false; 
 
}
return true;
}
