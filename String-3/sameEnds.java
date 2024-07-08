/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 *
 * sameEnds("abXYab") → "ab"
 * sameEnds("xx") → "x"
 * sameEnds("xxx") → "x"
 */

public String sameEnds(String string) {
  String temp;
  int len = string.length();
  int i;
  if(len%2 == 1){
    i = len/2;
    len = i+1;
  }
  else{
    i = len/2;
    len = i;
  }
  while(i >= 1){
    temp = string.substring(0,i);
    if(temp.equals(string.substring(len)))
      return temp;
    i--;
    len++;
  }
  return "";
}
