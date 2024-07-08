/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 *
 * countYZ("fez day") → 2
 * countYZ("day fez") → 2
 * countYZ("day fyyyz") → 2
 */

public int countYZ(String str) {
  if(str.isEmpty())
    return 0;
  int count = 0;
  str = str.toLowerCase();
  for(int i = 0; i<str.length()-1; i++){
    char ch = str.charAt(i);
    if((ch == 'z' || ch == 'y') && !Character.isLetter(str.charAt(i+1)))
      count++;
  }
  if(str.charAt(str.length()-1) == 'z' || str.charAt(str.length()-1) == 'y')
    count++;
  return count;
}
