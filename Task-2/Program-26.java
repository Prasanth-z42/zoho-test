/**
 * Write a Program to print the following pattern for the given input number
 *
 * Input  - 3
 * Output ----->    * * * * * * *
 *                  * * * _ * * *
 *                  * * _ _ _ * *
 *                  * _ _ _ _ _ *
 *                  * * _ _ _ * *
 *                  * * * _ * * *
 *                  * * * * * * *
*/
import java.util.*;
class Main{
    public static void printPattern(int n){
        int l;
        for(int i = -n; i<=n; i++){
            if(i<0)
                l = -i;
            else
                l = i;
            for(int j = -n; j<=n; j++){
                if(-(n-l)<j && j<n-l)
                    System.out.print("_ ");
                else
                    System.out.print("* ");
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