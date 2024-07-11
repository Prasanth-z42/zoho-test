/**
 * Alternate sorting : Given an array of intefers, rearrange  the array in such a way that the first element is first maximum and second element is first minimum
 *
 * Input  - {1,2,3,4,5,6,7}
 * Output - {7,1,6,2,5,3,4}
*/ 
import java.util.Arrays;
class Main{
    public static int[] alternateSorting(int []arr){
        for(int pos = 0; pos<arr.length; pos += 2){
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i>pos; i--){
                arr[i] = arr[i-1];
            }
            arr[pos] = temp;
        }
        return arr;
    }
    public static void main(String []args){
        int []arr = {1,2,3,4,5,6,7};
        arr = alternateSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}