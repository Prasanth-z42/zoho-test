/**
 * Given three int values, a b c, return the largest.
 *
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 */

public int intMax(int a, int b, int c) {
  int max = a;
  if(max < b)
    max = b;
  if(c > max)
    max = c;
  return max;
}
