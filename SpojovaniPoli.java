package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class SpojovaniPoli {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short count;
        while((count = sc.nextShort()) > 0){
            sequences(sc,count);
        }
    }

    public static void sequences(Scanner sc, short count){
        int[] array1 = new int[count];
        for (int i = 0; i < count; i++){
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[sc.nextShort()];
        for (int i = 0; i < array2.length; i++){
            array2[i] = sc.nextInt();
        }
        mergeAndPrint(array1, array2);
    }

    public static void mergeAndPrint(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < (array1.length+array2.length); k++){
            if(j >= array2.length || (i < array1.length && array1[i] <= array2[j])){
                System.out.print(array1[i]+" ");
                i++;
            }else{
                System.out.print(array2[j]+" ");
                j++;
            }
        }
    }
}
