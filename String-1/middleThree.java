/**
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
 *
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */

public String middleThree(String str) {
  int start = 0;
  int end = str.length()-1;
  int n = end - start;
  while(n != 2){
    start++;
    end--;
    n = end - start;
  }
  return str.substring(start,end+1);
}
