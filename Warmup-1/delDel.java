/**
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 *
 * delDel("adelbc") → "abc"
 * delDel("adelHello") → "aHello"
 * delDel("adedbc") → "adedbc"
 */

public String delDel(String str) {
  if(str.length() <= 3)
    return str;
  if(str.substring(1,4).equals("del")){
    str = str.replaceAll("del","");
    return str;
  }
  return str;
}
