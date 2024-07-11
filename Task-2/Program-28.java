/**
 * Write a program to find the sum of the series. The series will be like 
   1 + 11 + 111 + 1111 + 11111
 *
 * Input  - 5
 * Output - 1 + 11 + 111 + 1111 + 11111
 *          12345
*/ 
import java.util.*;
class Main{
    public static int printNumberOfTerms(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum * 10 + i;
        }
        return sum;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNumberOfTerms(n));
    }
}