public int[] makeLast(int[] nums) {
  int[] done=new int[2*nums.length];
  done[done.length-1]=nums[nums.length-1];
  return done;
}
