/**
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
 *
 * start1([1, 2, 3], [1, 3]) → 2
 * start1([7, 2, 3], [1]) → 1
 * start1([1, 2], []) → 1
 */
public int start1(int[] a, int[] b) {
  int count = 0;
  for(int i : a)
    if(i == 1)
      count++;
  for(int i : b)
    if(i == 1)
      count++;
  return count;
}
