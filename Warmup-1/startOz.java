/**
 * Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 *
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */

public String startOz(String str) {
  if(str.isEmpty())
    return "";
  String s = "";
  if(str.length() >= 1 && str.charAt(0) == 'o')
    s += str.charAt(0);
  if(str.length() >= 2 && str.charAt(1) == 'z')
    s += str.charAt(1);
  return s;
}
