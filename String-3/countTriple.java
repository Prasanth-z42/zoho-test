/**
 * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
 *
 * countTriple("abcXXXabc") → 1
 * countTriple("xxxabyyyycd") → 3
 * countTriple("a") → 0
 */

public int countTriple(String str) {
  int count = 0;
  for(int i = 0; i<str.length()-1; i++){
    char ch = str.charAt(i);
    if(i<str.length()-2){
      if(str.charAt(i+1) == ch && str.charAt(i+2) == ch)
        count++;
    }
  }
  return count;
}
