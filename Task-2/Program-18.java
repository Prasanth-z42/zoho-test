/**
 * Write a program to sort the elements in odd positions in descending order and elements in ascending order
 *
 * Input  - 13,2,4,15,12,10,5
 * Output - 13,2,12,10,5,15,4
*/
import java.util.*;
class Main{
    public static int[] desSort(int []odd){
        for(int i = 0; i<odd.length; i++){
            for(int j = i+1; j<odd.length; j++){
                if(odd[i] < odd[j]){
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }
        return odd;
    }
    public static int[] sortTheElements(int []arr){
        int []odd = new int[100];
        int []even = new int[100];
        int o = 0, e = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }
        even = Arrays.copyOfRange(even,0,e);
        odd = Arrays.copyOfRange(odd,0,o);
        odd = desSort(odd);
        Arrays.sort(even);
        int []merge = new int[e+o];
        int k = 0, i = odd.length-1, j = even.length-1;
        while(i>=0 && j>=0){
            merge[k++] = even[j--];
        
            merge[k++] = odd[i--];            
        }
        while(i>=0)
            merge[k++] = odd[i--];
        while(j>=0)
            merge[k++] = even[j--];
        return merge;
    }
    public static void main(String []args){
        int []arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(sortTheElements(arr)));
    }
}