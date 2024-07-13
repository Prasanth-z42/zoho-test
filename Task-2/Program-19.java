/**
 * java program to left rotate the lements of a multidimensional array
 *
 * Input  - 1 2 3
 *          4 5 6
 *          7 8 9
 * 
 * Output - 3 6 9
 *          2 5 8
 *          1 4 7
*/ 
class Main{
    public static void rotateLeft(int [][]arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //left rotate
        for(int i = 0; i<arr.length/2; i++){
            for(int j = 0; j<arr.length; j++){
                int temp = arr[arr.length-1][j];
                arr[arr.length-1][j] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        //right rotate
        /*for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length/2; j++){
                int temp = arr[i][arr.length-1];
                arr[i][arr.length-1] = arr[i][j];
                arr[i][j] = temp;
            }
        }*/
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int [][]arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotateLeft(arr);
    }
}