/**
 * Write a program to print the following pattern
 *
 *                      1
 *                    1 2 1
 *                  1 2 3 2 1
 *                1 2 3 4 3 2 1
 *              1 2 3 4 5 4 3 2 1
 *            1 2 3 4 5 6 5 4 3 2 1
 *          1 2 3 4 5 6 7 6 5 4 3 2 1
 *        1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
 *      1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/ 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int k = 1;
            for(int j = 0; j<n+i; j++){
                if(j<n-i-1)
                    System.out.print("  ");
                else{
                    if(j<n)
                        System.out.print(k++ + " ");
                    else if(j == n){
                        --k;
                        System.out.print(--k+" ");
                    }
                    else 
                        System.out.print(--k + " ");
                }
            }
            System.out.println();
        }
    }
}