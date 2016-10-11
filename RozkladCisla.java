package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class RozkladCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while((number = sc.nextInt())> 0){
            int i = 2;
            while(number != 1){
                if(number%i == 0){
                    System.out.print(i+" ");
                    number /= i;
                }else{
                    i++;
                }
            }
            System.out.println();
        }
    }
}
