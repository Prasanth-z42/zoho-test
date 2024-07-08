/**
 * A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
 *
 * getSandwich("breadjambread") → "jam"
 * getSandwich("xxbreadjambreadyy") → "jam"
 * getSandwich("xxbreadyy") → ""
 */

public String getSandwich(String str) {
  /*int n = str.indexOf('d');
  if(n == -1)
    return "";
  int index = 0;
  boolean flag = false;
  for(int i = str.length()-1; i>=n; i--){
    if(str.charAt(i) == 'b'){
      index = i;
      flag = true;
      break;
    }
  }
  if(!flag)
    return "";
  return str.substring(n+1,index);
*/
  int first = str.indexOf("bread");
  int last = str.lastIndexOf("bread");
  if(first != -1 && last != -1 && first != last)
    return str.substring(first+5,last);
  return "";
}
