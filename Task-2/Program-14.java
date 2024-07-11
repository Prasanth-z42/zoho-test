/**
 * Java  Program  to copy all elements of one array into another array
 * 
 * Input  - {1,2,3,4,5}
 * Output - {1,2,3,4,5}

*/ 
import java.util.Arrays;
class Main{
    public static int[] copyAllElements(int []arr){
        int []b = new int[arr.length];
        int k = 0;
        for(int i : arr){
            b[k++] = i;
        }
        return b;
    }
    public static void main(String []args){
        int []arr = {1,2,3,4,5};
        int []brr = copyAllElements(arr);
        System.out.println(Arrays.toString(brr));
    }
}