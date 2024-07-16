/**
 * Write a program to convert a number in figures to number in words
 * 
 * Input  - 345
 * Output - Three hundred and forty Five
 * Input  - 3001
 * Output - Three thousand and one
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number ( 4 digit)");
        n = sc.nextInt();

        if(n<0 || n>9999)
            System.out.println("Wrong Number...");
        else{
            int one = n%10; //last digit  or one digit
            int tt = n/10;
            int ten = tt%10;  //second last digit or ten digit
            int hun = n/100; //first digit or hundred digit
            int hh = hun%10;
            int tou = n/1000;
            String one_s[] = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
            String ten_s[] = {" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String hun_s = " Hundred ";
            String tousand = "thousand";

            if(n<20)
                System.out.println(one_s[n]);
            else if(n<100)
                System.out.println(ten_s[ten]+" "+one_s[one]);
            else if(n > 100 && n < 1000)
                System.out.println(one_s[hun]+hun_s+ten_s[ten]+" " +one_s[one]);
            else if(n == 1000)
                System.out.println(tousand);
            else if(ten == 0 && hun%10 == 0)
                System.out.println(one_s[tou] + " "+tousand+" and "+one_s[one]);
            else
                System.out.println(one_s[tou] + " " +tousand + " " + one_s[hh] + hun_s + ten_s[ten]+" " +one_s[one]);
        }
    }
}
