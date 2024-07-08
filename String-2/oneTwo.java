/**
 * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 *
 * oneTwo("abc") → "bca"
 * oneTwo("tca") → "cat"
 * oneTwo("tcagdo") → "catdog"
 */

public String oneTwo(String str) {
  if(str.length() < 3)
    return "";
  StringBuilder sb = new StringBuilder();
  for(int i = 0; i<str.length()-2; i += 3){
    if(i + 2 <= str.length()){
      char ch = str.charAt(i);
      sb.append(str.charAt(i+1));
      sb.append(str.charAt(i+2));
      sb.append(ch);
    }
  }
  return sb.toString();
}
