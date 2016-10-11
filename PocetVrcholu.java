package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class PocetVrcholu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) > 0){
            System.out.println(program(sc,n));
        }
    }

    public static int program(Scanner sc, int n){
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        if(n < 3 || m < 3){
            return 0;
        } else {
            int cnt = 0;
            for (int i = 1; i < matrix.length-1; i++){
                for (int j = 1; j < matrix[i].length-1; j++){
                    if(isPeak(matrix, i, j)){
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }

    public static boolean isPeak(int[][] matrix, int x, int y){
        boolean res = true;
        for (int i = x-1; i < x+2; i++){
            for (int j = y - 1; j < y+2; j++){
                if(i == x && j == y){
                }else{
                    if(matrix[i][j] >= matrix[x][y]){
                        res = false;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
