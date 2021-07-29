public int commonTwo(String[] a, String[] b) {
int num = 0;
String str = "";
for (int i = 0; i < b.length; i++) {
for (int j = 0; j < a.length; j++) {
if (a[j].equals(b[i]) && !str.contains(a[j])) {
str += a[j];
num++;
}
}
}
return num;
}

