/**
 * Write a program to make such a pattern like a pyramid with numbers increased by 1
 *
 * Input  - 4
 * Output -     1
 *             2 3
 *            4 5 6
 *           7 8 9 10
*/ 
import java.util.*;
class Main{
    public static void printPattern(int n){
        int k = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j<n-i-1)
                    System.out.print(" ");
                else
                    System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}