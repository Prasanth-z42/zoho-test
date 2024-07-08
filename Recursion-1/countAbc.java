/**
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 *
 * countAbc("abc") → 1
 * countAbc("abcxxabc") → 2
 * countAbc("abaxxaba") → 2
*/
public int countAbc(String str) {
  if(str.length()<3)
    return 0;
  if(str.charAt(0) == 'a'){
    if(str.charAt(1) == 'b' && str.charAt(2) == 'c')
      return 1 + countAbc(str.substring(3));
    if(str.charAt(1) == 'b' && str.charAt(2) == 'a')
      return 1 + countAbc(str.substring(2));
  }
  return countAbc(str.substring(1));
}
