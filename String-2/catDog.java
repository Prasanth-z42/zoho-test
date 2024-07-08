/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 *
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */

public boolean catDog(String str) {
  int diff = 0;
  for(int i = 0; i<str.length()-2; i++){
    if(str.charAt(i) == 'c'){
      if(str.charAt(i+1) == 'a' && str.charAt(i+2) == 't'){
        diff++;
        i += 2;
      }
    }
    if(str.charAt(i) == 'd'){
      if(str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g'){
        diff--;
        i += 2;
      }
    }
    }
  return diff == 0;
}
