/**
 * Print the Smallest Element in an Array
 *
 * Input  - {1,2,3,4,5}
 * Output - 1
*/ 
class Main{
    public static int smallestElement(int []arr){
        int min = arr[0];
        for(int i : arr){
            if(min > i)
                min = i;
        }
        return min;
    }
    public static void main(String []args){
        int []arr = {1,2,3,4,5};
        System.out.println(smallestElement(arr));
    }
}