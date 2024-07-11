/**
 * Write a program to display the number in reverse order without use of String functions.
 *
 * Input - 12345
 * Output - The number in reverse order is : 54321
*/ 
class Reverse{
    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + (n%10);
            n /= 10;
        }
        return rev;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number in reverse order is : "+reverse(n));
        sc.close();
    }
}