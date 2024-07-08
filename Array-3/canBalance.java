/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 */
public boolean canBalance(int[] nums) {
  if(nums.length <= 1)
    return false;
  int start = 0;
  int end = 0;
  for(int i = 0; i<nums.length-1; i++)
    start += nums[i];
  end = nums[nums.length-1];
  for(int i = nums.length-2; i>0; i--){
    if(start == end)
      return true;
    start -= nums[i];
    end += nums[i];
  }
  return start == end;
}
