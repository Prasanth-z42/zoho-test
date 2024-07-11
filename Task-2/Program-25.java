/**
 * Write a program to print the following output for the given input. You can assume the string is odd length
 *
 * Input  - 12345
 * Output -        1        5
 *           	     2    4
 *                     3
 *                  2     4
 *                1         5
*/ 
import java.util.*;
class Main{
    public static void printPattern(String str){
        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<str.length(); j++){
                if(i == j)
                    System.out.print(str.charAt(i)+ " ");
                else if(i+j == str.length()-1)
                    System.out.print(str.charAt(j)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length() % 2 == 1)
            printPattern(str);
        else{
            System.out.println("Given String length is even...");
            System.exit(0);
        }
    }
}