/**
 * Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 *
 * withoutString("Hello there", "llo") → "He there"
 * withoutString("Hello there", "e") → "Hllo thr"
 * withoutString("Hello there", "x") → "Hello there"
 */

public String withoutString(String base, String remove) {
  StringBuilder sb = new StringBuilder();
  String one = base.toLowerCase();
  String two = remove.toLowerCase();
  int index = one.indexOf(two);
  int k = 0;
  while(index != -1){
    for(; k<index; k++){
      sb.append(base.charAt(k));
    }
    k = index + remove.length();
    index = one.indexOf(two,k);
  }
  for(; k<base.length(); k++)
    sb.append(base.charAt(k));
  return sb.toString();
}
