/**
 * Write a program to print a letters from the user input character to 'Z' without using Strings.
 * 
 * Input  - X
 * Output - XYZ
 * 
 * Input  - M
 * Output - MNOPQRSTUVWXYZ
 */
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int val = ch - 65;
        for(int i = val; i<26; i++){
            ch = (char)(i + 65);
            System.out.print(ch);
        }
    }
}