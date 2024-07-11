/**
 * Write a program to print the alphabet 'C' with the stars based on the given numbers
 *
 * Input  - 4
 * Output -    ****
 *             *
 *             *
 *             ****
*/ 
import java.util.*;
class Main{
    public static void patternC(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || j == 0 || i == n-1)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternC(n);
    }
}