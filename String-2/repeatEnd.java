/**
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 *
 * repeatEnd("Hello", 3) → "llollollo"
 * repeatEnd("Hello", 2) → "lolo"
 * repeatEnd("Hello", 1) → "o"
 */

public String repeatEnd(String str, int n) {
  String s = str.substring(str.length()-n);
  String res = "";
  while(n > 0){
    res += s;
    n--;
  }
  return res;
}
