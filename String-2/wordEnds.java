/**
 * Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
 *
 * wordEnds("abcXY123XYijk", "XY") → "c13i"
 * wordEnds("XY123XY", "XY") → "13"
 * wordEnds("XY1XY", "XY") → "11"
 */

public String wordEnds(String str, String word) {
  StringBuilder sb = new StringBuilder();
  int i = 0;
  int pos = str.indexOf(word);
  while(pos != -1){
    i = pos + word.length();
    if(pos > 0)
      sb.append(str.charAt(pos-1));
    if(i < str.length())
      sb.append(str.charAt(pos+word.length()));
    pos = str.indexOf(word,i);
  }
  return sb.toString();
}
