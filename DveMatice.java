package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class DveMatice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println(program(sc));
        }
    }

    public static int[] loadMatrix(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] matrix = new int[n*m];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = sc.nextInt();
        }
        return matrix;
    }


    public static int program(Scanner sc){
        int[] matrix1 = loadMatrix(sc);
        int[] matrix2 = loadMatrix(sc);

        bubblesort(matrix1);
        bubblesort(matrix2);

        if(matrix1.length != matrix2.length){
            return 0;
        } else {
            for (int i = 0; i < matrix1.length; i++){
                if(matrix1[i] != matrix2[i]){
                    return 0;
                }
            }
            return 1;
        }
    }

    public static void bubblesort(int[] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix.length; j++){
                if (matrix[i] > matrix[j]){
                    int tmp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = tmp;
                }
            }
        }
    }
}
