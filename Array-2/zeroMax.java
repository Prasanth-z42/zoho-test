/**
 * Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
 *
 * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
 * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
 * zeroMax([0, 1, 0]) → [1, 1, 0]
 */
public int[] zeroMax(int[] nums) {
  int max;
	for(int i = 0; i < nums.length - 1; i++)
	{
		if(nums[i] == 0)
		{
			max = 0;
			for(int k = i + 1; k < nums.length; k++)
			{
				if(nums[k] > max && nums[k] % 2 == 1)
					max = nums[k];
			}
			if(max != 0)
				nums[i] = max;
		}
	}
	return nums;
  
}
