/**
 * Program to check whether a character is an Alphabet or not
 *
 * Input  - a
 * Output - true
 * Input  - 1
 * Output - false
*/ 
import java.util.*;
class Main{
    public static boolean isAlphabet(char ch){
        return (ch >= 65 && ch <=91) || (ch >= 97 && ch <= 123);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(isAlphabet(ch));
    }
}