/**
 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
 *
 * maxBlock("hoopla") → 2
 * maxBlock("abbCCCddBBBxx") → 3
 * maxBlock("") → 0
 */

public int maxBlock(String str) {
  int maxLen = 0;
  int max = 0;
  for(int i = 0; i<str.length(); i++){
    for(int j = i + 1; j<=str.length(); j++){
      if(j - i > maxLen && isCheck(str.substring(i,j)))
        maxLen = j-i;
      if(max < maxLen)
        max = maxLen;
    }
  }
  return max;
}
public boolean isCheck(String str){
  Set<Character> set = new HashSet();
  set.add(str.charAt(0));
  for(int i = 1; i<str.length(); i++){
    if(!set.contains(str.charAt(i)))
      return false;
  }
  return true;
}