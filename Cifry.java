package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class Cifry {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;
        while((number = sc.nextLong()) > 0){
            digits(number);
        }
    }

    public static void digits(long number){
        long sum = 0;
        long mult = 1;
        while(number != 0){
            sum += number%10;
            mult *= number%10;
            number /= 10;
        }
        System.out.println(sum+" "+mult);
    }
}
