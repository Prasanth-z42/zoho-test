/**
 * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
 *
 * xyzMiddle("AAxyzBB") → true
 * xyzMiddle("AxyzBB") → true
 * xyzMiddle("AxyzBBB") → false
 */

public boolean xyzMiddle(String str) {
  int l = str.length();
  if(l < 3)
    return false;
  int mid = l/2;
  if(l % 2 == 0){
    if(str.charAt(mid) == 'y' && str.charAt(mid-1) == 'x' && str.charAt(mid+1) == 'z')
      return true;
    if(str.charAt(mid-1) == 'y' && str.charAt(mid-2) == 'x' && str.charAt(mid) == 'z')
      return true;
    return false;
  }
  else{
    if(str.charAt(mid) == 'y' && str.charAt(mid-1) == 'x' && str.charAt(mid+1) == 'z')
      return true;
  }
  return false;
}
