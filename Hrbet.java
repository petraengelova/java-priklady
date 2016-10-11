package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 15. 1. 2016.
 */
public class Hrbet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while((n = sc.nextInt()) > 0){
            program(sc,n);
        }

    }

    public static void program(Scanner sc, int n){
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] coord = findBack(matrix,findMax(matrix));
        if(isBack(matrix,coord) && !(coord[0] == coord[2] && coord[1] == coord[3])){
            System.out.println((coord[0]+1)+" "+(coord[1]+1)+" "+(coord[2]+1)+" "+(coord[3]+1));
        }else{
            System.out.println("-1");
        }

    }

    public static int findMax(int[][] matrix){
        int max = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int[] findBack(int[][] matrix, int num){
        int[] coord = new int[4];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(num == matrix[i][j]){
                    coord[0] = i;
                    coord[1] = j;
                    break;
                }
            }
        }

        if((coord[1]+1) < matrix[0].length && matrix[coord[0]][coord[1]+1] == num){
            for (int i = coord[1]+1; i < matrix[0].length; i++){
                if(matrix[coord[0]][i] == num){
                    coord[2] = coord[0];
                    coord[3] = i;
                }
            }
            return coord;
        }else{
            coord[2] = coord[0];
            coord[3] = coord[1];
            for (int i = matrix.length-1; i > -1; i--){
                if(matrix[i][coord[3]] == num){
                    coord[0] = i;
                    coord[1] = coord[3];
                }
            }
            return coord;
        }
    }

    public static boolean isBack(int[][] array, int[] coord){
        boolean res = true;
        int[][] matrix = new int[array.length+2][array[0].length+2];
        makeRamecek(matrix, array);
        int tmp = array[coord[0]][coord[1]];

        if(coord[0] == coord[2]){
            for (int i = coord[0]+1-1; i < coord[2]+1+2; i++){
                for (int j = coord[1]+1-1; j < coord[3]+1+2; j++){
                    if(i == coord[0]+1){
                        if(!(matrix[i][coord[1]+1-1] < tmp && matrix[i][coord[3]+2] < tmp)){
                            res = false;
                        }
                    } else {
                        if(matrix[i][j] >= tmp){
                            res = false;
                        }
                    }
                }
            }
        } else {
            for (int i = coord[1]+1-1; i < coord[3]+1+2; i++){
                for (int j = coord[0]+1-1; j < coord[2]+1+2; j++){
                    if(i == coord[1]+1){
                        if(!(matrix[j][coord[1]+1-1] < tmp && matrix[j][coord[3]+1+2] < tmp)){
                            res = false;
                        }
                    } else {
                        if(matrix[j][i] >= tmp){
                            res = false;
                        }
                    }
                }
            }
        }


        return res;
    }

    public static void makeRamecek(int[][] matrix, int[][] array){
        for (int i = 0; i < matrix[0].length; i++){
            matrix[0][i] = -1;
            matrix[matrix.length-1][i] = -1;
        }
        for (int i = 0; i < matrix.length; i++){
            matrix[i][0] = -1;
            matrix[i][matrix[0].length-1] = -1;
        }
        for (int i = 1; i < matrix.length-1; i++){
            for (int j = 1; j < matrix[0].length-1; j++){
                matrix[i][j] = array[i-1][j-1];
            }
        }
    }
}
