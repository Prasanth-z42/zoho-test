/**
 * Write a program to evaluate the polynomial equation
*/
class Main{
    public static void evaluatePolynomial(double a, double b, double c){
        double result = 0d;
        double discriminant = b*b - 4 * a * c;
        if(discriminant > 0){
            double firstVal = (-b + Math.sqrt(discriminant)/2*a);
            double secondVal = (-b - Math.sqrt(discriminant)/2*a);
            System.out.println("firstVal "+firstVal + "\nsecondVal "  + secondVal);
        }
        else if(discriminant == 0){
            System.out.println(-b /2*a);
        }
        else{
            double realPart = -b/2*a;
            double imaginaryPart = Math.sqrt(-discriminant)/2*a;
            System.out.println("realPart "+realPart + " imaginaryPart "+"i"+imaginaryPart);
        }
    }
    public static void main(String []args){
        double a = 2.0;
        double b = 3.0;
        double c = -5.0;
        evaluatePolynomial(a,b,c);
    }
}