/**
 * Java Program to print the duplicate elements of an array.
 *
 * Input  - {1,2,3,4,5,2,3,4,5}
 * Output - {2,3,4,5}
*/ 
import java.util.*;
class Main{
    public static int[] printDuplicates(int []arr){
        Set<Integer> set = new HashSet();
        int []dup = new int[arr.length];
        int k = 0;
        for(int i : arr){
            if(set.contains(i))
                dup[k++] = i;
            set.add(i);
        }
        return Arrays.copyOfRange(dup,0,k);
    }
    public static void main(String []args){
        int []arr = {1,2,2,3,4,5,5,7,2,3,4};
        System.out.println(Arrays.toString(printDuplicates(arr)));
    }
}