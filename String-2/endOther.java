/**
 * Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
 *
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */

public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  int count = 0;
  int alen = a.length();
  int blen = b.length();
  String one;
  String two;
  if(alen >= blen){
    one = a.substring(alen - blen);
    two = b;
  }
  else{
    two = b.substring(blen - alen);
    one = a;
  }
  return one.equals(two);
}
