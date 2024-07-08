/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */

public String stringSplosion(String str) {
  StringBuilder sb = new StringBuilder();
  for(int i = 1; i<=str.length(); i++){
    sb.append(str.substring(0,i));
  }
  return sb.toString();
}
