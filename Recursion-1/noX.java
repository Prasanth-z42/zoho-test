/**
 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
 *
 * noX("xaxb") → "ab"
 * noX("abc") → "abc"
 * noX("xx") → ""
*/
public String noX(String str) {
  char ch;
  if(str.length() == 0)
    return str;
  ch = str.charAt(0);
  if(ch == 'x')
    return noX(str.substring(1));
  return ch + noX(str.substring(1));
}
