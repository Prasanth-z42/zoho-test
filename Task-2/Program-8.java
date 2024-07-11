/**
 * Write a program to find ASCII values
 * 
 * Input  - a
 * Output - 65
 * Input  - m
 * Output - 109
*/ 
import java.util.*;
class Main{
    public static int findASCII(char ch){
        return (int)ch;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(findASCII(ch));
    }
}