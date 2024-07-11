/**
 * Write a program to define the functionality of a Bitwise operators
 * (&, |, ^, ~)
*/ 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(~x);
        System.out.println(~y);
    }
}
/**