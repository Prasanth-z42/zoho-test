/**
 * Using Recursion, reverse the string such as
 * 
 * Input  - one two three
 * Output - three two one
*/
import java.util.Scanner;
class Main{
    public static String reverseWords(String []arr, int index){
        if(index == arr.length)
            return "";
        return reverseWords(arr,index+1) + arr[index]+" ";
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords(str.split(" "),0));
    }
}