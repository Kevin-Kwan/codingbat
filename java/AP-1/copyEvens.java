public int[] copyEvens(int[] nums, int count) {
  int[] evens=new int[count];
  for (int i=0;i<nums.length;i++){
  if (nums[i]%2==0){
  for (int k=0;k<evens.length;k++){
  if (evens[k]==0){
    evens[k]=nums[i];
    break;
  }}
}
}
return evens;
}
