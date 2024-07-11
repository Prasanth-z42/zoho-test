/**
 * Write a program to give the following output for the given input
 *
 * Input  - a1b10
 * Output - abbbbbbbbbb
*/
import java.util.Scanner;
class Main{
    public static String printNCharacters(String str){
        char []arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            if(arr[i] >= 48 && arr[i] < 57){
                ch = arr[i-1];
                while(i<arr.length && arr[i] >= 48 && arr[i] < 57){
                    sum = (sum * 10) + arr[i] - '0';
                    i++;
                }
                while(sum > 0){
                    sb.append(ch);
                    sum--;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = printNCharacters(str);
        System.out.println(s);
    }
}