/**
 * Write a program for the following. Let consider 20 students in a class with the roll no 101 - 120. We are going to split them into four groups. Based on their roll number we are going to split them with the following logics.
 *
 * Input  - 20
 * Output - Group 1
 *          101 105 109 113 117
 *          Group 2
 *          102 106 110 114 118
 *          Group 3
 *          103 107 111 115 119
 *          Group 4
 *          104 108 112 116 120
*/
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rollno = 100;
        for(int i = 1; i<5; i++){
            System.out.println("Group "+i);
            for(int j = i; j<n+1; j += 4){
                System.out.println(j+rollno);
            }
        }
    }
}