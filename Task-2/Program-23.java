/**
 * Write a program to print following pattern
 *
 *          9 9 9 9 9 9 9 9 9
 *           8 8 8 8 8 8 8 8
 *            7 7 7 7 7 7 7
 *             6 6 6 6 6 6
 *              5 5 5 5 5
 *               4 4 4 4
 *                3 3 3 
 *                 2 2
 *                  1
*/ 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 9;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j<i)
                    System.out.print(" ");
                else
                    System.out.print(k+" ");
            }
            k--;
            System.out.println();
        }
    }
}