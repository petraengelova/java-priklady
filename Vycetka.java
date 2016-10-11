package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class Vycetka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte count;
        while((count = sc.nextByte()) > 0){
            ticket(sc, count);
        }
    }

    public static void ticket(Scanner sc, byte count){
        long[] currency = new long[count];
        for (int i = 0; i < count; i++){
            currency[i] = sc.nextLong();
        }
        long amount;
        while((amount = sc.nextLong()) > 0){
            System.out.println(payment(amount, currency));
        }
    }

    public static String payment(long amount, long[] currency){
        String res = "";
        for (int i = 0; i < currency.length; i++){
            long tmp;
            tmp = amount/currency[i];
            amount -= currency[i]*tmp;
            res += tmp + " ";
        }
        return res;
    }
}
