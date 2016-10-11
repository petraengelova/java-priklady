package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class Rozsah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        while((count = sc.nextInt()) > 0){
            minAndMaxSeq(sc,count);
        }
    }

    public static void minAndMaxSeq(Scanner sc, int count){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++){
            int tmp = sc.nextInt();
            if(tmp < min){
                min = tmp;
            }
            if(tmp > max){
                max = tmp;
            }
        }
        System.out.println(min+" "+max);
    }
}
