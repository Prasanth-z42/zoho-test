/**
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */

public String doubleChar(String str) {
  StringBuilder sb = new StringBuilder();
  for(char ch : str.toCharArray()){
    sb.append(ch);
    sb.append(ch);
  }
  return sb.toString();
}
