package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 15. 1. 2016.
 */
public class BlokovaMatice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();

        int[][] matrix = loadMatrix(sc, r, s);
        System.out.println(isBlock(matrix));
    }

    public static int[][] loadMatrix(Scanner sc, int r, int s) {
        int[][] res = new int[r][s];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = sc.nextInt();
            }
        }
        return res;
    }

    public static String isBlock(int[][] matrix) {
        int num = matrix[0][0];
        int r = 0;
        int s = 0;

        String res;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == num) {
                r++;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == num) {
                s++;
            }
        }

        res = r+" "+s;

        if(!containsSameNumber(matrix,r,s) || !isUnique(matrix,r,s)){
            res = "-1";
        }


        return res;
    }

    public static boolean isUnique(int[][] matrix, int r, int s){
        boolean res = true;
        int row = matrix.length/r;
        int column = matrix[0].length/s;

        for (int i = r-1; i < matrix.length; i+=r) {
            for (int j = s-1; j < matrix[i].length; j+=s) {
                if((i+1) < matrix.length){
                    if(matrix[i][j] != matrix[i+1][j]){

                    }else{
                        res = false;
                        break;
                    }
                    if((j+1) < matrix[i].length){
                        if(matrix[i][j] != matrix[i+1][j+1]){

                        }else{
                            res = false;
                            break;
                        }
                    }

                }
                if((j+1) < matrix[i].length){
                    if(matrix[i][j] != matrix[i][j+1]){

                    }else{
                        res = false;
                        break;
                    }
                }
            }
        }

        return res;
    }

    public static boolean containsSameNumber(int[][] matrix, int r, int s) {
        boolean res = true;
        int a = 0;
        int b = 0;
        int ptr = 0;
        int[] numbs = getNumbs(matrix,s,0);
        for (int i = 0; i < matrix.length; i++) {
            a++;
            for (int j = 0; j < matrix[i].length; j++) {
                if(numbs[ptr] == matrix[i][j]){

                } else {
                    res = false;
                    break;
                }
                b++;
                if(b == s){
                    b = 0;
                    ptr++;
                }
            }
            if(a == r){
                a = 0;
                if((i+1) < matrix.length) {
                    numbs = getNumbs(matrix, s, i + 1);

                }
            }
            ptr=0;
            b=0;
        }
        return res;
    }

    public static int[] getNumbs(int[][] matrix, int s, int row){
        int tmp = matrix[0].length;
        int zbytek = tmp%s;
        int array = (tmp/s)+zbytek;
        int[] res = new int[array];
        int ptr = 0;
        for (int i = 0; i < matrix[row].length; i += s){
            res[ptr++] = matrix[row][i];
        }
        return res;
    }
}
