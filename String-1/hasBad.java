/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 *
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 */

public boolean hasBad(String str) {
  if(str.contains("bad")){
    int index = str.indexOf("b");
    if(index == 0 || index == 1)
      return true;
  }
  return false;
}

