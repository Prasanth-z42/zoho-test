/**
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 *
 * lastTwo("coding") → "codign"
 * lastTwo("cat") → "cta"
 * lastTwo("ab") → "ba"
 */

public String lastTwo(String str) {
  if(str.length() <= 1)
    return str;
  char []arr = str.toCharArray();
  char temp = arr[arr.length-2];
  arr[arr.length-2] = arr[arr.length-1];
  arr[arr.length-1] = temp;
  return String.valueOf(arr);
}
