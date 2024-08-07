/**
 * Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
 *
 * plusOut("12xy34", "xy") → "++xy++"
 * plusOut("12xy34", "1") → "1+++++"
 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

public String plusOut(String str, String word) {
  StringBuilder sb = new StringBuilder();
  int i = 0;
  int pos = str.indexOf(word);
  while(pos != -1){
    while(i < pos){
      sb.append('+');
      i++;
    }
    sb.append(word);
    i += word.length();
    pos = str.indexOf(word,i);
  }
  while(i < str.length()){
    sb.append('+');
    i++;
  }
  return sb.toString();
}
