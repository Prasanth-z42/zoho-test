/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */
public String stringBits(String str) {
  if(str.isEmpty())
    return "";
  if(str.length() <= 2)
    return str.charAt(0)+"";
  StringBuilder sb = new StringBuilder();
  for(int i = 0; i<str.length(); i += 2)
    sb.append(str.charAt(i));
  return sb.toString();
}
