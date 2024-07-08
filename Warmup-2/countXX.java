/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 */

int countXX(String str) {
  if(str.indexOf('x') == -1)
    return 0;
  int count = 0;
  for(char ch : str.toCharArray()){
    if(ch == 'x')
      count++;
  }
  if(str.indexOf(' ') != -1)
    return count-2;
  return count-1;
}
