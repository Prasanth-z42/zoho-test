/**
 * Find if a String2 is substring of String1. if it is, return the index of the first occurrence. else return -1.
 *
 * Input  - String1 : test123string
 *          String2 : 123
 * Output - 4
*/ 
import java.util.*;
class Main{
    public static int findIndex(String str, String substr){
        int index = str.indexOf(substr);
        int i = index;
        int j = 0;
        while(i<str.length() && j<substr.length()){
            if(str.charAt(i) == substr.charAt(j)){
                i++;
                j++;
            }
        }
        if(j == substr.length())
            return index;
        return -1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        System.out.println("Enter substring");
        String substr = sc.next();
        System.out.println(findIndex(str,substr));
    }
}