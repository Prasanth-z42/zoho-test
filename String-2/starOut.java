/**
 * Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 *
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 */

public String starOut(String str) {
  if(str.length() == 0)
    return "";
  if(str.length() <= 3 && str.indexOf('*') == -1)
    return str;
  int i= 0;
  StringBuilder sb = new StringBuilder();
  if(str.indexOf('*') != 0 && str.charAt(i+1) != '*')
    sb.append(str.charAt(i));
  for(i = 1; i<str.length()-1; i++){
    if(str.charAt(i) != '*' && (str.charAt(i-1) != '*' && str.charAt(i+1) != '*'))
      sb.append(str.charAt(i));
  }
  if(str.lastIndexOf('*') != str.length()-1 && str.charAt(str.length()-2) != '*')
    sb.append(str.charAt(str.length()-1));
  return sb.toString();
}
