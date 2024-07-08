/**
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
 *
 * stringYak("yakpak") → "pak"
 * stringYak("pakyak") → "pak"
 * stringYak("yak123ya") → "123ya"
 */

public String stringYak(String str) {
  StringBuilder sb = new StringBuilder();
  int i = 0;
  while(i<str.length()){
    char ch = str.charAt(i);
    if(i+2 < str.length() && ch == 'y' && str.charAt(i+2) == 'k')
      i += 3;
    else{
      sb.append(ch);
      i++;
    }
  }
  return sb.toString();
}
