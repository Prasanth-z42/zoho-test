/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public String frontBack(String str) {
  if(str.isEmpty())
    return "";
  char []arr = str.toCharArray();
  char temp = arr[0];
  arr[0] = arr[str.length()-1];
  arr[str.length()-1] = temp;
  return String.valueOf(arr);
}