/**
 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 *
 * zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
 * zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
 * zeroFront([1, 0]) → [0, 1]
 */
public int[] zeroFront(int[] nums) {
  int pos = nums.length-1;
  for(int i = nums.length-1; i>=0; i--){
    if(nums[i] != 0)
      nums[pos--] = nums[i];
  }
  for(int i = 0; i<pos+1; i++)
    nums[i] = 0;
  return nums;
}
