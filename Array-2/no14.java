/**
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 *
 * no14([1, 2, 3]) → true
 * no14([1, 2, 3, 4]) → false
 * no14([2, 3, 4]) → true
 */
public boolean no14(int[] nums) {
  if(nums.length <= 1)
    return true;
  int one = 0;
  int four = 0;
  for(int i : nums){
    if(i == 1)
      one++;
    if(i == 4)
      four++;
  }
  return (one == 0 && four != 0) || (one != 0 && four == 0);
}
