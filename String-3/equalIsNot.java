/**
 * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 *
 * equalIsNot("This is not") → false
 * equalIsNot("This is notnot") → true
 * equalIsNot("noisxxnotyynotxisi") → true
 */

public boolean equalIsNot(String str) {
  Set<String> set = new HashSet<>();
  set.add("is");
  set.add("not");
  int is = 0;
  int not = 0;
  for(int i = 0; i<=str.length()-2; i++){
    String temp =  str.substring(i,i+2);
    if(set.contains(temp))
      is++;
  }
  for(int i = 0; i<=str.length()-3; i++){
    String  temp =  str.substring(i, i+3);
    if(set.contains(temp))
      not++;
  }
  return is == not;
}
