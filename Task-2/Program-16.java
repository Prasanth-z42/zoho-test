/**
 * Given two  sorted arrays, merge them such that the elementsare not repeated 
 * 
 * Input  - Array 1: 2,4,5,6,7,9,10,13
 *          Array 2: 2,3,4,5,6,7,8,9,11,15
 * Output - merge : 2,3,4,5,6,7,8,9,10,11,13,15
*/ 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet();
        int []arr1 = {2,4,5,6,7,9,10,13};
        int []arr2 = {2,3,4,5,6,7,8,9,10,11,13,15};
        int []merge = new int[100];
        int k = 0;
        for(int i = 0; i<arr2.length; i++){
            merge[k++] = arr2[i];
            set.add(arr2[i]);
        }
        for(int i = 0; i<arr1.length; i++){
            if(!set.contains(arr1[i]))
                merge[k++] = arr1[i];
        }
        merge = Arrays.copyOfRange(merge,0,k);
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
    }
}