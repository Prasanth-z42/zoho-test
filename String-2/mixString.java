/**
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 *
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */

public String mixString(String a, String b) {
  StringBuilder sb = new StringBuilder();
  int i = 0;
  int j = 0;
  while(i<a.length() && j<b.length()){
    sb.append(a.charAt(i));
    sb.append(b.charAt(j));
    i++;
    j++;
  }
  while(i<a.length()){
    sb.append(a.charAt(i));
    i++;
  }
  while(j<b.length()){
    sb.append(b.charAt(j));
    j++;
  }
  return sb.toString();
}
