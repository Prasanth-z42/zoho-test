/**
 *     11 10 4  3  1 
 *     19 12 9  5  2
 *     20 18 13 8  6
 *     24 21 17 14 7
 *     25 23 22 16 15
*/ 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]mat = new int[r][c];
        boolean val = true;
        int n = 1, i = 0, j = c-1;
        while(n < (r*c+1) && i<r && j<c){
            if(val == true){
                mat[i][j] = n++;
                if(i == r-1 && j != 0){
                    mat[i][j-1] = n++;
                    val = false;
                    j = j-2;
                    i--;
                    if(j<0)
                        j = 0;
                }
                else if(j == c-1 && i != r-1){
                    mat[i+1][j] = n++;
                    val = false;
                    j--;
                }
                else{
                    i++; 
                    j++;
                }
            }
            else{
                mat[i][j] = n++;
                if(j == 0 && i != r-1){
                    mat[i+1][j] = n++;
                    val = true;
                    i = i+2;
                    j++;
                    if(i >= r)
                        i = r-1;
                }
                else if(i == 0 && j != 0){
                    mat[i][j-1] = n++;
                    val = true;
                    i++;
                }
                else{
                    j--;
                    i--;
                }
            }
        }
        for(int k = 0; k<mat.length; k++){
            for(int l = 0; l<mat[k].length; l++){
                System.out.print(mat[k][l]+" ");
            }
            System.out.println();
        }
    }
}